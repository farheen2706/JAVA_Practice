import java.util.*;
import java.io.*;
public class VM
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int i,cho;
    String temp= new String();
    Vector <String> v = new <String> Vector(10);
      do{
          System.out.println("1.Add an element");
          System.out.println("2.Remove an element");
          System.out.println("3.Display an element");
          System.out.println("Enter your choice");
          cho=Integer.parseInt(br.readLine());
          switch(cho)
          {
              case 1:
                  System.out.println("Add an element");
                  System.out.println("Enter the element to add");
                  temp=br.readLine();
                  v.addElement(temp);
                  System.out.println("Element added");
                  break;
             case 2:
                 System.out.println("Remove element");
                 System.out.println("Enter the element to be Remove:");
                 temp=br.readLine();
                 v.removeElement(temp);
                 System.out.println("Element removed");
                 break;
             case 3:
	          System.out.println("Display an element");
	          System.out.println("The elements are:"+v);
	          break;
             default:
             System.exit(0);
                  
          }
          
      }while(cho<=2);
  }
}