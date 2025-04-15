package color;

public class Main {
    public static void main(String[] args) {
        Color red = new Color(255, 0, 0);
        Color gray = Color.ofGrayscale(128);
        System.out.println(red); // Output: Color[red=255, green=0, blue=0]
        System.out.println(gray); // Output: Color[red=128, green=128, blue=128]

        // Color invalid = new Color(300, 0, 0); // Throws IllegalArgumentException
    }
}
