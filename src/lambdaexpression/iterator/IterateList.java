package lambdaexpression.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateList {
    public static void main(String[] args) {
        List<String> electronicsList = Arrays.asList("Laptop", "Tablet", "Television", "Monitor");
        System.out.println("Classic enhanced for loop");
        for (String items : electronicsList) {
            System.out.println(items);
        }

        //Please implement Anonymous class to iterate through
        System.out.println("Using Anonymous class");
Technology technology = new Technology(){
    public void technologyList(String list){
        System.out.println("The electronic device is a " + electronicsList);
    }
    public void technologyPrice(int price){
        System.out.println("The price of all the devices added up is " + price);
    }
};
technology.technologyList("");
technology.technologyPrice(1000);


        //Please implement lambda expression to iterate through electronicsList
        System.out.println("Iterate Using Lambda Expression");
electronicsList.forEach((value) -> System.out.println(value));

        //Please implement lambda Method Reference to iterate through electronicsList
        System.out.println("Iterare Using Lambda Method Reference-1");
        electronicsList.forEach(System.out::println);

        //Please implement lambda Method Reference from Electronics class to iterate through electronicsList
        System.out.println("Iterate Using Lambda Method Reference-2 using Electronics class");
        electronicsList.forEach(Electronics::countWordLength);

        //Please implement stream iteration through electronicsList
        System.out.println("Iterate using Stream for each loop");
        for(String electronicList : electronicsList){
            System.out.println(electronicList);
        }

    }

}
