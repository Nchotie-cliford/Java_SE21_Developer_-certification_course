package data_structures;

import java.util.*;

public class CellectionsDemo {

    public static void main(String[] args) {
       //setDemo();
       //listDemo() ;
       // queueDemo();
       mapDemo();


    }

    public static void  setDemo () {
            List<String> fruits = new ArrayList();
            fruits.add("apple");
            fruits.add("orange");
            fruits.add("banana");

            for (String fruit : fruits){
                System.out.println(fruit);
            }

//            var i = fruit.iterator();
//            while (i.hasNext()) {
//                System.out.println(i.next());
//            }

            //fruit.remove("apple");
            // fruit.add("apple"); set can't have duplicate
//        System.out.println("size: " + fruit.size());
//
//
//        System.out.println("contains lemon? " + fruit.contains("Lemon"));
//
//
//        System.out.println(fruit);
//
//
//        Set moreFruit = Set.of("Pear", "raisin", "cherry");
//        moreFruit.add("cranberry"); // cant do this because set of makes immutable collections
//        System.out.println(moreFruit);
    }


    public static void  listDemo () {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("pear");
//
//        fruits.set(2,"Banana");
//
//        fruits.add("Lemon");
//
//        fruits.remove( "apple");

//        fruits.forEach(f -> System.out.println(f));

        //multiple startment
        fruits.forEach(f-> {
            f = "fruit: " + f;
            System.out.println(f);
        });





//        System.out.println("indext 2 : " + fruit.get(2));
//        System.out.println("indext of arange : " + fruit.indexOf("cherry"));
//        System.out.println("last index of lemon: " + fruit.lastIndexOf("cherry"));
//
//        System.out.println(fruit);
//
//        List moreFruit = List.of("Pear", "raisin", "Plum");


    }
    public static void queueDemo() {
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("cherry");
        fruit.add("pear");

        var removed = fruit.remove();

        System.out.println("removed: " + removed);
        System.out.println("head of queue: " + fruit.peek());

        System.out.println(fruit);

    }

    public static void mapDemo () {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 1500);
        fruitCalories.put("orange", 2000);
        fruitCalories.put("banana", 3000);
        fruitCalories.put("cherry", 4000);
        fruitCalories.put("pear", 5000);
        fruitCalories.putIfAbsent("mango", 6000);
        fruitCalories.remove("apple");

//        for(Map.Entry caloriesInfo : fruitCalories.entrySet()) {
//            System.out.println(caloriesInfo.getKey() + " : " + caloriesInfo.getValue());
//        }

        fruitCalories.forEach((k, v) -> System.out.println(k + ": " + v));
//
//
//   // maps are unorded
//        System.out.println(fruitCalories);
//        System.out.println("banana: " + fruitCalories.get("banana"));
//        System.out.println("contains apple? " + fruitCalories.containsKey("apple"));
//
//
//        Map immutableCalories = Map.of("apple", 1500, "orange", 2000, "banana", 3000);
//        System.out.println(immutableCalories);

    }


}
