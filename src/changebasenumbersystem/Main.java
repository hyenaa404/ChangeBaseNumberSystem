package changebasenumbersystem;

/**
 *
 * @author huesuonggg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        while (true) {
            choice = Menu.chooseInputBase();
            switch (choice) {
                case 1 -> {
                    int outputBase = Menu.chooseOutputBase(2);
                    if (outputBase != -1 && outputBase != 3) {
                        System.out.print("Enter input value: ");
                        String binary = InputUtils.inputValue(2);
                        if (binary != null) {
                            if (outputBase == 1) {
                                System.out.println("Ouput value: " + BaseConversion.convertBinaryToDecimal(binary));
                            } else if (outputBase == 2) {
                                System.out.println("Ouput value: " + BaseConversion.convertBinaryToHexa(binary));
                            }
                        }
                    }
                }
                case 2 -> {
                    int outputBase = Menu.chooseOutputBase(10);
                    if (outputBase != -1 && outputBase != 3) {
                        System.out.print("Enter input value: ");
                        String decimal = InputUtils.inputValue(10);
                        if (decimal != null) {
                            if (outputBase == 1) {
                                System.out.println("Ouput value: " + BaseConversion.convertDecimalToBinary(decimal));
                            } else if (outputBase == 2) {
                                System.out.println("Ouput value: " + BaseConversion.convertDecimalToHexa(decimal));
                            }
                        }
                    }
                }
                case 3 -> {
                    int outputBase = Menu.chooseOutputBase(16);
                    if (outputBase != -1 && outputBase != 3) {
                        System.out.print("Enter input value: ");
                        String hexa = InputUtils.inputValue(16);
                        if (hexa != null) {
                            if (outputBase == 1) {
                                System.out.println("Ouput value: " + BaseConversion.convertHexaToDecimal(hexa));
                            } else if (outputBase == 2) {
                                System.out.println("Ouput value: " + BaseConversion.convertHexaToBinary(hexa));
                            }
                        }
                    }
                }
                case 4 ->
                    System.exit(0);
            }
        }
    }

}
