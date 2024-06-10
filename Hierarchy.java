import java.util.Scanner;

public class Hierarchy {
    
    public static class Circle{
        int radius;
        public Circle(int radius){
            this.radius = radius;
        }

        public double getArea(){
            return Math.PI * radius * radius;
        }   

        public double getCircumference(){
            return 2 * Math.PI * radius;
        }

    }

    public static class Rectangles{
        int width;
        int height;
        public Rectangles(int width, int height){
            this.width = width;
            this.height = height;
        }

        public int getArea(){
            return width * height;
        }

        public int getPerimeter(){
            return 2 * (width + height);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        Rectangles rectangle = new Rectangles(width, height);

        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circumference of the circle is: " + circle.getCircumference());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());

        scanner.close();
    }
}
