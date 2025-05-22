final class Bike{}  
  
//We cannot inherit the final class  
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
    Honda honda= new Honda();  
    honda.run();  
   }  
}  