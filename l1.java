    interface inte
    {  
        public String f();  
    }  
    public class l1
    {  
        public static void main(String[] args) 
        {  
            inte s=()->{  return "this is demo"; };  
            System.out.println(s.f());  
        }  
    }  