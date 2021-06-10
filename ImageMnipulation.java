import java.io.*; //hello this is applets
import java.awt.*;
public class point{
public static void FindShape(Point p1,Point p2) {
    double dx,dy;
    dx= p1.getX()-p2.getX();
    dy= p1.getY()-p2.getY();
    System.out.println("The given coordinates");
    System.out.println("("+p1.getLocation()+","+p2.getLocation());
    if((dx==0)&&(dy==0))
    System.out.println("Both coordinates are equal");
    else if(p2.getX()==p1.getX())
    System.out.println("The points form a verticle line");
    else if(p2.getY()==p1.getY())
    System.out.println("The points for a horizontal line");
    else if(dx==dy)
    System.out.println("The points form a square");
    else 
    System.out.println("The points form a rectangle");
}
public static void main(String[] args)throws IOException{
     int x1,y1,x2,y2;
     System.out.println("Implementation of point class for image manipulation");
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the x coordinate of p1: ");
     x1=Integer.parseInt(br.readLine());
     System.out.println("Enter the y coordinate of p1: ");
     y1=Integer.parseInt(br.readLine());
     Point p1 = new Point(x1,y1);
     System.out.println("Enter the x coordinate of p1: ");
     x2=Integer.parseInt(br.readLine());
     System.out.println("Enter the x and coordinate of p1: ");
     y2=Integer.parseInt(br.readLine());
     Point p2 = new Point (x2,y2);
     FindShape(p1,p2);
}
}
