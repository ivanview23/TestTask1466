package petroGm.models;

public class Circle implements Figure {

    private final float x;
    private final float y;
    private final float radius;
    private final boolean perimeter = true;
    private final boolean square = true;

    public Circle(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("circle at (" + this.x + ", " + this.y + "), rаdius = " + this.radius);
    }

    @Override
    public void perimeter() {
        double perimeter = Math.PI * radius * 2;
        System.out.println("circle perimeter = " + perimeter);
    }

    @Override
    public void square() {
        double square = Math.PI * Math.pow(radius, 2);
        System.out.println("circle square = " + square);
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
        Circle circle = (Circle) f;
        return x == circle.x && y == circle.y && radius == circle.radius;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getRadius() {
        return radius;
    }
}
