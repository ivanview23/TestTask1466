package petroGm.models;

public class Rhomb implements Figure {

    private final float x;
    private final float y;
    private final float width;
    private final float height;
    private final boolean perimeter = true;
    private final boolean square = true;

    public Rhomb(float x, float y, float height, float width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("rhomb at (" + this.x + ", " + this.y + "), height = " + this.height + ", width = " + this.width);
    }

    @Override
    public void perimeter() {
        float a, b;
        a = (float) height / 2;
        b = (float) width / 2;
        double side = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = side * 4;
        System.out.println("rhomb perimeter = " + perimeter);
    }

    @Override
    public void square() {
        double square = (float) (height * width) / 2;
        System.out.println("rhomb square = " + square);
    }

    public boolean getPerimeter() {
        return perimeter;
    }

    public boolean getSquare() {
        return square;
    }

    @Override
    public boolean equals(Object f) {
        if (this == f) return true;
        if (f == null || this.getClass() != f.getClass()) return false;
        Rhomb rhomb = (Rhomb) f;
        return x == rhomb.x && y == rhomb.y && height == rhomb.height && width == rhomb.width;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
