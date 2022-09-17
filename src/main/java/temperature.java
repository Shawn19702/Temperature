import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Do you think the temperature is high, humid, or low?");


        String temperature = (scan.nextLine());





        if (temperature.equalsIgnoreCase("High")) {
            System.out.println("sunblock may be needed");
        }
       else if (temperature.equalsIgnoreCase("Humid")) {
            System.out.println("Its muggy");

        } else if (temperature.equalsIgnoreCase("Low")) {
            System.out.println("A coat may be needed");

        }
    }
}



