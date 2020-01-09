import javax.swing.*;                   //imports
import java.awt.event.ActionEvent;      //imports
import java.awt.event.ActionListener;   //imports
 
public class Soundboard extends JFrame implements ActionListener {  //create class with JFrame and ActionListener
    /**
     *
     */
    private static final long serialVersionUID = 1L;           // TODO find out what the heck this does

    public static void main(final String[] args) {             // Main method
    final JFrame f=new JFrame("Soundboard");                   // Create the window 
    final JButton b=new JButton("Add new audio file");         // Create the JButton  
    b.setBounds(50,100,150,30);                                // Create button boundaries
    b.addActionListener(new ActionListener(){                  // Add the ActionListener to the JButton
        
        public void actionPerformed(final ActionEvent e) {     // Create method to do when JButton is pressed
                System.out.println("You have added a file");   /**Task to execute when button is pressed  
                                                                  TODO Research how to add audio files to java
                                                                  application
                                                                    */ 
            }

        });
        f.add(b);                                             // Add the JButton to the JFrame
        f.setSize(400, 400);                                  // Set the size of the JFrame
        f.setLocation(300, 100);                              // Set the location of the JFrame
        f.setVisible(true);                                   // Make the JFrame visable

    }

    @Override
    public void actionPerformed(final ActionEvent e) {        // TODO find out what the heck frick this does
        

    }

    
}