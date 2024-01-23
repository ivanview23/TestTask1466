package petroGm.models;

public class Rhomb implements Figure {

    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Rhomb(int x, int y, int height, int width) {
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

    }

    @Override
    public void square() {

    }

    @Override
    public void intersect() {

    }

}
