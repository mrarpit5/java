import java.util.*;

class c1 implements Observer 
{ 
    public void data(Observable obj, Object arg)  
    { 
        System.out.println("Observer1 is added"); 
    } 
}
class c2 extends Observable 
{ 
    void info()  
    { 
        setChanged(); 
        notifyObservers(); 
    } 
} 
  
class obs
{ 
    // Driver method of the program 
    public static void main(String args[])  
    { 
       	c2 obj = new c2(); 
        c1 cob = new c1(); 
        obj.addObserver(cob); 
        obj.info(); 
    } 
} 
