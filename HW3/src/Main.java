import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        String[] regionsMoscow = new String[]{"77", "97", "99", "177", "197", "199", "777", "799", "977"};
        System.out.print("Для выхода из программы команда - exit\n");

        boolean appExit = true;
        while (appExit) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер: ");
            String autoNumber = in.nextLine();
            if (Objects.equals(autoNumber, "exit")) break;
            autoNumber = autoNumber.replaceAll("\\s+", "").replaceAll("RUS", "");
            System.out.println(autoNumber);
            autoNumber.toUpperCase();

            Pattern pattern1 = Pattern.compile("(^[АВЕКМНОРСТУХ])[\\d]*([АВЕКМНОРСТУХ][АВЕКМНОРСТУХ])\\d*$");  // Неверные буквы в номере
            Pattern pattern2 = Pattern.compile("^[АВЕКМНОРСТУХ](\\d\\d\\d)[АВЕКМНОРСТУХ][АВЕКМНОРСТУХ]\\d*$"); // Неверный регистрационный номер
            Pattern pattern3 = Pattern.compile("^[АВЕКМНОРСТУХ][\\d]*[АВЕКМНОРСТУХ][АВЕКМНОРСТУХ](\\d{2,3})$"); // Неверный номер региона

            Matcher match;
            int i = 1;
            switch (i) {
                case 1:
                    match = pattern1.matcher(autoNumber);
                    if (!match.find()) {
                        System.out.println("В серии неверные буквы");
                        break;
                    }
                case 2:
                    match = pattern2.matcher(autoNumber);
                    if (!match.find()) {
                        System.out.println("Неверный регистрационный номер");
                        break;
                    }
                case 3:
                    match = pattern3.matcher(autoNumber);
                    if (match.find()) {
                        for (String region : regionsMoscow) {

                            if (Objects.equals(match.group(i), region))
                                System.out.println("Регион Москва");
                        }
                    } else {
                        System.out.println("Неверный номер региона");
                        break;
                    }
            }
        }
    }
}