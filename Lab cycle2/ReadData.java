import java.io.*; 
class ReadData
{public static void main(String args[]) throws IOException
{
DataInputStream dp = new DataInputStream(System.in); 
String str;   
 int a,b,sum; 
System.out.println("Give me a no.");
str=dp.readLine();  
a=Integer.parseInt(str); 
System.out.println("Give me another no.");
b=Integer.parseInt(dp.readLine());
System.out.println("a   :"+a+"     b:"+b);   
sum=a+b;
System.out.println("a + b=   :"+sum);
System.out.println("Enter yourname");
str=dp.readLine();
System.out.println(" Your name is"+str);
} 
}
