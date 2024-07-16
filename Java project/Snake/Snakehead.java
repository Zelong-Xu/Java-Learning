package Snake;

import java.awt.*;

public class Snakehead extends Snake{
    private String direction = "right";

    public String getDirection(){
        return direction;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

    public Snakehead(Image img, int x, int y, GameWindow gameWin){
        super(img, x, y, gameWin);
    }

    public void move(){
        if(direction.equals("up")){
            y -= 30;
        }else if(direction.equals("down")){
            y += 30;
        }else if(direction.equals("left")){
            x -= 30;
        }else if(direction.equals("right")){
            x += 30;
        }
    }
    public void Draw(Graphics g){
        super.draw(g);
        move();
    }
}
