package Util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonUtil {

    public static Iterator<Object []> readfromCSV(String filePath) throws InterruptedException {
        String[] data = null;
        List<Object []> testCases = new ArrayList<>();
        BufferedReader br = null;
        String line = "";
        final String DELIMITER = ";";
        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                data = line.split(DELIMITER);
                testCases.add(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return testCases.iterator();
    }
}
