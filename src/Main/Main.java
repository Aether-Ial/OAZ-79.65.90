package Main;
import story.Chapter1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;

class OpenImage extends JFrame {
    public OpenImage(String imagePath) {
        java.net.URL url = OpenImage.class.getResource(imagePath);
        if (url == null) {
            throw new RuntimeException("Could not find: " + imagePath);
        }
        Image image = new ImageIcon(url).getImage();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        this.getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
public class Main {
    public static void main (String [] args) throws InterruptedException {
        new OpenImage("/Assets/AE341.jpg");
        Chapter1.choiceOne();
    }
}
