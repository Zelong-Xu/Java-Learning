package Snake;
import javax.swing.JFrame;
import java.awt.*;
import java.lang.Thread;


public class GameWindow extends JFrame{

    Snakehead snakehead = new Snakehead(Utils.rightheadImg, 30, 300, this);
    public void launch(){
        this.setVisible(true);
        this.setSize( 900, 900);
        this.setLocationRelativeTo(null);
        this.setTitle("The Sneak Game");

        while (true){
            repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(0, 0, 900, 900);

        g.setColor(Color.black);
        for(int i = 0; i <= 30; i++){
            g.drawLine(0, 30 * i, 900, 30 * i);
            g.drawLine(30 * i, 0, 30*i, 900);
        }

        snakehead.draw(g);
    }

    public static void main(String[] args) {
        GameWindow gameWin = new GameWindow();
        gameWin.launch();
    }


}