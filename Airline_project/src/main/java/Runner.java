import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {




        ArrayList<String> destinations = new ArrayList<>();
        destinations.add("Monaco");
        destinations.add("London");
        destinations.add("Berlin");
        destinations.add("Rome");
        destinations.add("Porto");
        destinations.add("Liverpool");

        System.out.println("Where would you like to go ?");
        for (String location : destinations) {
            System.out.println(location);
        }



        String input = scanner.nextLine();
        System.out.println("You would like to go to " + input + " ?  (true/false) ");
        boolean input2 = scanner.nextBoolean();

        if (input2 == true) {
            System.out.println("Great!");
        } else {
            System.out.println("Oh no! Please have a look at the other options...");
            destinations.remove(input);
            System.out.println(destinations);
        }

//        boolean input2 = scanner.nextBoolean();
//
//
//        switch (input2 == false) {
//
//            System.out.println("Oh no! Please have a look at the other options...");
//            destinations.remove(input);
//            System.out.println(destinations);
//            System.out.println("Where would you like to go?");
//            String input3 = scanner.nextLine();
//            options();
//            break;


//            if (input2 == true){
//                break;
//            }



//
//        System.out.println("Great!");


    }

//    public static void options(){
//        String input = scanner.nextLine();
//        System.out.println("You would like to go to " + input + " ?  (true/false) ");
//
//    }

}




        //    Please input details -scanner

//    display flights available
//    please select a flight


//    add passenger onto flight(method)
//    "your now off to ... enjoy!











