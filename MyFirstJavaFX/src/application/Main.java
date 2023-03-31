package application;
  
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
			BorderPane root = new BorderPane();
			primaryStage.setTitle("form");  
		
//			 Rectangle rect = new Rectangle();  
//			    rect.setX(100);  
//			    rect.setY(50);  
//			    rect.setWidth(500);  
//			    rect.setHeight(600); 
//			    rect.setEffect(new DropShadow());
//			    rect.setFill(Color.AQUA);
//			    root.getChildren().add(rect);  
			    
			 Text t=new Text();  
			    t.setX(220);
			    t.setY(80);
			    t.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,25)); 
			    t.setText("REGISTRATION FORM");
			    root.getChildren().add(t);
			    
			    
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
			    
			    Button btn = new Button("Button");  
			    root.getChildren().add(btn);
			    
			    
			    GridPane g=new GridPane();
			    g.setPadding(new Insets(10,10,10,10));
			    g.setVgap(5);
			    g.setHgap(5);
			    g.setAlignment(Pos.TOP_CENTER);
			    g.add(username, 0, 0);
			    g.add(tf1, 1, 0);
			    g.add(fname, 0, 1);
			    g.add(tf2, 1, 1);
			    g.add(lname, 0, 2);
			    g.add(tf3, 1, 2);
			    g.add(mail, 0, 3);
			    g.add(tf4, 1, 3);
			    g.add(password, 0, 4);
			    g.add(tf5, 1, 4);
			    g.add(conform_password, 0, 5);
			    g.add(tf6, 1, 5);
			   // g.add(b, 0, 6);			    
			    
			Scene scene = new Scene(root,700,700);
        	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
}
	
	public static void main(String[] args) {
		launch(args);
	}
}
