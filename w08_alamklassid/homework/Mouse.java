package homework;

public class Mouse extends Animal {

    public Mouse(String sound, String name, String eats) {
        super(sound, name, eats);
        this.sound= "Piiks";
    }
    
    @Override
    public void hungry() {
      super.hungry();
      System.out.println("Hiir tahab " + eats);
    }
    @Override
    public void eating() {
      System.out.println("Hiir sööb " + eats);
    }    
}
