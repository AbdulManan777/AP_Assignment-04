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

public class InvestmentController implements Initializable {
	
	@FXML
	private TextField t1;
	
	@FXML
	private TextField t2;
	
	@FXML
	private TextField t3;
	
	@FXML
	private Text t4;
	
	@FXML
	private Stage stage;
	
	
	public void InvestmentEvent(ActionEvent e) {
		
		double i=Double.parseDouble(t1.getText());
		double p=Double.parseDouble(t2.getText());
		double d=Double.parseDouble(t3.getText());
		
		double result=((p/100)*i*d)+i;
		t4.setText("Total Investment for "+t3.getText()+" Years is " +String.valueOf(result));
		
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
	 t3.setText(String.valueOf(0));
	
}

}
