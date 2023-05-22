package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HelpController {
    @FXML
    private Button closeButton;

    @FXML
    private void initialize() {
        closeButton.setOnAction(event -> closeHelpWindow());
    }

    private void closeHelpWindow(){
        try {

            Parent root = null;
            root = FXMLLoader.load(getClass().getResource("/KNK_Projekti/teacherdashboard.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            stage.initStyle(StageStyle.TRANSPARENT);

            stage.show();

            closeButton.getScene().getWindow().hide();


        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
