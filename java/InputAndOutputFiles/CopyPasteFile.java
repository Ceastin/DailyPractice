package InputAndOutputFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyPasteFile {
    public static void main(String[] args) {
        Path path=Paths.get("InputAndOutputFiles/example.txt");
        Path path2=Paths.get("InputAndOutputFiles/example3.txt");
        try{
            if(Files.notExists(path2))
            Files.copy(path, path2);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
