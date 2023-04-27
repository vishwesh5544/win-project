public class InputHandler implements KeyListener {
    private Map<Integer, Boolean> keys;

    public InputHandler() {
        keys = new HashMap<>();
    }

    public boolean isKeyPressed(int keyCode) {
        Boolean value = keys.get(keyCode);
        return value != null && value;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys.put(e.getKeyCode(), true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys.put(e.getKeyCode(), false);
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}
