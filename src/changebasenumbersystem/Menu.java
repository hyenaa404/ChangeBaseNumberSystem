
package changebasenumbersystem;

/**
 *
 * @author huesuonggg
 */
public class Menu {
    public static int chooseInputBase(){
        System.out.println("\n\n   INPUT BASE OPTION");
        System.out.println("------------------------------");
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choose: ");
        int option = InputUtils.inputOption(1, 4);
        return option;
    }
    
    public static int chooseOutputBase(int inputBase){
        String case1, case2;
        switch (inputBase) {
            case 2 -> {
                case1 = "Decimal";
                case2 = "Hexa"; 
            }
            case 10 -> {
                case1 = "Binary";
                case2 = "Hexa"; 
            }
            case 16 -> {
                case1 = "Decimal";
                case2 = "Binary"; 
            }
            default -> {
                System.out.println("Error! Invalid base system.");
                return -1;
            }
        }
        System.out.println("\n\n   OUTPUT BASE OPTION");
        System.out.println("-------------------------------");
        System.out.println("1. Convert To " + case1);
        System.out.println("2. Convert To " + case2);
        System.out.println("3. Exit");
        System.out.print("Enter your choose: ");
        int option = InputUtils.inputOption(1, 3);
        return option;
    }
}
