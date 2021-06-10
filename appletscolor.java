#note: applets cannot be executed in jdk version 11 or less as it is an outdated concept
 import java.awt.Color;
 import java.awt.FlowLayout;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.*;
 public class button_clicked extends JFrame implements ActionListener{
   
   private JButton btn;
   private JButton red,blue,green,yellow,orange;
   private JLabel label;
   
   public button_clicked()
   {
     btn = new JButton("Click here to change label");
     btn.addActionListener(this);
     add(btn);
     
     red = new JButton("red");
     red.addActionListener(this);
     add(red);
     
     green = new JButton("green");
     green.addActionListener(this);
     add(green);
     blue = new JButton("blue");
     blue.addActionListener(this);
     add(blue);
     yellow = new JButton("yellow");
     yellow.addActionListener(this);
     add(yellow);
     orange = new JButton("orange");
     orange.addActionListener(this);
     add(orange);
     
     
     setLayout(new FlowLayout());
     setSize(700,700);
     setTitle("Bit Life - Java program Buttons Clicked");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     
     label = new JLabel("what is happening ?");
     add(label);
     
   }
   
   public static void main(String[] args) 
   {
     new button_clicked();
   }
   
   public void actionPerformed(ActionEvent e) 
   {
     if(e.getSource() == btn)
     {
       label.setText("button clicked");
       
     }
     
     if (e.getSource() == red)
     {
       label.setText("red selected");
       getContentPane().setBackground(Color.RED);
       
     }
     
     if (e.getSource() == green)
     {
       label.setText("green selected");
       getContentPane().setBackground(Color.GREEN);
     }
     
     if(e.getSource() == blue)
     {
       label.setText("blue selected");
       getContentPane().setBackground(Color.BLUE);
     }
     if(e.getSource() == yellow)
     {
       label.setText("yellow selected");
       getContentPane().setBackground(Color.YELLOW);
     }
     if(e.getSource() == orange)
     {
       label.setText("orange selected");
       getContentPane().setBackground(Color.ORANGE);
     }
   }
 }