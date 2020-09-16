import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

public class HelloWorld extends Application{
    private Text myLabel;
    public void start(Stage primaryStage){
        primaryStage.setTitle("Hello World");
        Button myButton = new Button("Say Hello World!");
        myLabel = new Text();
        myButton.setOnAction(e -> myLabel.setText("Hello 3035"));
        BorderPane pane = new BorderPane();
        pane.setTop(myButton);
        pane.setCenter(myLabel);
        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
