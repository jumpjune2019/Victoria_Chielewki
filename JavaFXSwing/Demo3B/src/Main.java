import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener {
	
	JButton btn;
	JButton btn2;
	JLabel jlabPrompt, jlabContents;
	private JPanel TryMe;
	
	
	Main()  {
		// Create a new JFrame container.
		JFrame jfrm = new JFrame("Peace");
		// Specify FlowLayout for the layout manager.
		jfrm.setLayout(new FlowLayout());
		// Give the frame an initial size.
		jfrm.setSize(250, 250);
		// Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create the Reverse button.
		JButton btn = new JButton("Alpha'");
		JButton btn2 = new JButton("Beta");
		// Add action listeners.
		btn.addActionListener(this); //
		btn2.addActionListener(this);
		// Create the labels.
		jlabContents = new JLabel("Press me");
		// Add the components to the content pane.
		//jfrm.add(jlabPrompt);
		jfrm.add(btn);
		jfrm.add(btn2);
		jfrm.add(jlabContents);
		// Display the frame.
		jfrm.setVisible(true);
	}
	
	
//handles actions on button
	public void actionPerformed(ActionEvent ae){
	//	TheFlip.setToolTipText(ae.getActionCommand());
		String action = ae.getActionCommand();
		switch(action) {
			case "Beta":
				jlabContents.setText("You pressed Beta!!! ");	
				break;
				
			case "Alpha'": 
					
				jlabContents.setText(" You pressed Alpha!!!");	
				
				break;
		}
	}
	
	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						new Main(); //
					}
				});
	} //public main

}//closes main
	
		
			