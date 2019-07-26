
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.Graphics;

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
	  
	      
	    public void paint(Graphics g) {  
	        g.drawString("Hello",40,40);  
	        setBackground(Color.WHITE);  
	        g.fillRect(130, 30,100, 80);  
	        g.drawOval(30,130,50, 60);  
	        setForeground(Color.RED);  
	        g.fillOval(130,130,50, 60);  
	        g.drawArc(30, 200, 40,50,90,60);  
	        g.fillArc(30, 130, 40,50,180,40);  
	          
	    }  
	
	
	
	
	
/*	public class Oval {
		int x, y, width,height;
		
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	 public void draw(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g;
	        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
	        g2d.setColor(Color.GRAY);
	        g2d.fill(circle);
	    }

	
	}
	*/
	
	public static void main(String args[])
	{
	Main thisFrame = new Main();
	thisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	thisFrame.setSize(200,200);	
	  thisFrame.add(thisFrame);  
	  thisFrame.setSize(400,400);  
      //f.setLayout(null);  
	  thisFrame.setVisible(true);  
  }  
      
		  }
		
	
	

