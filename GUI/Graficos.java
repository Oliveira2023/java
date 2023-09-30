public class Graficos {
    
    ...

    public void start(Stage janela){
        int dimx = 1000;
        int dimy = 440;
        barChart bar = new barChart<>(new CategoryAxis(), new NumberAxis());
        bar.setTitle("Relação de Vendas de Carros por Ano");
        XYChart.Series carro1 = new XYChart.Series();
        carro1.setName("Chevrolet Onix");
        carro1.getData().add(new XYChart.Data("2017", 188654));
        carro1.getData().add(new XYChart.Data("2018", 190000));
        carro1.getData().add(new XYChart.Data("2019", 200000));
        carro1.getData().add(new XYChart.Data("2020", 210000));

        XYChart.Series carro2 = new XYChart.Series();
        carro2.setName("Hyundai HB20");
        carro2.getData().add(new XYChart.Data("2017", 100000));
        carro2.getData().add(new XYChart.Data("2018", 110000));
        carro2.getData().add(new XYChart.Data("2019", 120000));
        carro2.getData().add(new XYChart.Data("2020", 130000));

        XYChart.Series carro3 = new XYChart.Series();
        carro3.setName("Ford Ka");
        carro3.getData().add(new XYChart.Data("2017", 200000));
        carro3.getData().add(new XYChart.Data("2018", 210000));
        carro3.getData().add(new XYChart.Data("2019", 220000));
        carro3.getData().add(new XYChart.Data("2020", 230000));

        bar.getData().addAll(carro1, carro2, carro3);
        bar.setPrefSize(dimx/2, dimy-20);
        PieChart graficoPizza = new PieChart();
        graficoPizza.setTitle("Relação de consumo Energia por dia");
        graficoPizza.getData().addAll(
            new PieChart.Data("Domingo", 18),
            new PieChart.Data("Segunda", 38),
            new PieChart.Data("Terça", 34),
            new PieChart.Data("Quarta", 35),
            new PieChart.Data("Quinta", 31),
            new PieChart.Data("Sexta", 36),
            new PieChart.Data("Sabado", 27)
        );
        graficoPizza.setPrefSize(dimx/2, dimy-20);
        Hbox hBox = new Hbox(bar, graficoPizza);
        Scene cena = new Scene(hBox, dimx, dimy);
        janela.setScene(cena);
        janela.show();
    }
}
