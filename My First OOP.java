import java.util.Scanner;
public class Main{
    public static double CtoF(double t){
        return t * 9.0 / 5.0 + 32;
    }
    public static double FtoC(double t){
        return (t - 32.0) * 5.0 / 9.0;
    }
    public static double CtoK(double t){
        return t + 273.15;
    }
    public static double KtoC(double t){
        return t - 273.15;
    }
     public static double FtoK(double t){
        return (t - 32.0) / 1.8 + 273.15;
    }
     public static double KtoF(double t){
        return 1.8 * (t - 273.15) + 32.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.println("3: Celsius to Kelvin");
        System.out.println("4: Kelvin to Celsius");
          System.out.println("5: Fahrenheit to Kelvin");
            System.out.println("6: Kelvin to Fahrenheit");
             System.out.println("7.exit");
        System.out.print("Choose conversion (1-7): ");
        if(!sc.hasNextInt()){
            System.out.println("Error: Invalid choice input");
            sc.next();
            continue;
        }
                            int choice = sc.nextInt();
        if(choice < 1 || choice > 7){
            System.out.println("Error: Please select option between 1 and 7");
            continue;
        }
        if(choice == 7){
    System.out.println("The program exited successfully.");
    break;
}
         System.out.print("enter tempareture : ");
         if(!sc.hasNextDouble()){
             System.out.println("Error: Invalid temperature value");
             sc.next();
            continue;
         }
         double temp = sc.nextDouble();
         double ans;
             switch(choice){
                 case 1 : 
                     ans = CtoF(temp);
                     System.out.println("Result: " + ans + " °F");
                     break;
                case 2 : 
                     ans = FtoC(temp);
                     System.out.println("Result: " + ans + " °C");
                     break;
                case 3 : 
                     ans = CtoK(temp);
                     System.out.println("Result: " + ans + " °K");
                     break;
                case 4 : 
                     ans = KtoC(temp);
                     System.out.println("Result: " + ans + " °C");
                     break;
                case 5 : 
                     ans = FtoK(temp);
                     System.out.println("Result: " + ans + " °K");
                     break;
                case 6 : 
                     ans = KtoF(temp);
                     System.out.println("Result: " + ans + " °F");
                     break;
             default:
                 System.out.println("please enter invalid choice!!\n");
             }
        }
         sc.close();
}
}
