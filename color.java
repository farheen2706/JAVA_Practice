import java.awt.*;   
public class color extends Frame
{			
  String s1, s2, s3;
  Color clr1, clr2, clr3;
  Font f1, f2, f3;

  public color() 
  {              	    
    s1 = "Welcome to applet";

    f1 = new Font("DialogInput", Font.BOLD, 20);
   

    setTitle("Attractive Strings"); 
    setSize(425,375);    
    setVisible(true);  
  }
  public void paint(Graphics g)
  {
    g.drawString(s1, 50, 60);  
                                
    g.setColor(Color.green);     
    g.setFont(f1); 
  }                                    
  public static void main(String args[])
  {
    new color();
  }
}
