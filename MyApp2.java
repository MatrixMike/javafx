// package scenegraphdemo;
 
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class MyApp2 extends Application {
 
   @Override
   public void start(Stage stage) {
       Group root = new Group();
       Scene scene = new Scene(root, 500, 500, Color.BLACK);
       stage.setTitle("JavaFX Scene Graph Demo");
       stage.setScene(scene);
       stage.show();
   }
 
   public static void Main(String[] args) {
       launch(args);
   }
}
