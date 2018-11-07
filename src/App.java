import javax.swing.*;

public class App extends JFrame {
    ScreenPro screenPro;
    public App(int width, int height, int res) {
        setSize(width, height);
        this.screenPro = new ScreenPro(width, height,width > height ? width/res : height/res);
        screenPro.addKeyListener(screenPro);
        screenPro.addMouseListener(screenPro);
        add(screenPro);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
