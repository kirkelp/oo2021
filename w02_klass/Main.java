public class Main {
    public static void main(String[] args) {
        GameCharacter character1= new GameCharacter("Li", GameCharacterType.RANGER);

        System.out.println(
            character1.name + " " +
            character1.getSecret());

        character1.setSecret("my new secret");

        System.out.println(character1.getSecret());

        GameCharacter character2 = new GameCharacter("Kati", GameCharacterType.WARRIOR);

        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character1.getXY()[1]);
        
    }

    public static void human(){
        Human human1 = new Human();
        System.out.println(human1.legs + " " + human1.name);

        
        human1.legs = 5;
        human1.name = "Juku";
        System.out.println(human1.legs + " " + human1.name);

        Human human2 = new Human("Kati");
        System.out.println(human2.name);
    }
    
}