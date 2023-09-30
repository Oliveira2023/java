import java.awt.Color;

public class FormasGeometricas {
    ...

    public void start(Stage janela){
        Retangle retangulo = new Retangle();
        retangulo.setTranslateX(10);
        retangulo.setTranslateY(10);
        retangulo.setFill(Color.RED);

        Circle circulo = new Circle(50);
        circulo.setTranslateX(170);
        circulo.setTranslateY(60);
        circulo.setFill(Color.GREEN);

        Circle circunferencia = new Circle(50);
        circunferencia.setTranslateX(10);
        circunferencia.setTranslateY(170);
        circunferencia.setFill(Color.WHITE);
        circunferencia.setStroke(Color.BLUE);
        circunferencia.setStrokeWidth(3.0);

        Ellipse elipse = new Ellipse(50, 25);
        elipse.setTranslateX(390);
        elipse.setTranslateY(60);
        elipse.setFill(Color.YELLOW);

        Line linha = new Line(10.0f, 10.0f, 100.0f, 100.0f);
        linha.setTranslateX(450);
        linha.setTranslateY(10);
        linha.setStroke(Color.GREEYELLOW);
        linha.setStrokeWidth(3.0);

        Polygon poligono = new Polygon();
        poligono.getPoints().addAll(new Double[]{
            0.0, 0.0,
            100.0, 0.0,
            50.0, 100.0,
        });
        poligono.setTranslateX(550);
        poligono.setTranslateY(10);
        poligono.setFill(Color.SKYBLUE);

        Polyline polilinha = new Polyline();
        polilinha.getPoints().addAll(new Double[]{
            0.0, 0.0,
            100.0, 0.0,
            0.0, 100.0,
            100.0, 100.0
        });
        polilinha.setTranslateX(670);
        polilinha.setTranslateY(10);
        polilinha.setStroke(Color.BLACK);
        polilinha.setStrokeWidth(3.0);

        grupo.getChildren().addAll(retangulo, circulo, circunferencia, elipse, linha, poligono, polilinha);
        Scene cena = new Scene(grupo, 800, 120);
        janela.setScene(cena);
        janela.show();
    }
}
