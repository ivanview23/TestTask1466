package petroGm.parser;

import petroGm.exeption.InvalidDataSource;
import petroGm.factory.FigureFactory;
import petroGm.models.Figure;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParserFigure {

    private FigureFactory figureFactory;
    private List<Figure> figureList;

    public ParserFigure() {
        this.figureFactory = new FigureFactory();
        this.figureList = new ArrayList<>();
    }

    public List<Figure> perform() {
        InputStream inputStream = getClass().getResourceAsStream("/Figure.txt");
        if (inputStream == null) {
            System.out.println("The file was not found");
            return null;
        }
        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arg = line.split(" ");
                String figureType = arg[0];
                List<Float> parameters = new ArrayList<>();
                for (int i = 1; i < arg.length; i++) {
                    parameters.add(Float.parseFloat(arg[i]));
                }
                try {
                    Figure figure = figureFactory.createFigure(figureType, parameters);
                    figureList.add(figure);
                } catch (InvalidDataSource e) {
                    System.out.println(e.getMessage());
                }
            }
            return figureList;
        }

    }
}