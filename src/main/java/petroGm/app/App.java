package petroGm.app;


import petroGm.models.Figure;
import petroGm.parser.ParserFigure;

import java.util.List;

public class App {

    public static List<Figure> figureList;
    public static void main( String[] args ){

        ParserFigure parserFigure = new ParserFigure();
        figureList = parserFigure.perform();

        for (int i = 0; i < figureList.size(); i += 2) {
            Figure figure = figureList.get(i);
            figure.draw();
            if(figure.getPerimeter()) {
                figure.perimeter();
            }
            if (figure.getSquare()) {
                figure.square();
            }
            if (i < figureList.size() - 1) {
                Figure figurePrev = figureList.get(i + 1);
                figurePrev.draw();
                if (figurePrev.getPerimeter()) {
                    figurePrev.perimeter();
                }
                if (figurePrev.getSquare()) {
                    figurePrev.square();
                }
                figurePrev.intersect(figure);
            }
        }
    }
}
