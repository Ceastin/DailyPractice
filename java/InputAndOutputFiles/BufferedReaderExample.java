package InputAndOutputFiles;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderExample {
    public static void main(String[] args) 
    {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("InputAndOutputFiles/example.txt"));
            // String firstLine=reader.readLine();
            // System.out.println(firstLine);
            StringBuilder sm=new StringBuilder();
            reader.lines().forEach(line -> sm.append(line+" "));
            System.out.println(sm);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
