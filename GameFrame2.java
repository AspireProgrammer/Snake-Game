
import javax.swing.JFrame;

public class GameFrame2 extends JFrame {
    GameFrame2() {

        this.add(new GamePanel2());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        // set the window in the center of computer
        this.setLocationRelativeTo(null);

    }
}


