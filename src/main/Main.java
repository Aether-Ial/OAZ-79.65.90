package main;
import story.Chapter1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
import com.google.gson.Gson;
import lib.Line;
import java.io.InputStream;
import java.io.InputStreamReader;

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
    public static void main(String[] args) throws InterruptedException {
        new OpenImage("/assets/AE341.jpg");
        InputStream stream = Main.class.getResourceAsStream("/data/data.json");
        Line[] lines = new Gson().fromJson(new InputStreamReader(stream), Line[].class);

        for (Line l : lines) {
            System.out.println(l.text);
            if (l.delay > 0) {
                Thread.sleep(l.delay);
            }
        }
    }
}
