package petroGm.models;

import java.util.Objects;

public class Point implements Figure {

    private final float x;
    private final float y;
    private final boolean perimeter = false;
    private final boolean square = false;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("point at (" + this.x + ", " + this.y + ")");
    }

    @Override
    public void perimeter() {}

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
        Point point = (Point) f;
        return x == point.x && y == point.y;
    }
}
