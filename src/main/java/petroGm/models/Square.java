package petroGm.models;

public class Square implements Figure {


    private final int x;
    private final int y;
    private final int length;

    public Square(int x, int y, int length) {
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

    }

    @Override
    public void square() {

    }

    @Override
    public void intersect() {

    }
}
