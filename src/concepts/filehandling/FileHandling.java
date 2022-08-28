package concepts.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class FileHandling {

    public static void main(String[] args) {
        try {
            String fileName = "aritra-local.test";
            byte[] randomBytes = new byte[10];

            /*Files.write(Path.of(fileName), randomBytes, StandardOpenOption.APPEND);
            Files.write(Path.of(fileName), randomBytes, StandardOpenOption.APPEND);*/

            try(FileOutputStream outputStream = new FileOutputStream(fileName, true)) {
                outputStream.write(randomBytes);
                outputStream.write(randomBytes);
            }

            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            String[] strAr1=new String[] {"SUCCESS"};

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
