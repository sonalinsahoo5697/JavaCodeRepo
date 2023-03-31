package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Label username=new Label("User name:"); 
		username.setPadding(new Insets(10));
	    Label fname = new Label("First name:");
	    fname.setPadding(new Insets(10));
	    Label lname = new Label("Last name:");
	    lname.setPadding(new Insets(10));
	    Label mail = new Label("Mail_Id:");
	    mail.setPadding(new Insets(10));
	    Label password = new Label("Password:");
	    password.setPadding(new Insets(10));
	    Label conform_password = new Label("Conform password:");
	    conform_password.setPadding(new Insets(10));
	    TextField tf1=new TextField();  
	    TextField tf2=new TextField(); 
	    TextField tf3=new TextField();
	    TextField tf4=new TextField();
	    TextField tf5=new TextField();
	    TextField tf6=new TextField();
	    
	    
	    HBox pane = new HBox();
	    Button b = new Button("Register");  
	    pane.setSpacing(25);
	    
	    GridPane root = new GridPane();  
	    root.addRow(0, username, tf1);  
	    root.addRow(1, fname, tf2);  
	    root.addRow(2, lname, tf3);
	    root.addRow(3, mail ,tf4);
	    root.addRow(4, password ,tf5);
	    root.addRow(5, conform_password ,tf6);
	    root.addRow(6, b);  
	    
	    Scene scene=new Scene(root,500,500);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("Text Field Example");  
	    primaryStage.show();  
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
