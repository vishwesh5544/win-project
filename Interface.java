import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameInterface extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GameInterface frame = new GameInterface();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public GameInterface() {
        setTitle("My Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblWelcomeToMy = new JLabel("Welcome to My Game");
        lblWelcomeToMy.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToMy.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblWelcomeToMy.setBounds(10, 11, 414, 31);
        contentPane.add(lblWelcomeToMy);

        JButton btnStartGame = new JButton("Start Game");
        btnStartGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // TODO: Start game logic here
            }
        });
        btnStartGame.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnStartGame.setBounds(162, 74, 125, 31);
        contentPane.add(btnStartGame);

        JButton btnQuitGame = new JButton("Quit Game");
        btnQuitGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        btnQuitGame.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnQuitGame.setBounds(162, 116, 125, 31);
        contentPane.add(btnQuitGame);

        JLabel lblCreatedByMe = new JLabel("Created by Me");
        lblCreatedByMe.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCreatedByMe.setBounds(10, 239, 106, 14);
        contentPane.add(lblCreatedByMe);
    }
}
