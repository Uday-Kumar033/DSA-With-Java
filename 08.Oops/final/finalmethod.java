class finalmethod{  
    final void run(){System.out.println("running");}  
  }  
       
  class Honda extends finalmethod{  
     //We cannot override the final method  
     void run(){System.out.println("running safely with 100kmph");}  
       
     public static void main(String args[]){  
     Honda honda= new Honda();  
     honda.run();  
     }  
  }  