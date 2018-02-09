package helloWorldApp;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;


public class HelloWorldApp extends Application implements EventHandler {
	
		Button helloBtn = new Button();
		Button exitBtn = new Button();
		StackPane root = new StackPane();
		Scene scene = new Scene(root,300,250);
		
		@Override
		public void start(Stage primaryStage) {
			
			//Exit Button
			exitBtn.setText("Exit");
			exitBtn.setTranslateX(1);
			exitBtn.setTranslateY(50);
			exitBtn.addEventHandler(MouseEvent.MOUSE_CLICKED,this);
			
			//Hello Button
			helloBtn.setText("Say Hello World");
			helloBtn.addEventHandler(MouseEvent.MOUSE_CLICKED,this);
			
			root.getChildren().add(helloBtn);
			root.getChildren().add(exitBtn);
					
			primaryStage.setTitle("Hello World");
			primaryStage.setScene(scene);
			primaryStage.show();	
		}
		
		
		@Override
		public void handle(Event e) {
			if(e.getSource() == exitBtn) {
				System.out.println("Exit");
			}
			if(e.getSource() == helloBtn) {
				System.out.println("Hello");
			}
		}
		
	
	public static void main(String[] args) {
		launch(args);
	}
}
