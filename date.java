import java.time.*; 
   
public class date { 
  
public static void m() 
{ 
    LocalDate ob1 = LocalDate.now(); 
    System.out.println("current date is "+ob1); 
   
    LocalTime ob2 = LocalTime.now(); 
    System.out.println("the current time is "+ob2); 
       
    
    LocalDateTime ob3 = LocalDateTime.now(); 
    System.out.println("current date and time : "+ob3);  
    Month month = ob3.getMonth(); 
    int day = ob3.getDayOfMonth(); 
    int seconds = ob3.getSecond(); 
    System.out.println("Month : "+month+" day : "+day+" seconds : "+seconds);    
   
   
} 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        m(); 
    } 
} 