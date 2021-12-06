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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CurrencyController implements Initializable {
	
	@FXML
	private ComboBox<String> c;
	@FXML
	private ComboBox<String> c2;
	@FXML
	private ComboBox<String> c3;
	
	@FXML
	private ComboBox<String> c4;
	double curr;
	String cat="";
	@FXML
	private TextField te;
	@FXML
	private TextField t;

	@FXML
	private TextField t2;
	
	@FXML
	private TextField t3;
	
	@FXML
	private Stage stage;
	
	public void ButtonInput(ActionEvent event) throws NullPointerException {
		
		
		
		String b = ((Button)event.getSource()).getText();
		
		if(b.equals("DEL")) {
			   
			   te.setText(te.getText().substring(0,te.getText().length()-1));
				curr=Integer.parseInt(te.getText());
				cat=cat.substring(0,cat.length()-1);
		}
		else if(b.equals("AC")) {
			   
			te.setText("");
			t.setText("");
			t2.setText("");
			t3.setText("");
			cat="";
			return;
		}
		else {
		cat=cat.concat(b);
		te.setText(cat);
		try {
		curr=Double.parseDouble(cat);
		}
		catch(NumberFormatException e) {
		     te.setText("Error");
		}
		}
		try {
		String currSe=c.getSelectionModel().getSelectedItem().toString();
		
		
		String currSe2=c2.getSelectionModel().getSelectedItem().toString();
		String currSe3=c3.getSelectionModel().getSelectedItem().toString();
		String currSe4=c4.getSelectionModel().getSelectedItem().toString();
		
		if(currSe.equals("PKR")&&currSe2.equals("USD")&&currSe3.equals("EUR")&&currSe4.equals("IND")) {
			
			double result=curr*0.0057;
			t.setText(String.valueOf(result));
			
			result=curr*0.0050;
			t2.setText(String.valueOf(result));
			
			result=curr*0.43;
			t3.setText(String.valueOf(result));
		}
		
		
		else if(currSe.equals("USD")&&currSe2.equals("PKR")&&currSe3.equals("EUR")&&currSe4.equals("IND")) {
			
			double result=curr*176.65 ;
			t.setText(String.valueOf(result));
			
			result=curr*0.88;
			t2.setText(String.valueOf(result));
			
			result=curr*75.24;
			t3.setText(String.valueOf(result));
		}
		
		
		
       else if(currSe.equals("EUR")&&currSe2.equals("PKR")&&currSe3.equals("USD")&&currSe4.equals("IND")) {
			
			double result=curr*199.69 ;
			t.setText(String.valueOf(result));
			
			result=curr*1.13;
			t2.setText(String.valueOf(result));
			
			result=curr*84.95;
			t3.setText(String.valueOf(result));
		}
		
		
       else if(currSe.equals("IND")&&currSe2.equals("PKR")&&currSe3.equals("USD")&&currSe4.equals("EUR")) {
			
			double result=curr*2.35 ;
			t.setText(String.valueOf(result));
			
			result=curr*0.013;
			t2.setText(String.valueOf(result));
			
			result=curr*0.012;
			t3.setText(String.valueOf(result));
		}
		
		
       else if(currSe.equals("IND")&&currSe2.equals("PKR")&&currSe3.equals("EUR")&&currSe4.equals("USD")) {
			
			double result=curr*2.35 ;
			t.setText(String.valueOf(result));
			
			result=curr*0.012;
			t2.setText(String.valueOf(result));
			
			result=curr*0.013;
			t3.setText(String.valueOf(result));
		}
		
		
		
       else if(currSe.equals("IND")&&currSe2.equals("USD")&&currSe3.equals("PKR")&&currSe4.equals("EUR")) {
			
			double result=curr*0.013 ;
			t.setText(String.valueOf(result));
			
			result=curr*2.35;
			t2.setText(String.valueOf(result));
			
			result=curr*0.012;
			t3.setText(String.valueOf(result));
		}
		
		
       else if(currSe.equals("IND")&&currSe2.equals("EUR")&&currSe3.equals("PKR")&&currSe4.equals("USD")) {
			
			double result=curr*0.012 ;
			t.setText(String.valueOf(result));
			
			result=curr*2.35;
			t2.setText(String.valueOf(result));
			
			result=curr*0.013;
			t3.setText(String.valueOf(result));
		}
		
		
       else if(currSe.equals("USD")&&currSe2.equals("EUR")&&currSe3.equals("IND")&&currSe4.equals("PKR")) {
			
			double result=curr*0.88 ;
			t.setText(String.valueOf(result));
			
			result=curr*75.31;
			t2.setText(String.valueOf(result));
			
			result=curr*176.97;
			t3.setText(String.valueOf(result));
		}
		
		
       else if(currSe.equals("USD")&&currSe2.equals("IND")&&currSe3.equals("PKR")&&currSe4.equals("EUR")) {
			
			double result=curr*75.31 ;
			t.setText(String.valueOf(result));
			
			result=curr*176.97;
			t2.setText(String.valueOf(result));
			
			result=curr*0.88;
			t3.setText(String.valueOf(result));
		}
		
       else if(currSe.equals("USD")&&currSe2.equals("PKR")&&currSe3.equals("IND")&&currSe4.equals("EUR")) {
			
			double result=curr*176.97 ;
			t.setText(String.valueOf(result));
			
			result=curr*75.31;
			t2.setText(String.valueOf(result));
			
			result=curr*0.88;
			t3.setText(String.valueOf(result));
		}
		
		
		
       else if(currSe.equals("PKR")&&currSe2.equals("IND")&&currSe3.equals("USD")&&currSe4.equals("EUR")) {
			
			double result=curr*0.43;
			t.setText(String.valueOf(result));
			
			result=curr*0.0057;
			t2.setText(String.valueOf(result));
			
			result=curr*0.0050;
			t3.setText(String.valueOf(result));
		}
		
		
		
       else if(currSe.equals("PKR")&&currSe2.equals("EUR")&&currSe3.equals("USD")&&currSe4.equals("IND")) {
			
			double result=curr*0.0050;
			t.setText(String.valueOf(result));
			
			result=curr*0.0057;
			t2.setText(String.valueOf(result));
			
			result=curr*0.43;
			t3.setText(String.valueOf(result));
		}
		
		
       else if(currSe.equals("PKR")&&currSe2.equals("IND")&&currSe3.equals("EUR")&&currSe4.equals("USD")) {
			
			double result=curr*0.43;
			t.setText(String.valueOf(result));
			
			result=curr*0.0050;
			t2.setText(String.valueOf(result));
			
			result=curr*0.0057;
			t3.setText(String.valueOf(result));
		}
		
		
		
       else if(currSe.equals("EUR")&&currSe2.equals("USD")&&currSe3.equals("PKR")&&currSe4.equals("IND")) {
			
			double result=curr*1.13 ;
			t.setText(String.valueOf(result));
			
			result=curr*199.64;
			t2.setText(String.valueOf(result));
			
			result=curr*84.95;
			t3.setText(String.valueOf(result));
		}
		
		
		
       else if(currSe.equals("EUR")&&currSe2.equals("IND")&&currSe3.equals("PKR")&&currSe4.equals("USD")) {
			
			double result=curr*84.95 ;
			t.setText(String.valueOf(result));
			
			result=curr*199.64;
			t2.setText(String.valueOf(result));
			
			result=curr*1.13;
			t3.setText(String.valueOf(result));
		}
		
		
       else if(currSe.equals("EUR")&&currSe2.equals("PKR")&&currSe3.equals("IND")&&currSe4.equals("USD")) {
			
			double result=curr*199.64 ;
			t.setText(String.valueOf(result));
			
			result=curr*84.95;
			t2.setText(String.valueOf(result));
			
			result=curr*1.13;
			t3.setText(String.valueOf(result));
		}
		}
		catch(NullPointerException e) {
			System.out.println("Exception Catched");
		}
		
	}
	
	@Override
	public void initialize(URL u, ResourceBundle r) {
		
		ObservableList<String> s=FXCollections.observableArrayList("PKR","USD","EUR","IND");
		c.setItems(s);
		
		c.setValue("PKR");
		
		c2.setItems(s);
		
		c2.setValue("USD");
		
		c3.setItems(s);
		
		c3.setValue("EUR");
		
		c4.setItems(s);
		
		c4.setValue("IND");
		
		te.setText("0");
		
		t.setText("0");
		
		t2.setText("0");
		
		t3.setText("0");
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
