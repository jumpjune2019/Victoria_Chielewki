import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener
{
	private JPanel controlPanel;
	private JButton m_btn1;
	private Color[] colors = new Color[] {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK, Color.red, Color.orange};
	private int index;
	public Main()
	{
	initialize();
	}
	
	JPanel panel = new JPanel();

	private void initialize()
	{
	index = 0;
   // panel.setBackground(colors[index]);
    panel.setSize(300,300);
	m_btn1 = new JButton("Change Color");
	m_btn1.addActionListener(this);
	//panel.addActionListener(this);
	setLayout(new BorderLayout());
	add(m_btn1, BorderLayout.SOUTH);
	add(panel);
	}
	  
	public void actionPerformed(ActionEvent e)
	{
	if(index < (colors.length - 1))
	{
	index++;
	}
	else
	{
	index = 0;
	}
	panel.setBackground(colors[index]);
	}
	 
	
	
	public class Oval {
		int x, y, width,height;
		
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g) {
        int xPoints[] = {9, 15, 0, 18, 3};
        int yPoints[] = {0, 18, 6, 6, 18};
	
	
	}
	}
	
	public static void main(String args[])
	{
	Main thisFrame = new Main();
	thisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	thisFrame.setSize(200,200);
	thisFrame.setVisible(true);
	}
	
}


