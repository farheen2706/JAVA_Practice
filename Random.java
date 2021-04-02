 import java .util.Random;
import java.io.*;
public class random
{
public static void main(String args[])throws IOException
{
int i,j,temp,n;
Random rand=new Random();
System.out.println("\t\t Generates Random Numbers");
System.out.println("Enter the number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
for(i=0;i<a.length;i++)
{
a[i]=rand.nextInt(100);
System.out.println(a[i]);
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("the number in order are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

