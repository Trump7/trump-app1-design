import static javafx.application.Application.launch;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application{

    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Application.fxml")));

        Scene scene = new Scene(root);
        //Uncomment line when style sheet is made
        //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("ToDo Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
