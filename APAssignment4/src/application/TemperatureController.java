package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TemperatureController implements Initializable {
	
	
	@FXML
	private ComboBox<String> c;
	
	@FXML
	private ComboBox<String> c2;
	
	@FXML
	private TextField t;
	
	@FXML
	private Text t1;
	
	@FXML
	private Stage stage;
	
	
	
	public void Conversion(ActionEvent e) {
		
		String s1=c.getValue();
		String s2=c2.getValue();
		
		double value=Double.parseDouble(t.getText());
		if(s1.equals("Celsius")&&s2.equals("Kelvin")) {
			
			double result=value+273.15;
			t1.setText("Celsius to Kelvin: "+String.valueOf(result)+" Kelvin");
		}
		
	    else if(s1.equals("Kelvin")&&s2.equals("Celsius")) {
			
			double result=value-273.15;
			t1.setText("Kelvin to Celsius: "+String.valueOf(result)+" Centigrade");
		}
		
		
        else if(s1.equals("Celsius")&&s2.equals("Fahrenheit")) {
			
			double result=((9/5)*value)+32;
			t1.setText("Celsius to Fahrenheit: "+String.valueOf(result)+" Fahrenheit");
			
			
		}
		
        else if(s1.equals("Kelvin")&&s2.equals("Fahrenheit")) {
			
			double result=(((value-273.15)*9)/5)+32;
			t1.setText("Kelvin to Fahrenheit: "+String.valueOf(result)+" Kelvin");
		}
		
       else if(s1.equals("Fahrenheit")&&s2.equals("Kelvin")) {
			
			double result=(value-32)*5/9 + 273.15; 
			t1.setText("Fahrenheit to Kelvin: "+String.valueOf(result)+" Fahrenheit");
		}
		
       else if(s1.equals("Fahrenheit")&&s2.equals("Celsius")) {
			
			double result=(5/9)*(value-32);
			t1.setText("Fahrenheit to Celsius: "+String.valueOf(result)+" Centigrade");
		}
		
       else {
    	   
    	   t1.setText("Same Units no Conversion required");
       }
	}
	
	
	@Override
	public void initialize(URL u, ResourceBundle r) {
		
		ObservableList<String> s=FXCollections.observableArrayList("Celsius","Kelvin","Fahrenheit");
		c.setItems(s);
		c.setValue("Celsius");
		ObservableList<String> s2=FXCollections.observableArrayList("Kelvin","Celsius","Fahrenheit");
		c2.setItems(s2);
		c2.setValue("Kelvin");
		 t.setText(String.valueOf(0));
		
		
		
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
	
	
	

}
