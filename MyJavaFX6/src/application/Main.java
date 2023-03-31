package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Main extends Application{
	@Override
	public void start(Stage primaryStage) {
			GridPane root = new GridPane();
			Label value1=new Label("First value:");
			value1.setPadding(new Insets(10));
			Label value2=new Label("Second value:");
			value2.setPadding(new Insets(10));
			Button b=new Button("ADD(+)");
			b.setPadding(new Insets(5));
			Button b1=new Button("CLEAR");
			b.setPadding(new Insets(5));
			Label result=new Label("RESULT:");
			result.setPadding(new Insets(10));
			TextField t1=new TextField();
			TextField t2=new TextField();
			TextField t3=new TextField();
			
			root.addRow(0, value1,t1);
			root.addRow(1, value2,t2);
			root.addRow(2, b,b1);
			root.addRow(3, result,t3);
			primaryStage.setTitle("ADDITION");
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
