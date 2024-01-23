package petroGm.models;

public class Circle implements Figure {

    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius) {
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

    }

    @Override
    public void square() {

    }

    @Override
    public void intersect() {

    }
}
