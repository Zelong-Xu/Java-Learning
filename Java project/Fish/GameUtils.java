package Fish;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameUtils {

    static boolean Up = false;
    static boolean Down = false;
    static boolean Left = false;
    static boolean Right = false;

    static int count = 0;

    static int level = 0;

    public static List<EnermyFish> enermyFishes = new ArrayList<>();

    public static Image bgimg = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\Background.jpg");

    public static Image enermyFish1_L = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\EnermyFish1_L.png");
    public static Image enermyFish1_R = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\EnermyFish1_R.png");
    
    public static Image enermyFish2_L = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\EnermyFish2_L.png");
    public static Image enermyFish2_R = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\EnermyFish2_R.png");
    
    public static Image enermyFish3_L = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\EnermyFish3_L.png");
    public static Image enermyFish3_R = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\EnermyFish3_R.png");
    
    public static Image MyFish_L = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\MyFish_L.png");
    public static Image MyFish_R = Toolkit.getDefaultToolkit().createImage("C:\\Users\\User\\Desktop\\Java-Learning\\Java project\\Fish\\MyFish_R.png");

    public static void drawWord(Graphics g, String str, Color color, int x, int y, int size){
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, size));
        g.drawString(str, x, y);
    }

}
