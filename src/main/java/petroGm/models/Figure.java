package petroGm.models;

import petroGm.intersect.Intersect;

public interface Figure {
    void draw();
    void perimeter();
    void square();
    default void intersect(Figure figure) {
        Intersect.intersect(this, figure);
    }
    boolean getPerimeter();
    boolean getSquare();
}
