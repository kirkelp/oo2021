package homework;

public class Main {
    public static void main(String[] args) {
      Cat cat = new Cat("Mjäu","Miisu","kala");
      cat.favouriteToyIs("hiir");
      cat.hungry();
      cat.eating();
      System.out.println("Kass tervitab: " + cat.sound);

      System.out.println(" ");

      Dog dog = new Dog("AUH","Bruno","liha");
      dog.favouriteToyIs("kass");
      dog.hungry();
      dog.eating();
      System.out.println("Koer tervitab; " + dog.sound);
      
      
      System.out.println(" ");

      Mouse mouse = new Mouse("piiks","Miki","muru");
      mouse.favouriteToyIs("pall");
      mouse.hungry();
      mouse.eating();
      System.out.println("Hiir tervitab: " + mouse.sound);
    }
  }
