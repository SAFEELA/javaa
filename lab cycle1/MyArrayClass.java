import java.io.*;
import java.util.Scanner;
class MyArrayClass
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println(" Give me the size of the array:");
int n=sc.nextInt();
int a[]=new int[n];for (int i=0; i<n; i++)
{
System.out.println("Element an element:");
a[i]=sc.nextInt();
}
for (int i=0; i<n; i++)
{
System.out.println("Element at position "+i+" is" +a[i]);
}}}