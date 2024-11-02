package main.Creativity;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SnoopyMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        House house = new House();
        Snoopy snoopy = new Snoopy();

        Group group = new Group(house, snoopy);

        //Resizing the Snoopy
        Scale scale = new Scale(0.8, 0.8);
        snoopy.getTransforms().add(scale);
        snoopy.setTranslateX(100);
        snoopy.setTranslateY(250);

        //Text for my name
        Text nameText = new Text("Alyssa Tu");
        nameText.setStyle("-fx-font-size: 24;");
        nameText.setTranslateX(850); 
        nameText.setTranslateY(790); 
        group.getChildren().add(nameText); 

        //Text instructions for the users to get the snoopy to move
        Text text = new Text("Click anywhere on this tab to let snoopy fly");
        text.setStyle("-fx-font-size: 24;");
        text.setTranslateX(300); 
        text.setTranslateY(790); 
        group.getChildren().add(text); 

        //This allows the snoopy to slowly move out frame
        TranslateTransition transition = new TranslateTransition(Duration.seconds(5), snoopy);
        transition.setToX(1000); // Moves Snoopy to the right
        transition.setToY(0); //Moves Snoopy upward

        //EventHandler to play the event
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                transition.play(); 
            }
        };
        
        //To enable to event, the player can click anywhere on their snoopy tab.
        group.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

        
        //Setting a scene 
        Scene scene = new Scene(group, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snoopy's House");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
