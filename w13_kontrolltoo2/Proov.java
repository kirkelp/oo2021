import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Proov {
    public static void main(String[] args) throws IOException{
        File file = new File ("tekst");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        
    
         String[] strings = line.split(" ");
         int[] counts = new int[4];
         for(String str : strings)
              if(str.length() < counts.length) counts[str.length()] += 1;
         for(int i = 1; i < counts.length; i++)
             System.out.println(i + " letter words: " + counts[i]); 
    
       
    
       }
    
    }
