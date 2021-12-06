package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class MenuController {
	
	@FXML
	private Stage stage;
	
	
	public void MenuAction(ActionEvent e) throws IOException {
		
		String b = ((Button)e.getSource()).getText();
	
		
		if(b.equals("BMI")) {
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("BMICalculator.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		
		else if(b.equals("Age")) {
			
		

			FXMLLoader l=new FXMLLoader(getClass().getResource("DateOfBirth.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		else if(b.equals("Basic Calculator")) {
			
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("SimpleCalculator.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		
		
       else if(b.equals("Discount")) {
			
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("Discount.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		
       else if(b.equals("Currency")) {
			
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("CurrencyConverter.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		
       else if(b.equals("Loan")) {
			
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("LoanPayment.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		
		
       else if(b.equals("Area")) {
			
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("AreaCalculator.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		
       else if(b.equals("Investment")) {
			
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("InvestmentCalculator.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		
       else if(b.equals("Temperature")) {
			
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("TemperatureConversion.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		
		
       else if(b.equals("Speed")) {
			
			

			FXMLLoader l=new FXMLLoader(getClass().getResource("Speed.fxml"));
			Parent root=l.load();
			Scene scene=new Scene(root);
			stage=(Stage)((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
	}

}
