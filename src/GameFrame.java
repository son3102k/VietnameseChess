import javax.swing.JFrame;

public class GameFrame extends JFrame {
    private GamePanel gamepanel;
    public GameFrame(){
        gamepanel = new GamePanel(720,720);
        add(gamepanel);
        setTitle("Co ganh");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 720);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        new GameFrame();
    }
}
