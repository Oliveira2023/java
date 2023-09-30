public class AppFibonacci {
    import javax.swing.text.html.ImageView;

import javafx.application.Application;
    import javafx.event.ActionEvent;
    import javafx.event.EventHandler;
    import javafx.geometry.Insets;
    import javafx.geometry.Pos;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.Label;
    import javafx.scene.control.TextArea;
    import javafx.scene.control.TextField;
    import javafx.scene.layout.Vbox;
    import javafx.scene.text.Font;
    import javafx.stage.Stage;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage janela) {
        Label label = new Label("Calcula Fibonacci");
        lbl.setTextFill(Color.DARKGREEN);
        lbl.setFont(Font.font("Serif", 25));
        TextField numField = new TextField();
        ImageView imgBtn = new ImageView(new Image(getClass().getResourceAsStream("recursos/icones/mission.png")));
        Button btn = new Button("Calcular", imgBtn);
        TextArea txtArea = new TextArea();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    int num = Integer.parseInt(numField.getText());
                    if (num > 1 && num < 42){
                        String resultado = String.format("Fibonacci(%d) = %d\n", num, fibonacci(num));
                        txtArea.setText(resultado);
                    }else if(num < 1){
                        String msg = String.format("O número deve ser <= 1\n");
                        txtArea.appendText(msg);
                    }else if(num > 42){
                        String msg = String.format("O número deve ser <= 42\n");
                        txtArea.appendText(msg);
                    }
                } catch(Exception e){
                String msg = String format("O número deve ser inteiro\n");
                txtArea.appendText(msg);  
                }
            }
        });
        Vbox vBox = new Vbox(lbl, numField, btn, txtArea);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setStyle("-fx-background-color: #BBDDFF");
        Scene cena = new Scene(vBox, 400, 300);
        janela.setTitle("Aplicação calcula Fibonacci");
        janela.setScene(cena);
        janela.show();
    }
    public long fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
