package ma.dp.entities;

import ma.dp.Strategy.IStrategyTraiter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Dessin {

    List<Figure> list = new ArrayList<>();

    private IStrategyTraiter iStrategyTraiter;

    public void addFigure(Figure f){
        System.out.println("Adding  figure ...");
        list.add(f);
    }
    public void removeFigure(Figure f){
        System.out.println("Removing Figure ...");
        list.add(f);
    }
    public void showFigures(){
        for (Figure f : list) {
            f.draw();
        }
    }

}
