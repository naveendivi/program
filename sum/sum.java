import java.io.*;
import java.util.*;
public class sum
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=a+b;
if(c%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
