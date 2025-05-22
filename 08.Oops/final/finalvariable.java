class finalvariable{  
    final int speedlimit=90;//final variable  
    void run(){  
      int speedlimit=400;//we cannot change the final variable  
    }  
    public static void main(String args[]){  
    finalvariable obj=new  finalvariable();  
    obj.run();  
    }  
   }//end of class 