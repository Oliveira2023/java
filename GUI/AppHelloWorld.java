import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class AppHelloWorld {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage janela) {
        Button btn = new Buton();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });
        StackPane gerenciadorLayout = new StackPane();
        gerenciadorLayout.getChildren().add(btn);
        Scene cena = new Scene(gerenciadorLayout, 300, 100);
        janela.setScene(cena);
        janela.show();
    }
}
