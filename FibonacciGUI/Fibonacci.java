import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
// import javafx.scene.layout.Vbox;

/**
 * JavaFX App
 */
public class Fibonacci extends Application {

    @Override
    public void start(Stage stage) {

        var label = new Label("Calcula Fibonacci");
        label.setTextFill(Color.DARKGREEN);
        label.setFont(Font.font("Serif", 25));
        

        TextField numField = new TextField();
        numField.setPromptText("Digite um número");
        numField.setMaxSize(100, 25);
        ImageView imgBtn = new ImageView(new Image(getClass()
                .getResourceAsStream("recursos/mission.png")));

        Button btn = new Button("Calcular", imgBtn);
        // btn.setAlignment(Pos.TOP_RIGHT);
        TextArea textArea = new TextArea();
        textArea.setMaxSize(325, 125);
        // textArea.setLayoutY(1350);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    int num = Integer.parseInt(numField.getText());
                    if (num >= 1 && num <= 42) {
                        String resultado = String.format(
                                "Fibonacci(%d) = %d\n", num, fibonacci(num));
                        textArea.appendText(resultado);
                    } else if (num < 1) {
                        String msg = String.format("O numero deve ser >= 1\n");
                        textArea.appendText(msg);
                    } else if (num > 42) {
                        String msg = String.format("Numero muito grande\n");
                        textArea.appendText(msg);
                    }
                } catch (Exception ex) {
                    String msg = String.format("Digite um número inteiro\n");
                    textArea.appendText(msg);
                }
            }
        });
 
        var box = new StackPane();
        box.getChildren().addAll(label, numField, btn, textArea);
        StackPane.setAlignment(btn, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(numField, Pos.CENTER_LEFT);
        StackPane.setAlignment(textArea, Pos.CENTER_RIGHT);
        StackPane.setAlignment(label, Pos.TOP_CENTER);

        var cx = new StackPane();
        // cx.getChildren().addAll(boxBtn, boxLabel, boxNumField, boxtextArea);
        var scene = new Scene(box, 640, 480);
        stage.setTitle("Aplicação Calcula Fibonacci");
        stage.setScene(scene);
        stage.show();
    }

    public long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}