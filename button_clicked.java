import java.awt.FlowLayout;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.*;
 public class button_clicked extends JFrame implements ActionListener{
   
   private JButton btn;
   
   private JLabel label;
   
   public button_clicked()
   {
     btn = new JButton("Click here to change label");
     btn.addActionListener(this);
     add(btn);
     

     
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
       label.setText("button clicked check");
       
     }
     
    
   }
 }
