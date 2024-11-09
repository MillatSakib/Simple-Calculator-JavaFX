/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simple.calculator.Controller.BaseScene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sakib
 */
public class BaseSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField Number1;
    @FXML
    private TextField Number2;
    @FXML
    private TextField Result;
    @FXML
    private void buttonHanldeler(ActionEvent Event){
        String n1 = Number1.getText();
        String n2 = Number2.getText();
        double d1 = Double.parseDouble(n1);
        double d2 = Double.parseDouble(n2);
        double result = d1+d2;
        Result.setText(""+result);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
