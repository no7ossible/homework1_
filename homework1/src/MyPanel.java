//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

    public class MyPanel extends JPanel {
        int xBall = 470;
        int yBall = 0;
        int xGate = 450;
        int yGate = 620;

        public MyPanel() {
        }

        public void paint(Graphics g) {
            super.paint(g);

            try {
                File filegateImage = new File("images/gateImage.jpeg");
                Image gateImage = ImageIO.read(filegateImage);
                gateImage = gateImage.getScaledInstance(100, 100, 4);
                g.drawImage(gateImage, this.xGate, this.yGate, (ImageObserver)null);
                File fileballImage = new File("images/ballImage.png");
                Image ballImage = ImageIO.read(fileballImage);
                ballImage = ballImage.getScaledInstance(50, 50, 4);
                this.yBall += 10;
                if (this.yBall + 1 < this.yGate) {
                    g.drawImage(ballImage, this.xBall, this.yBall, (ImageObserver)null);
                }
            } catch (Exception var7) {
                System.out.println("Ой картинки нет :)");
            }

            try {
                Thread.sleep(100L);
            } catch (Exception var6) {
                System.out.println("Что-то случилось со временем :)");
            }

            this.repaint();
        }
    }


