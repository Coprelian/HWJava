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
            BufferedReader reader = new BufferedReader(new FileReader("HW4/poem.txt"));
            String line = reader.readLine();
            Queue<String> queue = new LinkedList<>();

            while (line != null)
            {
                queue.add(line);
                printLineOut(queue.poll());
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printLineOut(String line) throws InterruptedException {
        Random random = new Random();
        long delay = random.nextLong(1000L,3000L);
        System.out.println(line);
        Thread.sleep(delay);
    }
}