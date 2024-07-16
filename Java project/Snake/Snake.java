package Snake;
import java.awt.*;

public class Snake {
    Image img;
    
    int x;
    int y;

    int width = 30;
    int height = 30;

    GameWindow gameWin;

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }   

    public void setWidth(int width) {
        this.width = width;
    }   

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public GameWindow getGameWin() {
        return gameWin;
    }

    public void setGameWin(GameWindow gameWin) {
        this.gameWin = gameWin;
    }

    public Snake(Image img, int x, int y, int width, int height, GameWindow gameWin) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.gameWin = gameWin;
    }

    public Snake(Image img, int x, int y, GameWindow gameWin) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.gameWin = gameWin;
    }

    public void draw(Graphics g){
        g.drawImage(img, x, y, width, height, gameWin);
    }
}
