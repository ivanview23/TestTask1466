package petroGm.factory;

import petroGm.exeption.InvalidDataSource;
import petroGm.models.*;

import java.util.List;

public class FigureFactory {

    public Figure createFigure(String figureType, List<Float> parameters) throws InvalidDataSource {
        switch (figureType) {
            case "point":
                return createPoint(parameters);
            case "rect":
                return createRect(parameters);
            case "rhomb":
                return createRhomb(parameters);
            case "square":
                return createSquare(parameters);
            case "line":
                return createLine(parameters);
            case "circle":
                return createCircle(parameters);
            default:
                throw new InvalidDataSource("There is no such figure: " + figureType);
        }
    }

    private Point createPoint(List<Float> parameters) throws InvalidDataSource {
        if (parameters.size() != 2) {
            throw new InvalidDataSource("invalid parameters this figure");
        }
        return new Point(parameters.get(0), parameters.get(1));
    }

    private Rect createRect(List<Float> parameters) throws InvalidDataSource {
        if (parameters.size() != 4) {
            throw new InvalidDataSource("invalid parameters this figure");
        }
        return new Rect(parameters.get(0), parameters.get(1), parameters.get(2), parameters.get(3));
    }

    private Rhomb createRhomb(List<Float> parameters) throws InvalidDataSource {
        if (parameters.size() != 4) {
            throw new InvalidDataSource("invalid parameters this figure");
        }
        return new Rhomb(parameters.get(0), parameters.get(1), parameters.get(2), parameters.get(3));
    }

    private Square createSquare(List<Float> parameters) throws InvalidDataSource {
        if (parameters.size() != 3) {
            throw new InvalidDataSource("invalid parameters this figure");
        }
        return new Square(parameters.get(0), parameters.get(1), parameters.get(2));
    }

    private Line createLine(List<Float> parameters) throws InvalidDataSource {
        if (parameters.size() != 4) {
            throw new InvalidDataSource("invalid parameters this figure");
        }
        return new Line(parameters.get(0), parameters.get(1), parameters.get(2), parameters.get(3));
    }

    private Circle createCircle(List<Float> parameters) throws InvalidDataSource {
        if (parameters.size() != 3) {
            throw new InvalidDataSource("invalid parameters this figure");
        }
        return new Circle(parameters.get(0), parameters.get(1), parameters.get(2));
    }







}


