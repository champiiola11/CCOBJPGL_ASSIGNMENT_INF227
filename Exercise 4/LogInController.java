import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;


public class LogInController {
    
@FXML
TextField mytextfield;

@FXML
PasswordField mypasswordfield;

@FXML
Button mybutton;

public void login(ActionEvent event) throws IOException{
    
    //get input in mt text and password field and store in a variable
    String username = mytextfield.getText();
    String password = mypasswordfield.getText();

    System.out.println(username);
    System.out.println(password);

    // if username and password matches, go to Scene.fxml
    if (username.equals("biancarsb")&& password.equals("sikret")) {
        Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene scene = new Scene(root);
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       stage.setScene(scene);
       stage.show();

    }
}


}