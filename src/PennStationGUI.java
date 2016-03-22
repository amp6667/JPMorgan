import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * PennStation simulator
 * @author aparkes
 *
 */
public class PennStationGUI extends TrainSimulation implements ActionListener{
	private JFrame initFrame, simulationFrame,ticketFrame;
	private JButton simulation, search, purchase, back, report, enter,exit; 
	private JPanel initPanel,simulationPanel, ticketPanel;
	private JProgressBar progressBar;
	private static JTextArea window;
	
	public PennStationGUI(){
		initFrame = new JFrame();
		guiButtons();
		buttonActions();
		setupJPanel();
		initFrame.add(initPanel);
		initFrame.setSize(200, 400);
		initFrame.setVisible(true);
		initFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void simulationGUI(){
		simulationFrame = new JFrame();
		setupJTextArea();
		setupJProgressBar();
		simulationFrame.add(new JScrollPane(window));
		simulationFrame.add(progressBar,BorderLayout.NORTH);
		simulationFrame.add(simulationPanel,BorderLayout.SOUTH);
		simulationFrame.setSize(600,600);
		simulationFrame.setVisible(true);
		simulationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void ticketGUI(){
		ticketFrame = new JFrame();
		ticketFrame.setSize(600, 600);
		ticketFrame.setVisible(true);
		ticketFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void guiButtons(){
		back = new JButton("Return");
		exit = new JButton("Exit");
		enter = new JButton("Enter");
		search = new JButton("Book a Trip");
		report = new JButton("Report");
		purchase = new JButton("Book This");
		simulation = new JButton("Train Simulator");
		
	}
	
	private void buttonActions(){
		back.addActionListener(this);
		exit.addActionListener(this);
		search.addActionListener(this);
		report.addActionListener(this);
		purchase.addActionListener(this);
		simulation.addActionListener(this);
	}
	
	private void setupJPanel(){
		initPanel = new JPanel(new GridLayout(3,1));
		initPanel.add(simulation);
		initPanel.add(search);
		initPanel.add(exit);
		simulationPanel = new JPanel();		
		simulationPanel.add(report);
		simulationPanel.add(back);
		ticketPanel = new JPanel();
		ticketPanel.add(purchase);
		ticketPanel.add(enter);		
	}
	
	private void setupJTextArea(){
		window = new JTextArea(400,500);
		
	}
	
	
	
	private void setupJLabel(){
	
	}
	
	private void setupJProgressBar(){
		progressBar = new JProgressBar(0,100);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
	}
	public void actionPerformed(ActionEvent ae){
		String name = ae.getActionCommand();
		switch(name){
		case "Exit":
			System.exit(0);			
		case "Train Simulator":
			initFrame.setVisible(false);
			initFrame.setEnabled(false);			
			simulationGUI();
			break;
		case "Return":
			if(simulationFrame.isVisible()){				
				simulationFrame.dispose();
			}
			else{
				ticketFrame.dispose();
			}
			initFrame.setVisible(true);
			initFrame.setEnabled(true);
			break;
		case "Report":
			TrainSimulation ts = new TrainSimulation();
			ts.simulatePennStation();
			break;
		case "Book This":
			//Write to database
			break;
		case "Book a Trip":
			initFrame.setVisible(false);
			initFrame.setEnabled(false);			
			ticketGUI();
			break;
		case "Enter":
			//Search and generate price. Autocomplete box needs to be created
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		PennStationGUI ps = new PennStationGUI(); 
	}

}
