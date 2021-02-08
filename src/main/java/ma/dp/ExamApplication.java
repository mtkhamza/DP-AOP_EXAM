package ma.dp;

import ma.dp.Observable.Observable;
import ma.dp.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(Dessin dessin){
        return args ->{
            Figure c = new Circle(new Point(1, 1), 3);
            dessin.addFigure(c);
            Observable o = new Parametrage(1, 1, 1);
            o.subscribe(c);
            dessin.showFigures();
            ((Parametrage) o).setCouleurContour(4);
        };

    }
}
