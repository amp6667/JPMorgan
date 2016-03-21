import java.awt.event.*;

import javax.swing.*;

/**
 * PennStation simulator
 * @author aparkes
 *
 */
public class PennStationGUI implements ActionListener{
	private JFrame initFrame, simulationFrame,ticketFrame;
	private JButton simulation, search, purchase, back, report; 
	private JPanel simulationPanel, ticketPanel;
	
	public PennStationGUI(){
		initFrame = new JFrame();
		initFrame.setSize(200, 400);
		initFrame.setVisible(true);
	}
	
	public void guiButtons(){
		back = new JButton("Return");
		search = new JButton("Search");
		report = new JButton("Report");
		purchase = new JButton("Book This");
		simulation = new JButton("Ticket Simulator");
		
	}
	
	public void buttonActions(){
		back.addActionListener(this);
		search.addActionListener(this);
		report.addActionListener(this);
		purchase.addActionListener(this);
		simulation.addActionListener(this);
	}
	
	public void setupJLabel(){
		simulationPanel = new JPanel();		
		simulationPanel.add(report);
		simulationPanel.add(simulation);
		simulationPanel.add(back);
		ticketPanel = new JPanel();
		ticketPanel.add(purchase);
		
		
		
	}
	
	public void setupJTextField(){
		
	}
	
	public void setupJPanel(){
		
	}
	
	
	public void actionPerformed(ActionEvent ae){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
