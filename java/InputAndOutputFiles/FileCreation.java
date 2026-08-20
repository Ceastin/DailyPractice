package InputAndOutputFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreation {
    public static void main(String[] args) {
        try{
            Path path=Paths.get("InputAndOutputFiles/example2.txt");
            if(Files.notExists(path))
            Files.createFile(path);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
