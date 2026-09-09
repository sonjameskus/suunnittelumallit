package assignments.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private FileWriter writer;

    private Logger() {
        setFileName("log.txt");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        try {
            if (writer != null) {
                writer.close();
            }

            writer = new FileWriter(fileName, true);
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }

    public void write(String message) {
        try {
            writer.write(message + "\n");
        }
        catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (
            IOException e) { System.out.println("Error closing file: " + e.getMessage()); }
    }

}
