public class Cat implements Animal {
    private String name;
  
    public Cat(String name){
      this.name = name;
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public String eat() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String sleep() {
        return ("Zzz");
    }

    @Override
    public String beSneaky() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String lookAround() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String attack() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String defend() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
