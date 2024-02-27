import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class App extends Application {
  public static void main(String[] args) throws Exception {
    launch(args);
  }

  @Override
  public void start(Stage myStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Builder.fxml"));
    Scene scene = new Scene(root);

    String css = this.getClass().getResource("Style.css").toExternalForm();
    scene.getStylesheets().add(css);

    myStage.setScene(scene);
    myStage.show();
  }
}
