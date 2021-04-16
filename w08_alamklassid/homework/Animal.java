package homework;

public class Animal {
    public String sound;
    public String name;
    public String eats;

    public Animal(String sound, String name, String eats){
        this.sound=sound;
        this.name = name;
        this.eats=eats;
      }

      public void favouriteToyIs(String toy){
        System.out.println(this.name + " Lemmikmänguasi on " + toy);
      }

      public void hungry() {
        System.out.println("Loom tahab süüa ");
      }
      public void eating() {
        System.out.println("Loom sööb ");
      }
}
