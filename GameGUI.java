package cwk4; 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * Provide a GUI interface for the space battle game
 * 
 * @author [Your Name]
 * @version [Date]
 */
public class GameGUI 
{
    private WIN game = new SpaceWars("Horatio"); // create a SpaceWars object
    private JFrame myFrame = new JFrame("Space Battle Game"); // create a JFrame object
    
    // create GUI components
    private JTextArea listing = new JTextArea();
    private JLabel codeLabel = new JLabel ();
    private JButton fightBtn = new JButton("Fight");
    private JPanel eastPanel = new JPanel();

    public GameGUI()
    {
        makeFrame();
        makeMenuBar(myFrame);
    }
    
    /**
     * Create the main frame's menu bar.
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the Game menu
        JMenu gameMenu = new JMenu("Game");
        menubar.add(gameMenu);
        
        // create "List All Forces" menu item
        JMenuItem listForcesItem = new JMenuItem("List All Forces");
        listForcesItem.addActionListener(new ListForcesHandler());
        gameMenu.add(listForcesItem);
        
        // create "Exit" menu item
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ExitHandler());
        gameMenu.add(exitItem);
    }
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {    
        myFrame.setLayout(new BorderLayout());
        myFrame.add(listing,BorderLayout.CENTER);
        listing.setVisible(false);
        myFrame.add(eastPanel, BorderLayout.EAST);
        
        // set panel layout and add components
        eastPanel.setLayout(new GridLayout(4,1));
        eastPanel.add(fightBtn);
        fightBtn.addActionListener(new FightBtnHandler());
        fightBtn.setVisible(true);
        
        // building is done - arrange the components and show        
        myFrame.pack();
        myFrame.setVisible(true);
    }
    
    /**
     * Handles "List All Forces" menu item click event.
     */
    private class ListForcesHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            listing.setVisible(true);
            String allForces = game.getAllForces();
            listing.setText(allForces);
        }
    }
    
    /**
     * Handles "Exit" menu item click event.
     */
    private class ExitHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            System.exit(0);
        }
    }
    
    /**
     * Handles "Fight" button click event.
     */
    private class FightBtnHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            int result = -1;
            String inputValue = JOptionPane.showInputDialog("Fight number ?: ");
            int fightNumber = Integer.parseInt(inputValue);
            result = game.doBattle(fightNumber);
            JOptionPane.showMessageDialog(myFrame, fighting(result));    
        }
    }
    
    /**
     * Returns a message string based on the fight result code.
     */
    private String fighting(int code)
    {
        switch (code)
        {
            case 0: return "Fight won"; 
            case 1: return "Fight lost as no suitable force available"; 
            case 2: return "Fight lost on battle strength, force destroyed";
            case 3: return "Fight lost and admiral completely defeated ";
            default: return
