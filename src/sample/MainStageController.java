package sample;
import javafx.fxml.FXML;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class MainStageController {


    @FXML private Canvas canvas;



    @FXML
    private void clickedOnCanvas(MouseEvent event)
    {
        System.out.println("X:"+event.getX());
        System.out.println("Y:"+event.getY());
    }

    public void drawOnCanvas()
    {
        int w = 30;
        int h = w;

        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITESMOKE);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1.0);

        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                gc.strokeRect(j*w,i*h,w,h);
            }
        }
    }
}