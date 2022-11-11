package projectforjava;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class gui
{
    //FRAME VARS
    private JFrame frame;
    private JPanel panel;
    private int height;
    private int width;
    
    //BUTTON BOOLEANS
    private boolean butLogic1;
    private boolean butLogic2;
    private boolean butLogic3;
    private boolean butLogic4;
    private boolean butLogic5;
    private boolean butLogic6;
    private boolean butLogic7;
    private boolean butLogic8;
    
    //BUTTON OBJECTS(JBUTTON?)
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Gate gate1;
    private Gate gate2;
    private Gate gate3;
    
    public gui(int h, int w)
    {
        //INITIALIZE VARS
        frame = new JFrame();
        panel = new JPanel();
        width = w;
        height = h;
        butLogic1 = false;
        butLogic2 = false;
        butLogic3 = false;
        butLogic4 = false;
        butLogic5 = false;
        butLogic6 = false;
        butLogic7 = false;
        butLogic8 = false;
     
        //START FRAME
        frame.setSize(width, height);
        frame.setTitle("Logic Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        //BUTTONS TO FRAME
        but1 = new Button();
        but2 = new Button();
        but3 = new Button();
        but4 = new Button();
        but1.setPreferredSize(new Dimension(50, 50));
        but2.setPreferredSize(new Dimension(50, 50));
        but3.setPreferredSize(new Dimension(50, 50));
        but4.setPreferredSize(new Dimension(50, 50));
        but1.setLocation(400, 50);
        but2.setLocation(200, 100);
        but3.setLocation(200, 150);
        but4.setLocation(200, 200);
        
        //GATES
        gate1 = new Gate(0, but1, but2);
        gate2 = new Gate(0, but3, but4);
        gate3 = new Gate(0, gate1, gate2);
                
        //PANEL ADDITION
        panel.add(but1);
        panel.add(but2);
        //panel.add(but3);
        //panel.add(but4);
        panel.add(gate1);
        //panel.add(gate2);
        //panel.add(gate3);
        
        //ACTION LISTENER FOR BUTTONS
        ActionListener buttonListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if(ae.getSource() == but1)
                {
                    but1.switchPower();
                    butLogic1 = !butLogic1;
                    System.out.println("1 is now " + but1.getPower());
                }
                else if(ae.getSource() == but2)
                {
                    but2.switchPower();
                    System.out.println("2 is now " + but2.getPower());
                }
                else if(ae.getSource() ==  but3)
                {
                    but3.switchPower();
                }
                else if(ae.getSource() == but4)
                {
                    but4.switchPower();
                }
                gate1.updatePower();
                System.out.println(gate1.getSourceL().getPower() + " " + gate1.getSourceR().getPower());
                if(butLogic1)
                {
                    gate1.setText("on");
                }
                else
                {
                    gate1.setText("off");
                }
                gate2.updatePower();
                gate3.updatePower();
            }
        };
        but1.addActionListener(buttonListener);
        but2.addActionListener(buttonListener);
        but3.addActionListener(buttonListener);
        but4.addActionListener(buttonListener);
        
        //SET VISIBLE
        frame.setVisible(true);
    }

    public void updatePowers()
    {
        if(butLogic1)
        {
            but1.setBackground(Color.red);
        }
        else
        {
            but1.setBackground(Color.green);
        }
        if(butLogic2)
        {
            but2.setBackground(Color.red);
        }
        else
        {
            but2.setBackground(Color.green);
        }
        if(butLogic3)
        {
            but3.setBackground(Color.red);
        }
        else
        {
            but3.setBackground(Color.green);
        }
        if(butLogic4)
        {
            but4.setBackground(Color.red);
        }
        else
        {
            but4.setBackground(Color.green);
        }
    }
}
