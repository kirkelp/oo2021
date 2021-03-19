public class Main {
 public static void main(String[] args) {
     EstonianID est = new EstonianID("49908202726");
     FinnishID fin = new FinnishID("100190-003K");
     Cat cat = new Cat("Kiki");
     Mouse mouse = new Mouse("miki");

     System.out.println(est.getGender());
     System.out.println(est.getFullYear());
     System.out.println(est.getDOB());
     System.out.println(est.getAge());
     
     System.out.println(fin.getGender());
     System.out.println(fin.getFullYear());
     System.out.println(fin.getDOB());
     System.out.println(fin.getAge());

     System.out.println(cat.speak());
      cat.eat(); 
      cat.sleep();
      cat.beSneaky(); 
      cat.attack(); 
      cat.defend();

     System.out.println(mouse.speak());
      mouse.eat(); 
      mouse.sleep();
      mouse.beSneaky(); 
      mouse.attack(); 
      mouse.defend();
 }   
}
