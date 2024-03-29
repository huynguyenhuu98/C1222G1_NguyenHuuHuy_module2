package case_study_module2.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void writeFile (String path, List<String> strings){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            for (String line : strings) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
