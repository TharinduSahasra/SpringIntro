package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
     @FXML
    private AnchorPane root;
   
    @FXML
    protected void handleLoginButtonAction(ActionEvent event) {
        System.out.println("username : "+usernameField.getText());
        System.out.println("password : "+passwordField.getText());

    
    }
}
