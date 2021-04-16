package homework;

public class Cat extends Animal {

    public Cat(String sound, String name, String eats) {
        super(sound, name, eats);
        this.sound= "Mjäu";
    }
    
    @Override
    public void hungry() {
      super.hungry();
      System.out.println("Kass tahab " + eats);
    }
    @Override
    public void eating() {
      System.out.println("Kass sööb " + eats);
    }    

}
