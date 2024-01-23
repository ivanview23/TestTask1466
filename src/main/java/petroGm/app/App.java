package petroGm.app;


import petroGm.models.Figure;
import petroGm.parser.ParserFigure;

import java.util.List;

public class App {

    public static List<Figure> figureList;
    public static void main( String[] args ){

        ParserFigure parserFigure = new ParserFigure();
        figureList = parserFigure.perform();

        for (Figure figure: figureList) {
            figure.draw();
        }





    }
}
