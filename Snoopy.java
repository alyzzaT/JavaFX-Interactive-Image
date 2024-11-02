package main.Creativity;

import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;

public class Snoopy extends StackPane {

    public Snoopy() {
        Ellipse head = new Ellipse(); 
        head.setCenterX(400);
        head.setCenterY(180);
        head.setRadiusX(140);
        head.setRadiusY(150);
      
        Ellipse head2 = new Ellipse(); 
        head2.setCenterX(540);
        head2.setCenterY(175);
        head2.setRadiusX(130);
        head2.setRadiusY(90);

        Shape unionHead = Shape.union(head2, head);
        unionHead.setFill(Color.WHITE);
        unionHead.setStroke(Color.BLACK);
        unionHead.setStrokeWidth(5);

        CubicCurve chin = new CubicCurve(); 
        chin.setStartX(464);
        chin.setStartY(316);
        chin.setControlX1(464); 
        chin.setControlY1(260);  
        chin.setControlX2(550); 
        chin.setControlY2(260);  
        chin.setEndX(585);
        chin.setEndY(262);
        chin.setFill(Color.BLACK);

        Shape unionHead2 = Shape.union(unionHead,chin);
        unionHead2.setFill(Color.WHITE);
        unionHead2.setStroke(Color.BLACK);
        unionHead2.setStrokeWidth(5);

        Ellipse nose = new Ellipse(); 
        nose.setCenterX(675);
        nose.setCenterY(175);
        nose.setRadiusX(40);
        nose.setRadiusY(35);
        nose.setFill(Color.BLACK);

        Ellipse noseShine = new Ellipse(); 
        noseShine.setCenterX(685);
        noseShine.setCenterY(155);
        noseShine.setRadiusX(10);
        noseShine.setRadiusY(6);
        noseShine.setFill(Color.WHITE);

        Ellipse ear = new Ellipse();
        ear.setCenterX(300);
        ear.setCenterY(225);
        ear.setRadiusX(75);
        ear.setRadiusY(145);
        ear.setFill(Color.WHITE);
        ear.setStroke(Color.BLACK);
        ear.setStrokeWidth(5);

        Ellipse earSpot = new Ellipse();
        earSpot.setCenterX(300);
        earSpot.setCenterY(225);
        earSpot.setRadiusX(65);
        earSpot.setRadiusY(135);
        earSpot.setFill(Color.BLACK);
        earSpot.setStrokeWidth(5);

        Ellipse eye = new Ellipse();
        eye.setCenterX(500);
        eye.setCenterY(150);
        eye.setRadiusX(10);
        eye.setRadiusY(15);
        eye.setFill(Color.BLACK);

        CubicCurve string = new CubicCurve();
        string.setStartX(500); 
        string.setStartY(300); 
        string.setControlX1(400); 
        string.setControlY1(400); 
        string.setControlX2(600); 
        string.setControlY2(500); 
        string.setEndX(500); 
        string.setEndY(600);
        string.setStroke(Color.BLACK);
        string.setFill(null);
        string.setStrokeWidth(5);

        Group snoopyGroup = new Group(nose,noseShine,unionHead2,ear,eye,earSpot,string);
        getChildren().add(snoopyGroup);
    }

}


