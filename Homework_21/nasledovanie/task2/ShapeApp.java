package nasledovanie.task2;


    public class ShapeApp {
        public static void main(String[] args) {
            Circle circle = new Circle(5);
            System.out.println("Area of circle: " + circle.calculateArea());

            Rectangle rectangle = new Rectangle(4, 6);
            System.out.println("Area of rectangle: " + rectangle.calculateArea());

            Triangle triangle = new Triangle(3, 4);
            System.out.println("Area of triangle: " + triangle.calculateArea());
        }
    }
