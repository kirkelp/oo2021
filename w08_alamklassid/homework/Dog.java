package homework;

public class Dog extends Animal{
    
        public Dog(String sound, String name, String eats) {
            super(sound, name, eats);
            this.sound= "Auh";
        }
        
        @Override
        public void hungry() {
          super.hungry();
          System.out.println("Koer tahab " + eats);
        }
        @Override
        public void eating() {
          System.out.println("Koer sööb " + eats);
        }    
    
}