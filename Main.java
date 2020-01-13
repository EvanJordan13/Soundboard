import javax.swing.*;                 //imports
import java.awt.event.ActionEvent;    //imports
import java.awt.event.ActionListener; //imports
import java.awt.GridLayout;           //imports


public class Main extends JFrame implements ActionListener { // create class with JFrame and ActionListener
  
  private static final long serialVersionUID = 1L;           // TODO find out what the heck this does
  public static void main(final String[] args) {             // Main method
    String filepath = "t1_be_back.wav";
    Music musicObject = new Music();   
    JFrame frame;    
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16; //Create buttons
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12, panel13, panel14, panel15, panel16;                  //Create panels
     
     frame = new JFrame("Soundboard");                //Create the window of the soundboard
     button1 = new JButton("I'll be back");      //Button creation
     button2 = new JButton("I'll be back");     //Button creation   
     button3 = new JButton("I'll be back");     //Button creation
     button4 = new JButton("I'll be back");     //Button creation
     button5 = new JButton("I'll be back");     //Button creation
     button6 = new JButton("I'll be back");     //Button creation
     button7 = new JButton("I'll be back");     //Button creation
     button8 = new JButton("I'll be back");     //Button creation
     button9 = new JButton("I'll be back");     //Button creation
     button10 = new JButton("I'll be back");    //Button creation
     button11 = new JButton("I'll be back");    //Button creation
     button12 = new JButton("I'll be back");    //Button creation
     button13 = new JButton("I'll be back");    //Button creation
     button14 = new JButton("I'll be back");    //Button creation
     button15 = new JButton("I'll be back");    //Button creation
     button16 = new JButton("I'll be back");    //Button creation
     
     panel1 = new JPanel();                      //Panel Creation
     panel2 = new JPanel();                      //Panel Creation
     panel3 = new JPanel();                      //Panel Creation
     panel4 = new JPanel();                      //Panel Creation
     panel5 = new JPanel();                      //Panel Creation
     panel6 = new JPanel();                      //Panel Creation
     panel7 = new JPanel();                      //Panel Creation
     panel8 = new JPanel();                      //Panel Creation
     panel9 = new JPanel();                      //Panel Creation
     panel10 = new JPanel();                     //Panel Creation
     panel11 = new JPanel();                     //Panel Creation
     panel12 = new JPanel();                     //Panel Creation
     panel13 = new JPanel();                     //Panel Creation
     panel14= new JPanel();                      //Panel Creation
     panel15= new JPanel();                      //Panel Creation
     panel16= new JPanel();                      //Panel Creation
    
     button1.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });
    
     button2.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });
    
    button3.addActionListener(new ActionListener() {     // Add the ActionListener to the JButton
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button4.addActionListener(new ActionListener() {     // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button5.addActionListener(new ActionListener() {     // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button6.addActionListener(new ActionListener() {     // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button7.addActionListener(new ActionListener() {     // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button8.addActionListener(new ActionListener() {     // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button9.addActionListener(new ActionListener() {     // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button10.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button11.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button12.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button13.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });
    button14.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button15.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });

    button16.addActionListener(new ActionListener() {    // Add the ActionListener to the JButton
    
      public void actionPerformed(final ActionEvent e) { // Create method to do when JButton is pressed
        musicObject.playMusic(filepath);
      }
    });
    
    
    panel1.add(button1);                         //Add button to panel
    panel2.add(button2);                         //Add button to panel
    panel3.add(button3);                         //Add button to panel
    panel4.add(button4);                         //Add button to panel
    panel5.add(button5);                         //Add button to panel
    panel6.add(button6);                         //Add button to panel
    panel7.add(button7);                         //Add button to panel
    panel8.add(button8);                         //Add button to panel
    panel9.add(button9);                         //Add button to panel
    panel10.add(button10);                       //Add button to panel
    panel11.add(button11);                       //Add button to panel
    panel12.add(button12);                       //Add button to panel
    panel13.add(button13);                       //Add button to panel
    panel14.add(button14);                       //Add button to panel
    panel15.add(button15);                       //Add button to panel
    panel16.add(button16);                       //Add button to panel
  
    frame.add(panel1);                           //Add panel to frame
    frame.add(panel2);                           //Add panel to frame
    frame.add(panel3);                           //Add panel to frame
    frame.add(panel4);                           //Add panel to frame
    frame.add(panel5);                           //Add panel to frame
    frame.add(panel6);                           //Add panel to frame
    frame.add(panel7);                           //Add panel to frame
    frame.add(panel8);                           //Add panel to frame
    frame.add(panel9);                           //Add panel to frame
    frame.add(panel10);                          //Add panel to frame
    frame.add(panel11);                          //Add panel to frame
    frame.add(panel12);                          //Add panel to frame
    frame.add(panel13);                          //Add panel to frame
    frame.add(panel4);                           //Add panel to frame
    frame.add(panel15);                          //Add panel to frame
    frame.add(panel16);                          //Add panel to frame

    frame.setLayout(new GridLayout(0,3));
    frame.setSize(400, 400);                     // Set the size of the JFrame
    frame.setLocation(300, 100);                 // Set the location of the JFrame
    frame.setVisible(true);                      // Make the JFrame visable

  }

  @Override
  public void actionPerformed(final ActionEvent e) { // TODO find out what the heck frick this does

  }

}
