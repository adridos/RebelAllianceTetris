package grizzBlocks;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Node;


public class FXMLHomePageController {
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	

    @FXML
    private Button btn_home;

    @FXML
    private Label greeting;

    @FXML
    void Display(ActionEvent event) {
    	

    }
   /* public void switchToScene1(ActionEvent event) throws IOException {
    	  root = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	 }
*/

}