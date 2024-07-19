package Fish;

import java.awt.*;

public class Bg {
    int width = 1440;
    int height = 900;
    void paintSelf(Graphics g, int fishlevel){
        g.drawImage(GameUtils.bgimg, 0, 0, width, height,  null);
        switch (GameWindow.state) {
            case 0:
                GameUtils.drawWord(g, "Press LMB to start", Color.red,600, 400, 30);
                break;
            case 1:
                GameUtils.drawWord(g, "Level: " + GameUtils.level, Color.orange, 10, 60, 30);
                GameUtils.drawWord(g, "Score: " + GameUtils.count, Color.orange, 10, 90, 30);
                GameUtils.drawWord(g, "Fish Level: " + fishlevel, Color.orange, 10, 120, 30);
                break;
            case 2:               
                GameUtils.drawWord(g, "Game Over~", Color.red, 700, 500, 80);
                GameUtils.drawWord(g, "Level: " + GameUtils.level, Color.orange, 10, 60, 30);
                GameUtils.drawWord(g, "Score: " + GameUtils.count, Color.orange, 10, 90, 30);
                GameUtils.drawWord(g, "Fish Level: " + fishlevel, Color.orange, 10, 120, 30);
                break;
            case 3:
                GameUtils.drawWord(g, "You win~", Color.red, 700, 500, 80);
                GameUtils.drawWord(g, "Level: " + GameUtils.level, Color.orange, 10, 60, 30);
                GameUtils.drawWord(g, "Score: " + GameUtils.count, Color.orange, 10, 90, 30);
                GameUtils.drawWord(g, "Fish Level: " + fishlevel, Color.orange, 10, 120, 30);
                break;
            case 4:
                break;
            default:
                break;
        }
    }
}
