package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CalculatorController {
	
	@FXML
	private TextField f;
	@FXML
	private Text are;
	String t;
	String cat="";
	double num1=0;
	double num2=0;
	String op="";
	double r=0;
	boolean flag=false;
	boolean flag2=false;
	
	@FXML
	private Stage stage;
	public void NumberPress(ActionEvent event) {
		
		if(flag==true) {
			are.setText("");
			flag=false;
		}
		if(flag2==true) {
			cat="";
			flag2=false;
		}
		f.setText("");
		
	     t = ((Button)event.getSource()).getText();
	     if(t.equals("Ans")) {
	    	 cat=cat.concat(String.valueOf(r));
	     }
	     else {
	     cat=cat.concat(t);
	     }
		//f.setText(f.getText()+t);
	     if(t.equals("Ans")) {
	    	 are.setText(are.getText()+r);
	     }
	     else {
		are.setText(are.getText()+t);
	     }
		
		
		
		
		
	}
	public void OperationType(ActionEvent e) {
	     if(flag==true) {
			are.setText("");
			flag=false;
		}
		flag2=true;
		String o= ((Button)e.getSource()).getText();
		if(o.equals("AC")) {
			are.setText("");
		    f.setText("");
		    return;
	     }
		if(o.equals("DEL")) {
			
			   are.setText(are.getText().substring(0,are.getText().length()-1));
			   return;
		}
		
		if(!o.equals("=")&&!o.equals("DEL"))
		are.setText(are.getText()+o);
		if(!o.equals("=")) {
			
			if(!op.isEmpty()) 
				return;
				op=o;
			   
			    
				num1=Double.parseDouble(cat);
			    
				
			    //f.setText("");
			
		}
		else {
			if(op.isEmpty())
				return;
			
			 num2=Double.parseDouble(cat);
			 //are.setText(are.getText()+String.valueOf(num2));
			if(op.equals("+")) {
				num1+=num2;
				r=num1;
				f.setText(String.valueOf(num1));
				flag=true;
			    op="";
			   
			}
			else if(op.equals("-")) {
				num1-=num2;
				r=num1;
				f.setText(String.valueOf(num1));
				flag=true;
			    op="";
			   
			}
			else if(op.equals("X")) {
				num1*=num2;
				r=num1;
				f.setText(String.valueOf(num1));
				flag=true;
			    op="";
			}
			else if(op.equals("/")) {
				if(num2==0) {
					f.setText("Math Error");
				    flag=true;
			        op="";
				}
				else {
				num1/=num2;
				r=num1;
				f.setText(String.valueOf(num1));
				flag=true;
			    op="";
				}
			    
			}
			else if(op.equals("%")) {
				
				double result=(num1/num2)*100;
				r=result;
				f.setText(String.valueOf(result));
				flag=true;
			    op="";
			}
			
			
		}
		
		
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
