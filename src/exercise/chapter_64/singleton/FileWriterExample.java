package exercise.chapter_64.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.util.SimpleTimeZone;

public class FileWriterExample {
    private String filename;

    public FileWriterExample(String filename) {
        this.filename = filename;
    }

    public void writeToFile(String message) {
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            fileWriter.write(message + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
