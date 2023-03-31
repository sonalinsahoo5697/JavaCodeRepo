package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//label for name
		Label username=new Label("User name:");
		Label Pssword=new Label("Password");
		
		//text field for name
		TextField t1=new TextField();
		TextField t2=new TextField();
		//label for button
		Button b=new Button("Login");
		
		//create grid pane
		GridPane root=new GridPane();
		
		//setting size for pane
		root.setMinSize(500, 300);
		
		//padding
		root.setPadding(new Insets(10,10,10,10));
		
		//gap betn volume
		root.setVgap(5);
		root.setHgap(5);
		
		//alinment
		root.setAlignment(Pos.CENTER);
		
		//all nodes in grid
		root.add(username, 0, 0);
		root.add(t1, 1, 0);
		root.add(Pssword, 0, 1);
		root.add(t2, 1, 1);
		
		//add button
		b.setStyle("-fx-background-color : aqua"); //set button color
		root.add(b, 0, 2);
		
		//setting the background color
		root.setStyle("-fx-background-color:BEIGE;");
		
		//creating scene
	    Scene scene=new Scene(root);
	    
	    //setting title
	    primaryStage.setTitle("Login page");
	    
	    //adding scene to the stage
	    primaryStage.setScene(scene);
	    
	    //display
	    primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
