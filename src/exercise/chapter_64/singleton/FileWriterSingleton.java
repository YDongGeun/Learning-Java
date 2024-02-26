package exercise.chapter_64.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSingleton {
    private static FileWriterSingleton instance;
    private FileWriter fileWriter;

    public FileWriterSingleton() {
        try {
            this.fileWriter = new FileWriter("Learning-Java/Learning-Java/src/exercise/chapter_64/singleton/text.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static FileWriterSingleton getInstance() {
        if (instance == null) {
            instance = new FileWriterSingleton();
        }
        return instance;
    }

    public synchronized void writeToFile(String message) {
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void closeFile() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
