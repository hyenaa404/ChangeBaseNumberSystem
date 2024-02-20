
package changebasenumbersystem;

import java.util.Scanner;

/**
 *
 * @author huesuong
 */
public class InputUtils {
    
    
    
    public static int inputOption(int min, int max) {
        Scanner sc = new Scanner (System.in);
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs < min || rs > max) {
                    throw new ArithmeticException("Not valid. Enter a valid number from "+ min + " to " + max + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }
    
    public static String inputValue(int base) {
        Scanner sc = new Scanner (System.in);
        
        String rs, validation;
        
        switch (base) {
            case 2 -> {
                validation = "[0-1]+";
            }
            case 10 -> {
                validation = "[0-9]+";
            }
            case 16 -> {
                validation = "[0-9A-F]+";
            }
            default -> {
//                validation = null;
                System.out.println("Error! Invalid base system.");
                return null;
            }
                
        }
        
        while (true) {
            try {
                rs = sc.nextLine();
                if (!rs.matches(validation)) {
                    throw new ArithmeticException("Not valid. Enter a valid number of base " + base + " system.");
                }
                break;
            
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }
    
}
