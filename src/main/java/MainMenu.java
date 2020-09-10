import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class MainMenu extends Application {

    @Override
    public void start(Stage stage) {
        FXMLLoader loader = new FXMLLoader(MainMenu.class.getResource("MainMenu.fxml"));

        Scene scene = null;
        try {
            scene = new Scene((AnchorPane) loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}