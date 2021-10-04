class Box
{
int width;
int height;
int depth;
void readValues()
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter width:");
width=sc.nextInt();
System.out.println(" enter height:");
height=sc.nextInt();
System.out.println(" enter depth:");
depth=sc.nextInt();}
void volume( ) 
{ System.out.print("Volume is ");
System.out.println(width*height*depth); } 
}
class BoxDemo
{ public static void main(String a[])
{ Box mybox=new Box();
int vol;
mybox.readValues();
mybox.volume();
}
}