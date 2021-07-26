package datastructures;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        // LinkedHash - in order that they were entered
        // HashSet - random order
        // TreeSet - rearranges to natural order (alphabetical)

        // 1. Define the collection
        Set<String> animals = new TreeSet<String>();

        // 2. Adding Elements
        animals.add("dog");
        animals.add("pig");
        animals.add("cat");
        animals.add("snake");

        System.out.println(animals.size() + " " + animals);

        animals.add("goose");
        animals.add("cat");
        animals.add("snake");

        System.out.println(animals.size() + " " + animals);


        // Create a new set that we can use for comparison
        Set<String> farmAnimals = new HashSet<String>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("dog");
        farmAnimals.add("horse");

        System.out.println(farmAnimals.size() + " " + farmAnimals);

        // What is the INTERSECTION between animals and farm animals "AND"
        // 1. Copy existing set into a new set
        Set<String> intersectionSet = new HashSet<String>(animals);
        //System.out.println(intersectionSet);

        // 2. Retain only the elements that are also in the other set
        intersectionSet.retainAll(farmAnimals);
        System.out.println("The intersection is: " + intersectionSet);

        // What is the UNION "OR"
        Set<String> unionSet = new HashSet<String>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is: " + unionSet);

        // What is the DIFFERENCE (animals but NOT farm animals "in 1 and NOT other"
         Set<String> differenceSet = new HashSet<String>(animals);
         differenceSet.removeAll(farmAnimals);
        System.out.println("The difference is: " + differenceSet);

    }
}
