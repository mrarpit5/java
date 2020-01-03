@FunctionalInterface   
interface num
{  
    public void value();  
}  
      
public class l2 
{  
    public static void main(String[] args) 
    {  
        int n=10;  
              
        //with lambda  
        num ob = ()-> {  System.out.println("nuber is "+n); };  
        ob.value();  
    }  
}  