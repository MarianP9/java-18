package homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        /*
         * 1) Write 5 different instances of that object.
         *    Add the instances to a list.
         */
        List<Car> carList = new LinkedList<>();
        carList.add(new Car("Tesla", "Model S", 2019, 503, true));
        carList.add(new Car("Mazda", "CX-5", 2020, 187, false));
        carList.add(new Car("Audi", "E-Tron", 2019, 402, true));
        carList.add(new Car("Porche", "Taycan Turbo S", 2020, 751));
        carList.add(new Car("Maserati", "Levante", 2017, 345));



        /*
         * 2) Find the elements containing the letter "a" that start with "M" and print them out.
         *    Add the instances to a set.
         */
        Set<Car> filteredCarSet = carList.stream()
                .filter(car -> car.getManufacturer().startsWith("M"))
                .filter(car -> car.getManufacturer().contains("a"))
                .collect(Collectors.toSet());
        System.out.println("\n(2) Cars with manufacturer name starting with \"M\" and containing \"a\"");
        filteredCarSet.forEach(System.out::println);



        /*
         * 3) Find the "min" using a custom comparing criteria of choice
         */
        Optional<Car> minHorsepowerCar = carList.stream().min(Comparator.comparing(Car::getHorsePower));
        System.out.println("\n(3) The car with lowest horsepower");
        System.out.println(minHorsepowerCar.get());



        /*
         * 4) Generate 5 random Strings and add them to a Set.
         * Find the "max" (while explaining as Javadoc how comparing Strings works)
         */
        Set<String> randomStrings = new HashSet<>();
        IntStream.range(0, 5).forEach(index -> randomStrings.add(generateRandomString()));

        System.out.println("\n(4) Generated random strings:");
        randomStrings.forEach(System.out::println);

        /**
         * The default sorting method for Strings is by lexicographical ordering.
         * The comparison is based on the Unicode value of each character in the strings.
         */
        System.out.println("The maximum of the random strings: "
                + randomStrings.stream()
                .max(Comparator.comparing(String::toString))
                .get());



        /*
         * 5) Generate a random number of Integers and then count them.
         *    "Map" the exponential to the numbers and then print them out.
         */
        List<Integer> randomIntegers = new LinkedList<>();
        IntStream.range(0, (int) (Math.random() * 5))
                .forEach(index -> randomIntegers.add((int) (Math.random() * 100)));

        System.out.print("\n(5) The amount of random numbers: ");
        System.out.println(randomIntegers.size());

        System.out.println("The exponential of the random numbers: ");
        randomIntegers.stream()
                .map(Math::exp)
                .forEach(System.out::println);



        /*
         * 6) Create a map of "n" (K,V) elements
         * and print "how many" elements have value over 10 (the key is of your choice)
         */
        Map<Integer, Double> cubes = new LinkedHashMap<>();

        int n = 5;
        IntStream.range(0, n).forEach(index -> cubes.put(index, Math.pow(index, 3)));

        System.out.print("\n(6) The number of elements over 10 when n=5 is: "
                + cubes.values()
                .stream()
                .filter(value -> value > 10)
                .count());



        /*
         * 7) Sort the above Set<String> (used for max) in reverse order
         */
        System.out.println("\n\n(7) Random strings reverse ordered: ");
        randomStrings.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);



        /*
         * 8) Sort the above List of custom objects (used for filter) in an order you consider
         */
        System.out.println("\n(8) Car list sorted by horsepower: ");
        carList.stream()
                .sorted(Comparator.comparing(Car::getHorsePower))
                .forEach(System.out::println);



        /*
         * 9) Check if any of your instances "match" a condition based on an Integer field (of your choice).
         * What does it return ? Print it out.
         */
        System.out.print("\n\n(9) Are there any cars made in 2020? : ");
        System.out.print(carList.stream().anyMatch(car -> car.getYear() == 2020) ? "Yes" : "No");



        /*
         * 10) What does Optional represent ? Explain through an example on your custom object
         *  -> Wrap an existing instance
         *  -> Wrap a null
         *  -> Check value using ifPresent or isPresent
         */
        System.out.println("\n\n(10) Electric cars: ");
        carList.stream()
                .filter(car -> car.getIsElectric().equals(Optional.of(true)))
                .forEach(System.out::println);
        System.out.println("Cars with missing info: ");
        carList.stream()
                .filter(car -> !car.getIsElectric().isPresent())
                .forEach(System.out::println);



        /*
         * 11) Fastest way to find the shortest String in a List
         * (take the 5 random Strings generated above and find the shortest one).
         */
        System.out.println("\n\n(11) Shortest string in the list: "
                + randomStrings.stream()
                .min(Comparator.comparingInt(String::length))
                .get());
    }

    private static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = (int) Math.ceil(Math.random() * 7);
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
