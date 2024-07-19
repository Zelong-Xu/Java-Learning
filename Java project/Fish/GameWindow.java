package Fish;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameWindow extends JFrame {
    
    static int state = 0;

    Image offScreenImage;
    
    int width = 1440;
    int height = 900;

    double random;

    int time = 0;

    Bg bg = new Bg();

    EnermyFish enermyFish = new EnermyFish();

    MyFish myFish = new MyFish();

    public void launch(){

        this.setSize(width, height);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("The Fish Game");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton()==1&&state==0){
                    state = 1;
                    repaint();
                }
                if(e.getButton()==1&&state==2||state==3){
                    restart();
                    state = 1;
                }
            }
        });

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                //W = 87, A = 65, S = 83, D = 68
                if(e.getKeyCode()==87){
                    GameUtils.Up = true;
                }
                if(e.getKeyCode()==83){
                    GameUtils.Down = true;
                }
                if(e.getKeyCode()==65){
                    GameUtils.Left = true;
                }
                if(e.getKeyCode()==68){
                    GameUtils.Right = true;
                }
                if(e.getKeyCode()==32){
                    switch(state){
                        case 1:
                            state = 4;
                            GameUtils.drawWord(getGraphics(),"Pause", Color.red, 700, 500, 80);
                            break;
                        case 4:
                            state = 1;
                            break;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e){
                super.keyReleased(e);
                if(e.getKeyCode()==87){
                    GameUtils.Up = false;
                }
                if(e.getKeyCode()==83){
                    GameUtils.Down = false;
                }
                if(e.getKeyCode()==65){
                    GameUtils.Left = false;
                }
                if(e.getKeyCode()==68){
                    GameUtils.Right = false;
                }

            }
        });
        



        while(true){
            repaint();
            time++;
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawImage(GameUtils.bgimg, 0, 0, width, height, null);
        offScreenImage = createImage(width, height);
        Graphics gImage = offScreenImage.getGraphics();
        bg.paintSelf(gImage, myFish.level);

        switch(state){
            case 0:
                break;
            case 1:
                myFish.paintSelf(gImage);
                logic();
                enermyFish.x += enermyFish.speed;
                for(EnermyFish enermyFish: GameUtils.enermyFishes){
                    enermyFish.paintSelf(gImage);
                }
                break;

            case 2:
                break;

            case 3:
                myFish.paintSelf(gImage);
                break;

            case 4:
                return;
                default:
            
        }
        g.drawImage(offScreenImage, 0, 0, width, height, null);
    }

    void logic(){
        //Level control
        if(GameUtils.count<10){
            GameUtils.level = 0;
            myFish.level = 1;
        }else if(GameUtils.count<20){
            GameUtils.level = 1;
        }else if(GameUtils.count<50){
            GameUtils.level = 2;
            myFish.level = 2;
        }else if(GameUtils.count<750){
            GameUtils.level = 3;
            myFish.level = 3;
        }else if(GameUtils.count>120){
            state = 3;
        }
        //Fish number control
        random = Math.random();
        switch (GameUtils.level) {
            case 2:
                if(time%30==0){
                    if(random > 0.5){
                        enermyFish = new EnermyFish3_L();
                    }else{
                        enermyFish = new EnermyFish3_R();
                    }
                GameUtils.enermyFishes.add(enermyFish);
                }
                break;
            case 1:
                if(time%20==0){
                    if(random > 0.5){
                        enermyFish = new EnermyFish2_L();
                    }else{
                        enermyFish = new EnermyFish2_R();
                    }
                GameUtils.enermyFishes.add(enermyFish);
                }
                break;
            case 0:
            if(time%10==0){
                if(random > 0.5){
                    enermyFish = new EnermyFish1_L();
                }else{
                    enermyFish = new EnermyFish1_R();
                }
            GameUtils.enermyFishes.add(enermyFish);
            } 
            break;
            default:
        }
        //Fish movement and speed control
        for(EnermyFish enermyFish: GameUtils.enermyFishes){
                enermyFish.x = enermyFish.x + enermyFish.direction * enermyFish.speed;   
                //Fish collision detection
                if (myFish.getRect().intersects(enermyFish.getRect())){
                    if(myFish.level>=enermyFish.type){
                    enermyFish.x = - 200;
                    enermyFish.y = - 200;
                    GameUtils.count = GameUtils.count + enermyFish.count;
                }else{
                    state = 2;

                }
                
                }

        }
    }

    void restart(){
        GameUtils.count = 0;
        GameUtils.level = 0;
        GameUtils.enermyFishes.clear();
        myFish.x = 700;
        myFish.y = 450;
        myFish.level = 1;
        state = 0;
    }


    public static void main(String[] args){
        GameWindow gameWin = new GameWindow();
        gameWin.launch();
    }
    
}
