package kodunetoo2;

public class Animal {
    public int head = 1;
    public int eyes = 2;
    public int legs = 4;
    public int tail = 1;

    private int kg;

    public String name;
    private String size = "size";

    public AnimalType animalType;

    public Animal(String name, AnimalType animalType){
        this.name=name;
        this.animalType = animalType;

        this.kg=(int) (Math.random() * 20);
}
public String getSize(){
    return size;
}
public void setSize(String size){
    this.size = size;
}
public int[] getKG() {
    return new int[]{kg};
}
@Override
public String toString(){
    return "Animal name is " + name + " and size " + kg + " kg "+ " and legs number " + legs+ " and head " + head+ " and eyes " + eyes + " and tail " + tail; 
}
}