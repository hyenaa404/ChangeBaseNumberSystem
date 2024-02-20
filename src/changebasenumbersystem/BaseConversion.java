
package changebasenumbersystem;

/**
 *
 * @author nhs
 */
public class BaseConversion {
    
    public static String convertBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }
    
    public static String convertBinaryToHexa(String binary) {
        int decimal = Integer.parseInt(binary);
        String hexa = Integer.toHexString(decimal);
        return hexa.toUpperCase();
    }
    
    public static String convertDecimalToBinary(String decimal) {
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }
    
    public static String convertDecimalToHexa(String decimal){
        String hexa = Integer.toHexString(Integer.parseInt(decimal));
        return hexa.toUpperCase();
    }
    
    public static String convertHexaToDecimal(String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal, 16);
        return Integer.toString(decimal);
    }
    
    public static String convertHexaToBinary(String hexadecimal) {
        String binary = Integer.toBinaryString(Integer.parseInt(hexadecimal, 16));
        return binary;
    }
    
}
