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
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	
		GridPane g=new GridPane();                  //create grid pane
		primaryStage.setTitle("FORM");              //set title
		Text t=new Text();
//		t.setX(250);
//	    t.setY(100);
		t.setText("REGISTRATION FORM");             //Add text
		t.setUnderline(true); 
		t.setFont(Font.font("Abyssinica SIL",FontWeight.EXTRA_BOLD,FontPosture.REGULAR,25));
		
		Label username=new Label("User name:"); 
	    Label fname = new Label("First name:");
	    Label lname = new Label("Last name:");
	    Label mail = new Label("Mail_Id:");
	    Label password = new Label("Password:");
	    Label conform_password = new Label("Conform password:");
	    TextField tf1=new TextField();  
	    TextField tf2=new TextField(); 
	    TextField tf3=new TextField();
	    TextField tf4=new TextField();
	    TextField tf5=new TextField();
	    TextField tf6=new TextField();
	    Button b = new Button("Register");
	  
	  		g.setMinSize(700, 700);      //set size for pane
	  		g.setPadding(new Insets(10,10,10,10)); //padding
	  		g.setVgap(5); //gap between volume
	  		g.setHgap(5);
	  		g.setAlignment(Pos.TOP_CENTER);
	  		g.add(t, 1, 0);
	  		g.add(username, 0, 1);
		    g.add(tf1, 1, 1);
		    g.add(fname, 0, 2);
		    g.add(tf2, 1, 2);
		    g.add(lname, 0, 3);
		    g.add(tf3, 1, 3);
		    g.add(mail, 0, 4);
		    g.add(tf4, 1, 4);
		    g.add(password, 0, 5);
		    g.add(tf5, 1, 5);
		    g.add(conform_password, 0, 6);
		    g.add(tf6, 1, 6);
		    g.add(b, 1,7);		
		    
		 
			g.setStyle("-fx-background-color:ORANGE;"); //set the background color
		    Scene scene=new Scene(g); //creating scene
		    primaryStage.setScene(scene); //adding scene to the stage
		    primaryStage.show(); //display
	  		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}