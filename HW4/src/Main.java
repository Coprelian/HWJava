import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> listOfLines = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("./poem.txt"));
            String line = reader.readLine();
            listOfLines.add(line);
            int i = 1;
            while (line != null) {

                line = reader.readLine();
                listOfLines.add(line);

                if (Objects.equals(line, "")) {
                    BufferedWriter reader1 = new BufferedWriter(new FileWriter(String.format("./poem%s.txt", i++)));
                    for (String listOfLine : listOfLines) {
//                        System.out.println(listOfLine);
                        reader1.write(listOfLine);
                    }
                    reader1.close();
                    listOfLines.clear();
                    line = reader.readLine();
                }
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

//        for (int b = 0; b < listOfLines.size(); b++) {
//            System.out.println(listOfLines.get(b));
//        }
    }
}

