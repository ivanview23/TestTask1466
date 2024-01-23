package petroGm.intersect;

import petroGm.models.*;

import java.util.ArrayList;
import java.util.List;

public class Intersect {
    public static void intersect(Figure figure, Figure figure2) {
        if (figure.getClass() == figure2.getClass()) {
            if (figure.equals(figure2)) {
                System.out.println("figure " + figure.getClass().getSimpleName() + " equals\n");
                return;
            }
            intersectMatchFigure(figure, figure2);
        }
    }

    public static void intersectMatchFigure(Figure figure, Figure figure2) {
        switch (figure.getClass().getSimpleName()) {
            case "Point":
                intersectPoint();
                break;
            case "Line":
                intersectLine((Line) figure, (Line) figure2);
                break;
            case "Rect":
                intersectRect((Rect) figure, (Rect) figure2);
                break;
            case "Square":
                intersectSquare((Square) figure, (Square) figure2);
                break;
            case "Rhomb":
                intersectRhomb((Rhomb) figure, (Rhomb) figure2);
                break;
            case "Circle":
                intersectCircle((Circle) figure, (Circle) figure2);
                break;
            default:
                break;
        }
    }

    public static void intersectPoint() {
        System.out.println("points not intersect\n");
    }

    public static void intersectLine(Line line, Line line2) {
        if (checkLineIntersect(line, line2)) {
            System.out.println("lines intersect\n");
        } else {
            System.out.println("lines not intersect\n");
        }
    }

    public static void intersectRect(Rect rect, Rect rect2) {
        List<Line> linesRect = listLineRectCreate(rect);
        List<Line> linesRect2 = listLineRectCreate(rect2);

        for (Line line: linesRect) {
            for (Line line2: linesRect2) {
                if(checkLineIntersect(line, line2)) {
                    System.out.println("rects intersect\n");
                    return;
                }
            }
        }
        System.out.println("rects not intersect\n");
    }

    public static void intersectSquare(Square square, Square square2) {
        List<Line> linesSquare = listLineSquareCreate(square);
        List<Line> linesSquare2 = listLineSquareCreate(square2);

        for (Line line: linesSquare) {
            for (Line line2: linesSquare2) {
                if(checkLineIntersect(line, line2)) {
                    System.out.println("squares intersect\n");
                    return;
                }
            }
        }
        System.out.println("squares not intersect\n");
    }

    public static void intersectRhomb(Rhomb rhomb, Rhomb rhomb2) {
        List<Line> linesRhomb = listLineRhombCreate(rhomb);
        List<Line> linesRhomb2 = listLineRhombCreate(rhomb2);

        for (Line line: linesRhomb) {
            for (Line line2: linesRhomb2) {
                if(checkLineIntersect(line, line2)) {
                    System.out.println("rhombs intersect\n");
                    return;
                }
            }
        }
        System.out.println("rhombs not intersect\n");
    }

    public static void intersectCircle(Circle circle, Circle circle2) {
        Line line = new Line(circle.getX(), circle.getY(), circle2.getX(), circle2.getY());
        float sumRadius = circle.getRadius() + circle2.getRadius();
        float distance = line.counting();
        if (distance <= sumRadius) {
            System.out.println("circles intersect\n");
        } else {
            System.out.println("circles not intersect\n");
        }
    }

    public static boolean checkLineIntersect(Line line, Line line2) {

        float x1 = line.getX1();
        float y1 = line.getY1();
        float x2 = line.getX2();
        float y2 = line.getY2();

        float x3 = line2.getX1();
        float y3 = line2.getY1();
        float x4 = line2.getX2();
        float y4 = line2.getY2();

        float n;
        if (y2 - y1 != 0) {
            float q = (x2 - x1) / (y1 - y2);
            float sn = (x3 - x4) + (y3 - y4) * q;
            if (sn == 0) {
                return false;
            }
            float fn = (x3 - x1) + (y3 - y1) * q;
            n = fn / sn;
        } else {
            if ((y3 - y4) == 0) {
                return false;
            }
            n = (y3 - y1) / (y3 - y4);
        }
        float dotX = x3 + (x4 - x3) * n;
        float dotY = y3 + (y4 - y3) * n;

        if (dotX <= Math.max(x1, x2) && dotX >= Math.min(x1, x2)
                && dotY <= Math.max(y1, y2) && dotY >= Math.min(y1, y2)
                && dotX <= Math.max(x3, x4) && dotX >= Math.min(x3, x4)
                && dotY <= Math.max(y3, y4) && dotY >= Math.min(y3, y4)) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Line> listLineRectCreate(Rect rect) {
        List<Line> linesRect = new ArrayList<>();
        linesRect.add(new Line(rect.getX1(), rect.getY1(), rect.getX2(), rect.getY1()));
        linesRect.add(new Line(rect.getX1(), rect.getY1(), rect.getX1(), rect.getY2()));
        linesRect.add(new Line(rect.getX2(), rect.getY2(), rect.getX2(), rect.getY1()));
        linesRect.add(new Line(rect.getX2(), rect.getY2(), rect.getX1(), rect.getY2()));
        return linesRect;
    }

    public static List<Line> listLineSquareCreate(Square square) {
        List<Line> linesSquare = new ArrayList<>();
        float l = (square.getLength() / 2);
        linesSquare.add(new Line(square.getX() - l, square.getY() - l,
                square.getX() - l, square.getY() + l));
        linesSquare.add(new Line(square.getX() - l, square.getY() - l,
                square.getX() + l, square.getY() - l));
        linesSquare.add(new Line(square.getX() + l, square.getY() + l,
                square.getX() - l, square.getY() + l));
        linesSquare.add(new Line(square.getX() + l, square.getY() + l,
                square.getX() + l, square.getY() - l));
        return linesSquare;
    }

    public static List<Line> listLineRhombCreate(Rhomb rhomb) {
        List<Line> linesRhomb = new ArrayList<>();
        float h = (rhomb.getHeight() / 2);
        float w = (rhomb.getWidth() / 2);
        linesRhomb.add(new Line(rhomb.getX(), rhomb.getY() - w,
                rhomb.getX() + h, rhomb.getY()));
        linesRhomb.add(new Line(rhomb.getX() + h, rhomb.getY(),
                rhomb.getX(), rhomb.getY() + w));
        linesRhomb.add(new Line(rhomb.getX(), rhomb.getY() + w,
                rhomb.getX() - h, rhomb.getY()));
        linesRhomb.add(new Line(rhomb.getX() - h, rhomb.getY(),
                rhomb.getX(), rhomb.getY() - w));
        return linesRhomb;
    }

}

