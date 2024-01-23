package petroGm.models;

public class Square implements Figure {

    private final float x;
    private final float y;
    private final float length;
    private final boolean perimeter = true;
    private final boolean square = true;

    public Square(float x, float y, float length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("square at (" + this.x + ", " + this.y + "), length = " + this.length);
    }

    @Override
    public void perimeter() {
        double perimeter = length * 4;
        System.out.println("square perimeter = " + perimeter);
    }

    @Override
    public void square() {
        double square = Math.pow(length, 2);
        System.out.println("square area = " + square);
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
        Square square = (Square) f;
        return x == square.x && y == square.y && length == square.length;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getLength() {
        return length;
    }
}
