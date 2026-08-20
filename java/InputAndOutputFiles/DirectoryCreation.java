package InputAndOutputFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCreation {
    public static void main(String[] args) {
        try{
            Files.list(Paths.get(".")).filter(file -> Files.isDirectory(file)).forEach(System.out::println);
            Path path=Paths.get("trial");
            if(Files.notExists(path))
            {
                Files.createDirectories(path);
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
