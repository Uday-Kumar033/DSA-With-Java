
class Q4_privateMethod
{
private int data=40;  
private void msg()
{
System.out.println("Hello java");
}    
public static void main(String args[])
{ 

   Q4_privateMethod obj=new Q4_privateMethod();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}  