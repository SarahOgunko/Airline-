import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> destinations = new ArrayList<>();
        destinations.add("Monaco");
        destinations.add("London");
        destinations.add("Berlin");
        destinations.add("Rome");
        destinations.add("Porto");
        destinations.add("Liverpool");

        System.out.println("Where would you like to go ?");
        for( String location : destinations){
            System.out.println(location);
        }

        String input = scanner.nextLine();
        System.out.println( "You would like to go to " + input + " ?  (true/false) " );
        Boolean input2 = scanner.nextBoolean();

        






    }




        //    Please input details -scanner

//    display flights available
//    please select a flight


//    add passenger onto flight(method)
//    "your now off to ... enjoy!



    }







