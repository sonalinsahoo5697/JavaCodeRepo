package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane root=new GridPane();

		Label fname=new Label("First name:");
		Label lname=new Label("Last name:");
		Label email=new Label("Email:");
		Label password=new Label("Password:");
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		TextField t4=new TextField();
		Text text=new Text(" ");
		Text text1=new Text(" ");
		Text text2=new Text(" ");
		Text text3=new Text(" ");
		Button b=new Button("Sumbit");
		root.addRow(0, fname,t1);
		root.addRow(1, lname,t2);
		root.addRow(2, email,t3);
		root.addRow(3, password,t4);
		root.add(b, 0, 5);
		
		root.getStylesheets().add("application.css");
		Scene scene=new Scene(root , 600 ,600);
		primaryStage.setTitle("Nimble Tech !!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		b.setOnAction(e -> {		
			String firstname=t1.getText();
			String lastname=t2.getText();
			String eid=t3.getText();
			
			
			
			//String pswd=t4.getText();
			
			text.setText(firstname);
			text.setFont(Font.font("Verdana", FontWeight.BOLD,20));
			text.setTextAlignment(TextAlignment.CENTER);
			
			
			text1.setText(lastname);
			text1.setFont(Font.font("Verdana", FontWeight.BOLD,20));
			text1.setTextAlignment(TextAlignment.CENTER);
			
			
			text2.setText(eid);
			text2.setFont(Font.font("Verdana", FontWeight.BOLD,20));
			text2.setTextAlignment(TextAlignment.CENTER);
			
			//text3.setText(pswd);
			
			
			StackPane root1=new StackPane();
			
			root1.getChildren().addAll(text,text1,text2);
			StackPane.setAlignment(text,Pos.TOP_LEFT);
			StackPane.setAlignment(text1,Pos.TOP_CENTER);
			StackPane.setAlignment(text2,Pos.TOP_RIGHT);
			
			root1.setStyle("-fx-background-color:#f2d9e5");
			root1.setPadding(new Insets(50));
			root1.getPadding();
			
			Scene scene1=new Scene(root1,900,500);
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
