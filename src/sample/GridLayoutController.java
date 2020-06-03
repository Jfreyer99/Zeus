package sample;

import javafx.fxml.FXML;

/*
* Imports for control Elements
*/
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class GridLayoutController {

        @FXML
        private Button button1;
        @FXML
        private CheckBox checkBox1;

    @FXML
    private void clicki()
    {
        System.out.println("Button Click");
    }

    @FXML
    private void c()
    {
        if(checkBox1 != null) {
            checkBox1.setText("c");
        }
    }

}
