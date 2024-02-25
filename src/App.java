import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class App extends Application {
  public static void main(String[] args) throws Exception {
    launch(args);
  }

  @Override
  public void start(Stage myStage) throws Exception {
    Group rootNode = new Group();
    Scene myScene = new Scene(rootNode, Color.MIDNIGHTBLUE);

    myStage.setScene(myScene);
    myStage.setTitle("Hello World!");
    myStage.setWidth(420);
    myStage.setHeight(420);
    myStage.setResizable(false);
    myStage.show();
  }
}
