
// Java Program to create a simple group of radio buttons  
// (with image )and add item listener to them 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class Main extends JFrame implements ItemListener { 
  
    // frame 
    static JFrame f; 
  
    // radiobuttons 
    static JRadioButton b, b1, b2, b3; 
  
    // create a label 
    static JLabel l1; 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame 
        f = new JFrame("frame"); 
        f.setPreferredSize(new Dimension(160,160));
        // create a object 
        Main s = new Main(); 
  
        // create a panel 
        JPanel p = new JPanel(); 
  
        // create a new label 
        JLabel l = new JLabel("Radio Button"); 
        l1 = new JLabel("Radio Button"); 
  
        // create Radio buttons 
        b = new JRadioButton("Train"); 
        b1 = new JRadioButton("Car"); 
        b2 = new JRadioButton("Plane");
        b3 = new JRadioButton("Boat");
        
        // create a button group 
        ButtonGroup bg = new ButtonGroup(); 
  
        // add item listener 
        b.addItemListener(s); 
        b1.addItemListener(s); 
        b2.addItemListener(s); 
        b3.addItemListener(s);
        // add radio buttons to button group 
        bg.add(b); 
        bg.add(b1); 
        bg.add(b2); 
        bg.add(b3); 
  
        b.setSelected(true); 
  
        // add button and label to panel 
        p.add(l); 
        p.add(b); 
        p.add(b1); 
        p.add(b2); 
        p.add(b3);
        p.add(l1); 
  
        f.add(p); 
  
        // set the size of frame 
        f.setSize(400, 400); 
  
        f.show(); 
    } 
  
    public void itemStateChanged(ItemEvent e) 
    { 
        if (e.getSource() == b) { 
            if (e.getStateChange() == 1) { 
                l1.setText("Train"); 
            } 
        } 
         
        if (e.getSource() == b1) {
            if (e.getStateChange() == 1) { 
                l1.setText("Car"); 
            } 
        }
        
        if (e.getSource() == b2) {	  
            if (e.getStateChange() == 1) { 
                l1.setText("Plane"); 
            }
        }
        
        if (e.getSource() == b3) {
            if (e.getStateChange() == 1) { 
                l1.setText("Boat"); 
            } 
        } 
    } 
}
