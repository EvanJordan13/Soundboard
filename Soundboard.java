import javax.swing.*;    
public class Soundboard {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Soundboard");  
    JButton b=new JButton("Add new audio file");  
    b.setBounds(50,100,150,30);  
    f.add(b);  
    f.setSize(400,400);  
    f.setLocation(300,100);  
    f.setVisible(true);   
}  