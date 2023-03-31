package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane root=new GridPane();
		Text t=new Text();
		t.setText("...REGISTRATION FORM...");
		Image img=new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQheEYuTGHFaulUgizhh7y8_HXcNWrtrVv1_A&usqp=CAU");
		Label fname=new Label("First name:");
		Label lname=new Label("Last name:");
		Label email=new Label("Email id:");
		Label password=new Label("Password:");
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		TextField t4=new TextField();
		Button b=new Button("Sumbit");
		root.getChildren().add(new ImageView(img));
		root.addRow(1, fname,t1);
		root.addRow(2, lname,t2);
		root.addRow(3, email,t3);
		root.addRow(4, password,t4);
		root.add(b, 0, 5);
		
		root.getStylesheets().add("application.css");
		Scene scene=new Scene(root , 600 ,600);
		primaryStage.setTitle("Nimble Tech !!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		b.setOnAction(e->{
			StackPane root1=new StackPane();
			Image img1=new Image("htjacmatps://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhxeBq8Rc9Fv9RPZvVRExYwFZKFlXGXL2EWMVLcSlcZWVKl2z9vz_KM54A5fktxI-eQ1q6UcRY4KCVZJWu9Xik5v10xL0c330O9erlmsAmdVSHoh0mPp-swNUsN7EuAUfhMwd35cz01rrxHIG58ic4oluGv1vBE5jy3ZbK071x2UJRbBllzjepebePR-Q/w460-h461/3.png");
			//Label l=new Label("Congratulation , your account has been successfully created.");
			//Button b1=new Button("Continue");
			root1.getChildren().add(new ImageView(img1));
			//root1.getChildren().add(l);
			//root1.getChildren().add(b1);
			Scene scene1=new Scene(root1,500,500);
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
