package point;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        System.out.println(p1); // Output: Point[x=10, y=20]
        System.out.println(p1.x()); // Output: 10
        System.out.println(p1.y()); // Output: 20
        System.out.println(p1.equals(p2)); // Output: true
    }

}
