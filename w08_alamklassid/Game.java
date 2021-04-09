public class Game {
    public static void main(String[] args) {
        
    
    GameCharacter char1= new GameCharacter(4, 5, "Juku", 'C');
    GameCharacter char2= new GameCharacter(6, 5, "Mari", 'B');

    Obstacle obs = new Obstacle(10, 11, "rock" , 'r');

    World world = new World (15,10);

    world.worldObjects.add(char1);
    world.worldObjects.add(char2);
    world.worldObjects.add(obs);

    world.render();
    world.getDefinition();
    }
}
