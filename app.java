import java.util.Scanner;
public class app{
    public app() {
    }
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("How has your day been?\nNow please tell me how hot it is.");
        double temperature = scan.nextDouble();
        System.out.print("Wow that really sucks. Now was that in Fahrenheit or Celsius? (Please type out F or C)");
        String tempUnit = "";
        while (true){
            tempUnit = scan.next();
            if (tempUnit.equalsIgnoreCase("f")){
                tempUnit = "F";
                break;
            }else if (tempUnit.equalsIgnoreCase("c")){
                tempUnit = "C";
                break;
            } else {
                System.out.println("Please try again.");
            }
        }
        switch (tempUnit){
            case "C":
                System.out.println("so awesome, it is" + temperature + " C.");
                break;
            case "F":
                System.out.println("so awesome, it is " + temperature + " F.");
                break;
        }
        scan.close();
    }
}