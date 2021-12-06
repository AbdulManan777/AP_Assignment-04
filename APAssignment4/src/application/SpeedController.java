package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SpeedController implements Initializable {

	
	@FXML
	private TextField t1;
	
	@FXML
	private Stage stage;
	
	@FXML
	private TextField t2;
	
	@FXML
	private Text t3;
	
	public void SpeedAction(ActionEvent e) {
		
		double dis=Double.parseDouble(t1.getText());
		
		double time1=Double.parseDouble(t2.getText());
		
		double speed=dis*time1;
		
		t3.setText("Spedd: "+String.valueOf(speed)+" meters/second");
		
	}
	
	
	
     public void BackToMenu(ActionEvent e) throws IOException {
		
		FXMLLoader l=new FXMLLoader(getClass().getResource("MainMenu.fxml"));
		Parent root=l.load();
		Scene scene=new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage=(Stage)((Node)e.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
     
     
     @Override
     public void initialize(URL u, ResourceBundle r) {
     	
     	 t1.setText(String.valueOf(0));
     	 t2.setText(String.valueOf(0));
     	 
     	
     }

}
