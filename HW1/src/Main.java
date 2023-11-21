import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int getRandom(int length) {
        Random random = new Random();
        return random.nextInt(length);
    }

    public static void main(String[] args) {
        
        String[] randomName = new String[] {"Сема", "Пушок", "Гром", "Крэш", "Сиф", "Симба"};
        Animal[] randomAnimal = new Animal[] {new Dog(randomName[getRandom(randomName.length)], getRandom(1000)),
                                              new Cat(randomName[getRandom(randomName.length)], getRandom(1000)),
                                              new Tiger(randomName[getRandom(randomName.length)], getRandom(1000))};

        Animal[] animals = new Animal[] {new Dog("Бобик", getRandom(1000)),
                                         new Dog("Шарик", getRandom(1000)),
                                         new Cat("Том", getRandom(1000)),
                                         new Tiger("Сэм", getRandom(1000)),
                                         randomAnimal[getRandom(randomAnimal.length)],
                                         randomAnimal[getRandom(randomAnimal.length)],
                                         randomAnimal[getRandom(randomAnimal.length)]};

        String[][] typeAnimals = new String[][] {{"Dog",""},
                                                 {"Cat", ""},
                                                 {"Tiger",""}};

        int dogsCount = 0, catsCount = 0, tigersCount = 0;

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getName());
            switch (animal.getClass().getName()) {
                case "Dog":
                    dogsCount += 1;
                    break;
                case "Cat":
                    catsCount += 1;
                    break;
                case "Tiger":
                    tigersCount += 1;
                    break;
            }
            animal.run();
            animal.swim();
            System.out.println();
        }

        typeAnimals[0][1] = Integer.toString(dogsCount);
        typeAnimals[1][1] = Integer.toString(catsCount);
        typeAnimals[2][1] = Integer.toString(tigersCount);

        for (String[] typeAnimal : typeAnimals) {
            System.out.println(typeAnimal[0] + " " + typeAnimal[1]);
        }
    }
}