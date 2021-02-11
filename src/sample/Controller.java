package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public PasswordField txtPassword;
    public TextField txtUserName;
    public Button btnSignIn;

    public void btnOnClickAction(ActionEvent actionEvent) throws IOException {
        //validating
        //open the app
        Stage stage = new Stage();
        Parent load = FXMLLoader.load(getClass().getResource("app.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }
}
