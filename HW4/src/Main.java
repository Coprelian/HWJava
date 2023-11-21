import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("HW4/poem.txt"));
            Queue<String> queue = new LinkedList<>();
            String line = reader.readLine();
            for (int i = 1; true;) {

                if (Objects.equals(line, "") | Objects.equals(line, null)) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(String.format("./poem%s.txt", i++)));

                    String queueLine;
                    while ((queueLine = queue.poll()) != null) {
                        writer.write(queueLine);
                        writer.newLine();
                    }
                    writer.close();
                    if (line == null) break;
                    line = reader.readLine();
                    if (Objects.equals(line, "")) {
                        line = reader.readLine();
                    }
                } else {
                    queue.add(line);
                    line = reader.readLine();
                }
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Random random = new Random();
            BufferedReader reader = new BufferedReader(new FileReader("HW4/poem.txt"));
            String line = reader.readLine();
            Queue<String> queue = new LinkedList<>();
            long delay = random.nextLong(1000L,3000L);

            while (line != null)
            {
                queue.add(line);
                Thread.sleep(delay);
                System.out.println(queue.poll());
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}