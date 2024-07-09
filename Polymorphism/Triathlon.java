package Polymorphism;

public class Triathlon {
    public void go(){
        System.out.println("Go!");
    }
    public static void main(String[] args){
        Swim swim = new Swim();
        Run run = new Run();
        Bicycle bicycle = new Bicycle();

        Triathlon[] athletes = {swim, run, bicycle};

        for(Triathlon x : athletes){
            x.go();
        }
    }
}
