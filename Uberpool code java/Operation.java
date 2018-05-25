import java.util.*;
class Operation extends Uberpool {

  ArrayList<String> al = new  ArrayList<String>();
    
      public void addop(String s){
        if(al.size()>2)
        {
          System.out.println( " Mr." +s +"  cab seats are full ");
        }else{
        al.add(s);}}
      
      public void dispop(){
      
        System.out.println( " ++ PEOPLE IN THE CAB ++  " );
        for(String i : al){
          System.out.println(" * " +i);       }
        }
       
      public void removeop(String s){
          if(al.size()==0)
        {
          System.out.println( " Mr." +s +"  cab seats are full ");
        }else{
        al.remove(s);
        System.out.println(" " +s + "  left the cab");}
         }
  
}