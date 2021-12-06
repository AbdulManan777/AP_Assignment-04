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
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BMIController implements Initializable{
	
	
	
	@FXML
	private TextField t1;
	
	@FXML
	private TextField t2;
	
	double weight;
	double height;
	
	@FXML
	private Text display;
	
	@FXML
	private Text display2;
	
	@FXML
	private ProgressBar b;
	
	@FXML
	private Stage stage;
	public void BMIAction(ActionEvent e) {
		
		String b=t1.getText();
	    weight=Double.parseDouble(b);
	    
	    String b2=t2.getText();
		height=Double.parseDouble(b2);
		
		CalculateBMI(weight,height);
		
		
	}
	

		
		
	
public void CalculateBMI(double w,double h) {
	
	double bmi=w/Math.pow((h/100),2);
	
	display.setText(String.valueOf(bmi).format("%.2f", bmi)+"   BMI ");
	
	if(bmi>16.0&&bmi<=18.5) {
		
		display2.setText("Underweight");
		b.setProgress(0.3);
	}
	
	else if(bmi>18.5&&bmi<=25.0) {
		
		display2.setText("Normal");
		b.setProgress(0.5);
	}
	
else if (bmi>25.0&&bmi<=40.0) {
		
		display2.setText("Overweight");
		b.setProgress(0.8);
	}
	
else {
	display2.setText("Not a Valid BMI");
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
