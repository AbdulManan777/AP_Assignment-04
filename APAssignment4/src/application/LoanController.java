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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoanController implements Initializable {
	
	
	@FXML
	private TextField IR;
	
	@FXML
	private TextField PY;
	
	@FXML
	private TextField ab;
	
	@FXML
	private Text t;
	
	@FXML
	private Stage stage;
	
	
	
	
	public void LoanAction(ActionEvent e) {
		
		String ir=IR.getText();
		
		double inteRate=Double.parseDouble(ir);
		
		
        String py=PY.getText();
		
		double Yea=Double.parseDouble(py);
		
		
        String AB=ab.getText();
		
		double amount=Double.parseDouble(AB);
		
		
		double loan=amount*(inteRate/Yea);
		
		t.setText(String.valueOf(loan)+" Loan Payment");
		
		
		
		
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
	
	 IR.setText(String.valueOf(0));
	 PY.setText(String.valueOf(0));
	 ab.setText(String.valueOf(0));
	
}

}
