package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static List<String> read(String pathname) {
        List<String> data = new ArrayList<>();
        try {
            File file = new File(pathname);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                data.add(row);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
