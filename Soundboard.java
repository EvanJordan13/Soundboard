import javax.swing.*;
import java.awt.Event.*;    
public class Soundboard extends JFrame {  
public static void main(final String[] args) {  
    final JFrame f=new JFrame("Soundboard");  
    final JButton b=new JButton("Add new audio file");  
    b.setBounds(50,100,150,30); 
    f.add(b);  
    f.setSize(400,400);  
    f.setLocation(300,100);  
    f.setVisible(true); 
    
    
}
}