import java.util.*;//util
import java.io.*;
public class calendar {
    public static void main(String[] args) throws IOException
    {
        GregorianCalendar gc= new GregorianCalendar();
        Calendar c = Calendar.getInstance();
        Calendar c1= Calendar.getInstance();
        int m,y,ch,d1;
        long age;
        char d;
        String str_var = new String();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("GREGORIAN CALENDAR");
        do{
            System.out.println("1.display today's  date,month,year");
            System.out.println("2.Set today's date,month,year");
            System.out.println("3.find day of the week");
            System.out.println("4. age calculation");
            System.out.println("5.exit");
            System.out.println(" enter your choice");
            ch= Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                System.out.println("1. display today's  date,month,year");
                System.out.println("today's date is:"+gc.get(GregorianCalendar.DATE)+"/"+gc.get(GregorianCalendar.MONTH)+"/"+gc.get(GregorianCalendar.YEAR));
                break;
                case 2:
                System.out.println("2.Set today's date,month,year");
                System.out.println("Enter new date");
                d1= Integer.parseInt(br.readLine());
                System.out.println("Enter new month");
                m=Integer.parseInt(br.readLine());
                System.out.println("Enter new year");
                y=Integer.parseInt(br.readLine());
                gc.set(GregorianCalendar.DATE,d1);
                gc.set(GregorianCalendar.MONTH,m);
                gc.set(GregorianCalendar.YEAR,y);
                System.out.println("today's date is:"+gc.get(GregorianCalendar.DATE)+"/"+gc.get(GregorianCalendar.MONTH)+"/"+gc.get(GregorianCalendar.YEAR));
                break;
                case 3:
                System.out.println("3.find day of the week");
                System.out.println("The days of week is:");
                System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
                break;
                case 4:
                System.out.println("4. age calculation");
                System.out.println("Enter your date of birth");
                d1= Integer.parseInt(br.readLine());
                System.out.println("Enter new month");
                m=Integer.parseInt(br.readLine());
                System.out.println("Enter new year");
                y=Integer.parseInt(br.readLine());
                c1.set(GregorianCalendar.DATE,d1);
                c1.set(GregorianCalendar.MONTH,m);
                c1.set(GregorianCalendar.YEAR,y);
                System.out.println("the date has been set:"+gc.get(GregorianCalendar.DATE)+"/"+gc.get(GregorianCalendar.MONTH)+"/"+gc.get(GregorianCalendar.YEAR));
                age= ((c.getTimeInMillis()- c1.getTimeInMillis())/(1000*60*60*24)/365);
                System.out.println("Age is:"+age);
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid choice");
            }
            System.out.println("do you want to continue:");
            str_var = br.readLine();
            d = str_var.charAt(0);

        }while(d=='Y'||d=='y');
    }
    
}
