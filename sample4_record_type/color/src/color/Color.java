package color;

public record Color(int red, int green, int blue) {
    // Compact constructor - no parentheses
    public Color {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
            throw new IllegalArgumentException("Invalid color component");
        }
    }

    public static Color ofGrayscale(int gray) {
        return new Color(gray, gray, gray);
    }
}
