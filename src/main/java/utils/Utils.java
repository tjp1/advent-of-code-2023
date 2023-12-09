package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<String> readLines(String filePath) {
        List<String> lines = new ArrayList<>();

        // Using try-with-resources to automatically close the file
        try (InputStream inputStream = Utils.class.getResourceAsStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {

            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            // Handle exceptions such as file not found or unable to read
            e.printStackTrace();
        }

        return lines;
    }
}
