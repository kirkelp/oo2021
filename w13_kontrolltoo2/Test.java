import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
  public static void main(String[] args) throws IOException {




    public void name() {
        
    }
    Files.readAllLines(Paths.get("data.txt"))
      .stream()
      .map(e -> e.split(","))
      .filter(e -> Integer.parseInt(e[1]) >= 3)
      .map(e -> e[1] + " :: " + e[0])
      .forEach(pw::println);
    
    pw.close();
  }
}