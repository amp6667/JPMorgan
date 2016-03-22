import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class TrainSimulation{
	private ArrayList <Train> trainOnTracks;
	private String startTime;
	private int delayedTime, changeInPassengers;
	private Date date;
	
	protected String simulatePennStation(){
		generateTrains();
		startTime = "15:30";
		SimpleDateFormat stringToTime = new SimpleDateFormat("HH:mm");
		try{
			date = stringToTime.parse(startTime);
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		while(! startTime.equals("16:00")){
			calendar.add(Calendar.MINUTE,1);			
			startTime = stringToTime.format(calendar.getTime());						
			try {
				date =stringToTime.parse(startTime);
			} catch (ParseException e) {				
				e.printStackTrace();
			}			
		}
		return startTime;
	}
	
	//This may need to move to PennStationGUI
	private void autoComplete(){
		
	}
	
	//Go through the database and generate trains for track simulation
	private void generateTrains(){

	}
	
	private void importTrainData(){
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
