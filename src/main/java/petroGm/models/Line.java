package petroGm.models;

import java.util.Objects;

public class Line implements Figure {

    private final float x1;
    private final float y1;
    private final float x2;
    private final float y2;
    private final boolean perimeter = true;
    private final boolean square = false;

    public Line(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("line at (" + this.x1 + ", " + this.y1 + "), (" + this.x2 + ", " + this.y2 + ")");
    }

    @Override
    public void perimeter() {
        System.out.println("line perimeter = " + counting());
    }

    public float counting() {
        float a, b;
        a = Math.abs(x1 - x2);
        b = Math.abs(y1 - y2);
        double perimeter = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return (float) perimeter;
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

    @Override
    public void square() {}

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
        Line line = (Line) f;
        return x1 == line.x1 && y1 == line.y1 && x2 == line.x2 && y2 == line.y2;
    }
}
