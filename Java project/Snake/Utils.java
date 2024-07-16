package Snake;

import java.awt.*;

public class Utils {
    public static Image upheadImg = Toolkit.getDefaultToolkit().getImage("/Snake/up-head.png");
    public static Image downheadImg = Toolkit.getDefaultToolkit().getImage("/Snake/down-head.png");
    public static Image leftheadImg = Toolkit.getDefaultToolkit().getImage("/Snake/left-head.png");
    public static Image rightheadImg = Toolkit.getDefaultToolkit().getImage("/right-head.png");
    public static Image bodyImg = Toolkit.getDefaultToolkit().getImage("/Snake/body.png");
    public static Image foodImg = Toolkit.getDefaultToolkit().getImage("/Snake/food.png");

    public static void write(Graphics g, String str, int x, int y){
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.blue);
        g.drawString(str, x, y);
    }
}
