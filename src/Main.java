package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {



    public static void main (String[]args) {
//main frame
    JFrame window = new JFrame ("WriteIt! your task companion");
    window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    window.setSize(800,600);

// Create the main panel
CardLayout cardLayout = new CardLayout();
JPanel mainPanel = new JPanel(cardLayout);
 

//topbar panel for menus/the bar is like the top sectioning above like a border "BorderLayput aligns components to North, south, east, west and center"
    JPanel topbar = new JPanel (new BorderLayout());
    topbar.setBackground(Color.decode("#89f594"));




//adding menu image icon to the top bar
    ImageIcon menu = new ImageIcon ("images/menu.png");
    JButton menubtn = new JButton (menu);
    menubtn.setPreferredSize( new Dimension (30,30));
    topbar.add (menubtn, BorderLayout.WEST);


//This RightPanel("RightPanel is for the right side og the top bar"), then we will put our light and dark mode components there
   JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 1, 0));

//adding darkmode icon to top bar using RIGHT PANEL 
     ImageIcon darkmode = new ImageIcon ("images/dark.gif");
        JButton darkbtn = new JButton (darkmode);
        darkbtn.setPreferredSize (new Dimension (30,30));
        rightPanel.add (darkbtn);

// adding light button to top bar 
    ImageIcon lightmode =new ImageIcon ("images/suny.gif");
       JButton lightbtn = new JButton (lightmode);
       lightbtn.setPreferredSize (new Dimension (30,30));
       rightPanel.add (lightbtn);
    
       topbar.add (rightPanel,BorderLayout.EAST);

//note button
    JPanel notePanel = new JPanel (new FlowLayout(FlowLayout.LEFT,1,20));
    
    notePanel.setPreferredSize(new Dimension (25,25));
    notePanel.setBackground(Color.decode("#fc4e7d"));
    notePanel.setBorder(BorderFactory.createEmptyBorder(0,40,0,0));
    ImageIcon addNote = new ImageIcon ("images/pencil.png");
          
        //JButton addNote
        JButton addNotebutton = new JButton (addNote);
        addNotebutton.setPreferredSize (new Dimension (50,50));
        addNotebutton.setBackground(Color.WHITE);
       
    //Label for addnote button 
        JLabel addnoteLabel = new JLabel ("Add Note");
        addnoteLabel.setBorder(BorderFactory.createEmptyBorder(30, 5, 0, 0));
        notePanel.add (addNotebutton);
        notePanel.add (addnoteLabel);

     

        //CardLayout Panel for tab switching
    JPanel newNote = new JPanel ();
    newNote.setBackground (Color.decode("#1f0924"));

    //main panel 
    mainPanel.add(notePanel, "MainDashboard");
    mainPanel.add(newNote,"newNote");

    //actionListener addnote
        addNotebutton.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                
                cardLayout.show (mainPanel, "newNote");
            }
        });
        



    //window.getContentPane().setBackground(Color.decode("#f77799")); 
    //getContentPane method is part of java swing librrary so you cannot rename it!
    window.add (topbar,BorderLayout.NORTH);
    //window.add(notePanel,BorderLayout.CENTER);
     window.add (mainPanel);
    window.setVisible(true); 

   } 
}
