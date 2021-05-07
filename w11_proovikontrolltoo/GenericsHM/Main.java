package GenericsHM;

public class Main {
    public static void main( String args[] ) {  
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'K', 'I', 'R', 'K', 'E',' ','L','I','I','S' };  
  
        System.out.println( "Integer Array" );  
        GenericsHM.printArray(intArray);   
  
       System.out.println( "Character Array" );  
        GenericsHM.printArray(charArray);   
    }   
}  

