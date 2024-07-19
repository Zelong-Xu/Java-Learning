package Fish;

import java.awt.*;
public class EnermyFish {
    Image img;
    int x;
    int y;
    int width;
    int height;
    int speed;
    int direction = 1;
    int type;
    int count;

    public void paintSelf(Graphics g){
        g.drawImage(img, x, y, width, height, null);
    }

    public Rectangle getRect(){
        return new Rectangle(x, y, width, height);
    }
}

class EnermyFish1_L extends EnermyFish{
    EnermyFish1_L(){
        this.x =-45;
        this.y = (int)(Math.random()*700+100);
        this.width = 60;
        this.height = 45;
        this.speed = 10;
        this.count = 2;
        this.type = 1;
        this.img = GameUtils.enermyFish1_L;
    }
}

class EnermyFish1_R extends EnermyFish1_L{
    EnermyFish1_R(){
        this.x =1400;
        direction = -1;
        this.img = GameUtils.enermyFish1_R;

    }
}

class EnermyFish2_L extends EnermyFish{
    EnermyFish2_L(){
        this.x =-45;
        this.y = (int)(Math.random()*700+100);
        this.width = 80;
        this.height = 60;
        this.speed = 13;
        this.count = 3;
        this.type = 2;
        this.img = GameUtils.enermyFish2_L;
    }
}   

class EnermyFish2_R extends EnermyFish2_L{
    EnermyFish2_R(){
        this.x =1400;
        direction = -1;
        this.img = GameUtils.enermyFish2_R;

    }
}

class EnermyFish3_L extends EnermyFish{
    EnermyFish3_L(){
        this.x =-45;
        this.y = (int)(Math.random()*700+100);
        this.width = 100;
        this.height = 80;
        this.speed = 15;
        this.count = 5;
        this.type = 3;
        this.img = GameUtils.enermyFish3_L;
    }
}

class EnermyFish3_R extends EnermyFish3_L{
    EnermyFish3_R(){
        this.x =1400;
        direction = -1;
        this.img = GameUtils.enermyFish3_R;

    }
}