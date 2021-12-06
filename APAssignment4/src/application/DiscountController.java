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


public class DiscountController implements Initializable {
	
	@FXML
	private TextField t1;
	String cat="";
	String cat2="";
	@FXML
	private TextField t2;
	
	@FXML
	private TextField t3;
	
	@FXML
	private Text t4;
	
	double originalPrice;
	double DiscountPrice;
	
	@FXML
	private Stage stage;
	
	public void OriginalPriceInput(ActionEvent e) {
		
		
	    String op=t1.getText();
		originalPrice=Double.parseDouble(op);
		
		String fp=t2.getText();
		DiscountPrice=Double.parseDouble(fp);
		
		

		
		
		CalculateFinalPrice(originalPrice,DiscountPrice);
		
		
	}
	
	public void CalculateFinalPrice(double op,double dp) {
		
		t3.setText("");
		t4.setText("");
		double fp=op-(op*(dp/100));
		t3.setText(String.valueOf(fp));
		double result=op-fp;
		t4.setText("You Saved  "+ String.valueOf(result).format("%.2f", result));
		
		
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
