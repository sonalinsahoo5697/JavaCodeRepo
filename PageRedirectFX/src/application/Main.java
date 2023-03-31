package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane root=new StackPane();
		Button btn=new Button("click");
		root.getChildren().add(btn);
		
		root.getStylesheets().add("application.css");
		Scene scene=new Scene(root , 500 ,500);
		primaryStage.setTitle("button !!");
		primaryStage.setScene(scene);
		primaryStage.show();  
		
		btn.setOnAction(e->{
			HBox root1=new HBox();
			Scene scene1=new Scene(root1,500,500);
			root1.setStyle("-fx-background-color:grey");
			Stage secondStage=new Stage();
		    secondStage.setScene(scene1);
		    secondStage.show();
		    primaryStage.close();
		});
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
