import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.*;

public class InputPages {

    public String Page2Line(String filePath) {
        BufferedReader reader;
        String ReadLine = "";
        try {
            reader = new BufferedReader(new FileReader(
                    filePath));
            // read next line
            String line = reader.readLine();
            ReadLine = line;
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ReadLine;
    }

    public List<String> GetPath(String DirPath){
        File folder = new File(DirPath);
        File[] listOfFiles = folder.listFiles();
        List<String> PathFile = new ArrayList<String>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                PathFile.add(listOfFiles[i].getName());
            }
        }
        return PathFile;
    }
}