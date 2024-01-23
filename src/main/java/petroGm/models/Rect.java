package petroGm.models;

import java.util.Objects;

public class Rect implements Figure {
    private final float x1;
    private final float y1;
    private final float x2;
    private final float y2;
    private final boolean perimeter = true;
    private final boolean square = true;

    public Rect(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("rect at (" + this.x1 + ", " + this.y1 + "), (" + this.x2 + ", " + this.y2 + ")");
    }

    @Override
    public void perimeter() {
        float a, b;
        a = Math.abs(x1 - x2);
        b = Math.abs(y1 - y2);
        double perimeter = (a + b) * 2;
        System.out.println("rect perimeter = " + perimeter);
    }

    @Override
    public void square() {
        float a, b;
        a = Math.abs(x1 - x2);
        b = Math.abs(y1 - y2);
        double square = a * b;
        System.out.println("rect square = " + square);
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
        Rect rect = (Rect) f;
        return x1 == rect.x1 && y1 == rect.y1 && x2 == rect.x2 && y2 == rect.y2;
    }

    public float getX1() {
        return x1;
    }

    public float getY1() {
        return y1;
    }

    public float getX2() {
        return x2;
    }

    public float getY2() {
        return y2;
    }
}
