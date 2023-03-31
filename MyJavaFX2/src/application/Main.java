package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane=new Pane();
       Image img=new Image("http://www.wallpaperg.com/convert.shtml?link=http%3A%2F%2Fwww.wallpaperg.com%2Fbucket%2F1342742093-beautiful-nature-night--file.jpg&new=4");
       pane.getChildren().add(new ImageView(img));
        
        Scene scene=new Scene(pane);
        primaryStage.setTitle("Image");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
