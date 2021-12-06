package application;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DateController {
	
	@FXML
	private DatePicker d;
	
	@FXML
	private DatePicker d2;
	
	@FXML
	private Text Age;
	
	@FXML
	private Text BirthDay;
	
	
	@FXML
	private TextField Year;
	
	
	@FXML
	private TextField month1;
	
	@FXML
	private TextField week;
	
	@FXML
	private TextField Da;
	
	@FXML
	private Text error;
	
	@FXML
	private TextField Hours;
	
	@FXML
	private TextField Minutes;
	
	@FXML
	private Stage stage;
	
	
	
	public void DatePick(ActionEvent e) {
		
		try {
		
		LocalDate dt=d.getValue();
		
		String month=dt.getMonth().toString();
		int mo=dt.getDayOfMonth();
		int year=dt.getYear();
		int mValue=dt.getMonthValue();
		
	
		
		
        LocalDate dt2=d2.getValue();
        
        String month2=dt2.getMonth().toString();
		int mo2=dt2.getDayOfMonth();
		int year2=dt2.getYear();
		int mValue2=dt2.getMonthValue();
		
		int ageYear=year2-year;
		int fMavle=0;
		int FDay=0;
	/*	if(mValue2>mValue) {
			
			 fMavle=mValue2-mValue;
		}
		
		else  if(mValue2<mValue) {
			
			 fMavle=mValue2-mValue;
		}*/
		
		
		/*if(mo2>mo) {
			
			 FDay=mo2-mo;
		}
		
		else  if(mo2<mo) {
			
			 FDay=mo2-mo;
		}*/
		Period age1 = Period.between(dt, dt2);
		FDay=age1.getDays();
		fMavle=age1.getMonths();
		
		
		
		
        Age.setText(String.valueOf(ageYear)+" Years "+String.valueOf(fMavle)+" Months "+ String.valueOf(FDay)+" Days ");
        LocalDate nextBD=dt.withYear(dt2.getYear());
        
        if (nextBD.isBefore(dt2) || nextBD.isEqual(dt2)) {
            nextBD = nextBD.plusYears(1);
        }
        Period p = Period.between(dt2, nextBD);
        BirthDay.setText(nextBD.getDayOfWeek()+"\n"+p.getMonths()+" Months "+" "+p.getDays()+" Days");
        
        Year.setText(String.valueOf(ageYear));
		
	    int mon=12*ageYear+fMavle;
	    month1.setText(String.valueOf(mon));
		
		int wek=(int) ChronoUnit.WEEKS.between(dt, dt2);
		week.setText(String.valueOf(wek));
		int day1;
		if(dt.getYear()%4==0) {
			
			 day1=366*ageYear+30*fMavle+FDay;
			Da.setText(String.valueOf(day1));
		}
		
		else {
			
		    day1=365*ageYear+30*fMavle+FDay;
			Da.setText(String.valueOf(day1));
		}
		
		int hour1=24*day1;
		Hours.setText(String.valueOf(hour1));
		
		
		int min=60*hour1;
		Minutes.setText(String.valueOf(min));
		}
		catch(NullPointerException e2) {
			
			error.setText("Please Enter Date");
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
