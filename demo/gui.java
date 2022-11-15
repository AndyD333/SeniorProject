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
    //THE CUSTOM OBJECTS AREN'T WORKING, WITH JPANELS SO INSTEAD EVERYTHING WILL
    //BE FULLY WRITTEN OUT WITH BOOLEANS ANDD INTS
    private boolean butLogic1;
    private boolean butLogic2;
    private boolean butLogic3;
    private boolean butLogic4;
    private boolean gateLogic1;
    private boolean gateLogic2;
    private boolean gateLogic3;
    private int gateType1;
    private int gateType2;
    private int gateType3;
    
    //BUTTON OBJECTS
    private JButton but1;
    private JButton but2;
    private JButton but3;
    private JButton but4;
    private JLabel gate1;
    private JLabel gate2;
    private JLabel gate3;
    
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
        gateLogic1 = false;
        gateLogic2 = false;
        gateLogic3 = false;
        gateType1 = 0;
        gateType2 = 0;
        gateType3 = 0;
        
        gate1 = new JLabel();
        gate2 = new JLabel();
        gate3 = new JLabel();
        
        
     
        //START FRAME
        frame.setSize(width, height);
        frame.setTitle("Logic Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        //BUTTONS TO FRAME
        but1 = new JButton();
        but2 = new JButton();
        but3 = new JButton();
        but4 = new JButton();
        but1.setPreferredSize(new Dimension(50, 50));
        but2.setPreferredSize(new Dimension(50, 50));
        but3.setPreferredSize(new Dimension(50, 50));
        but4.setPreferredSize(new Dimension(50, 50));
        but1.setLocation(200, 50);
        but2.setLocation(200, 100);
        but3.setLocation(200, 150);
        but4.setLocation(200, 200);
        updatePowers();
        
        //GATES
        
        
        //PANEL ADDITION
        panel.add(but1);
        panel.add(but2);
        panel.add(but3);
        panel.add(but4);
        panel.add(gate1);
        panel.add(gate2);
        panel.add(gate3);
        
        //ACTION LISTENER FOR BUTTONS
        ActionListener buttonListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if(ae.getSource() == but1)
                {
                    butLogic1 = !butLogic1;
                }
                else if(ae.getSource() == but2)
                {
                    butLogic2 = !butLogic2;
                }
                else if(ae.getSource() ==  but3)
                {
                    butLogic3 = !butLogic3;
                }
                else if(ae.getSource() == but4)
                {
                    butLogic4 = !butLogic4;
                }
                
                updatePowers();
            }
        };
        //ADD BUTTONS TO LISTENER
        but1.addActionListener(buttonListener);
        but2.addActionListener(buttonListener);
        but3.addActionListener(buttonListener);
        but4.addActionListener(buttonListener);
        
        //SET VISIBLE
        frame.setVisible(true);
    }

    public void updatePowers()
    {
        //BACKGROUND COLORS
        if(!butLogic1)
        {
            but1.setBackground(Color.red);
        }
        else
        {
            but1.setBackground(Color.green);
        }
        if(!butLogic2)
        {
            but2.setBackground(Color.red);
        }
        else
        {
            but2.setBackground(Color.green);
        }
        if(!butLogic3)
        {
            but3.setBackground(Color.red);
        }
        else
        {
            but3.setBackground(Color.green);
        }
        if(!butLogic4)
        {
            but4.setBackground(Color.red);
        }
        else
        {
            but4.setBackground(Color.green);
        }
        
        //GATE LOGIC
            //Gate 1
            if(gateType1 == 0)//AND GATE
            {
                if(butLogic1 && butLogic2)
                {
                   gateLogic1 = true;
                }
                else
                {
                    gateLogic1 = false;
                }
            }
            else if(gateType1 == 1)//OR GATE
            {
                if(butLogic1 || butLogic2)
                {
                    gateLogic1 = true;
                }
                else
                {
                    gateLogic1 = false;
                }
            }
            else if(gateType1 == 2)//NAND GATE
            {
                if(!butLogic1 || !butLogic2)
                {
                  gateLogic1 = true;
                }
                else
                {
                    gateLogic1 = false;
                }
            }
            else if(gateType1 == 3)//NOR GATE
            {
                if(!butLogic1 && !butLogic2)
                {
                    gateLogic1 = true;
                }
                else
                {
                    gateLogic1 = false;
                }
            }
            else if(gateType1 == 4)//XOR GATE
            {
                if(butLogic1 != butLogic2)
                {
                    gateLogic1 = true; 
                }
                else
                {
                    gateLogic1 = false;
                }
            }
            else//INCORRECT INPUT
            {
                System.out.println("you've messed up horribly: nice job");
                gateLogic1 = false;
            }
        
            //Gate 2
            if(gateType2 == 0)//AND GATE
            {
                if(butLogic3 && butLogic4)
                {
                   gateLogic2 = true;
                }
                else
                {
                    gateLogic2 = false;
                }
            }
            else if(gateType2 == 1)//OR GATE
            {
                if(butLogic3 || butLogic4)
                {
                    gateLogic2 = true;
                }
                else
                {
                    gateLogic2 = false;
                }
            }
            else if(gateType2 == 2)//NAND GATE
            {
                if(!butLogic3 || !butLogic4)
                {
                  gateLogic2 = true;
                }
                else
                {
                    gateLogic2 = false;
                }
            }
            else if(gateType2 == 3)//NOR GATE
            {
                if(!butLogic3 && !butLogic4)
                {
                    gateLogic2 = true;
                }
                else
                {
                    gateLogic2 = false;
                }
            }
            else if(gateType2 == 4)//XOR GATE
            {
                if(butLogic3 != butLogic4)
                {
                    gateLogic2 = true; 
                }
                else
                {
                    gateLogic2 = false;
                }
            }
            else//INCORRECT INPUT
            {
                System.out.println("you've messed up horribly: nice job");
                gateLogic1 = false;
            }
            
            //Gate 2
            if(gateType3 == 0)//AND GATE
            {
                if(gateLogic1 && gateLogic2)
                {
                   gateLogic3 = true;
                }
                else
                {
                    gateLogic3 = false;
                }
            }
            else if(gateType3 == 1)//OR GATE
            {
                if(gateLogic1 || gateLogic2)
                {
                    gateLogic3 = true;
                }
                else
                {
                    gateLogic3 = false;
                }
            }
            else if(gateType3 == 2)//NAND GATE
            {
                if(!gateLogic1 || !gateLogic2)
                {
                  gateLogic3 = true;
                }
                else
                {
                    gateLogic3 = false;
                }
            }
            else if(gateType3 == 3)//NOR GATE
            {
                if(!gateLogic1 && !gateLogic2)
                {
                    gateLogic3 = true;
                }
                else
                {
                    gateLogic3 = false;
                }
            }
            else if(gateType3 == 4)//XOR GATE
            {
                if(gateLogic1 != gateLogic2)
                {
                    gateLogic3 = true; 
                }
                else
                {
                    gateLogic3 = false;
                }
            }
            else//INCORRECT INPUT
            {
                System.out.println("you've messed up horribly: nice job");
                gateLogic1 = false;
            }
        
        
        //GATE INTERFACE
        if(gateLogic1)
        {
            gate1.setText("on");
        }
        else
        {
            gate1.setText("off");
        }
        if(gateLogic2)
        {
            gate2.setText("on");
        }
        else
        {
            gate2.setText("off");
        }
        if(gateLogic3)
        {
            gate3.setText("on");
        }
        else
        {
            gate3.setText("off");
        }
    }
}
