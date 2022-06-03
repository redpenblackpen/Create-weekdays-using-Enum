
package enumsrun;

public class EnumsRun {
    
    public enum weekday{
        
          MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
          
          public boolean isWeekday() {
          return this != SATURDAY && this != SUNDAY;
          }

          public boolean isWeekEnd() {
          return !isWeekday();
          }

     }
    
    public static void main(String[] args) {
        
     for(weekday d: weekday.values()){
         
         switch(d){
          
          case MONDAY:
              
                System.out.print("It's " + d);
                
                   if (d.isWeekday()) {
        
                          System.out.println(" Go to school.");
                          
                          break;
      
                    }else{
        
                          System.out.println(" weekend");
                          
                          break;
      
                    }   
              
          case TUESDAY:
              System.out.print("It's " + d);
                   if (d.isWeekday()) {
        
                          System.out.println(" Go to school.");
                          
                          break;
      
                    }else{
        
                          System.out.println(" weekend");
                          
                          break;
      
                    }
          case WEDNESDAY:
              System.out.print("It's " + d);
                   if (d.isWeekday()) {
        
                          System.out.println(" Go to school.");
                          
                          break;
      
                    }else{
        
                          System.out.println(" weekend");
                          
                          break;
      
                    }
          case THURSDAY:
              System.out.print("It's " + d);
                   if (d.isWeekday()) {
        
                          System.out.println(" Go to school.");
                          
                          break;
      
                    }else{
        
                          System.out.println(" weekend");
                          
                          break;
      
                    }  
          case FRIDAY:
              System.out.print("It's " + d);
                   if (d.isWeekday()) {
        
                          System.out.println(" Go to school.");
                          
                          break;
      
                    }else{
        
                          System.out.println(" weekend");
                          
                          break;
      
                    }     
          case SATURDAY:
              System.out.print("It's " + d);
                   if (d.isWeekEnd()) {
        
                          System.out.println(" weekend");
                          
                          break;
      
                    }else{
        
                          System.out.println(" Go to school.");
                          
                          break;
      
                    }          
          case SUNDAY:
              System.out.print("It's " + d);
                   if (d.isWeekEnd()) {
                          
                          System.out.println(" weekend");
                          
                          break;
      
                    }else{
        
                          System.out.println(" Go to school.");
                          
                          break;
      
                    }
    }
     
     
     }
        
     
      
      
       
   }
 }
        
      
        
    
    

