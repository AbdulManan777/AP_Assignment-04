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

public class AreaController  implements Initializable{
	
	@FXML
	private TextField t1;
	
	@FXML
	private TextField t2;
	
	@FXML
	private Text t;
	
	@FXML
	private Stage stage;
	
	
	
	public void AreaAction(ActionEvent e) {
	
		try {
			String len=t1.getText();
			String Wid=t2.getText();
			double len1=Double.parseDouble(len);
			double Wid1=Double.parseDouble(Wid);
			double area=len1*Wid1;
			t.setText("Area of Rectangle: "+ String.valueOf(area)+" sq/meters");
		}
		catch(NullPointerException e2) {
			
		}
		
		
	
		
	}
	
	public void Back(ActionEvent e) throws IOException {
		
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
