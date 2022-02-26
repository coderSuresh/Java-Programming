import java.util.Scanner;

public class NumberConversion {
    boolean isBinary(long binary) {
        long temp = binary;
        while (temp > 0) {
            int digit = (int) temp % 10;
            if ((digit != 0) && (digit != 1)) {
                System.out.println("Invailed number: binary number should contain only 0 & 1");
                return false; 
            }
            temp /= 10;
        }
        return true; 
    }

    int binaryToDecimal(long binary) {
        int decimal = 0;
        int i = 0;
        while (binary > 0) {
            decimal += (binary % 10) * Math.pow(2, i);
            i++;
            binary /= 10;
        }
        return decimal;
    }

    int binaryToOctal(long binary) {
        int octal = 0;
        int decimal = binaryToDecimal(binary); 
        int i = 1;
        while (decimal > 0) {
            octal += (decimal % 8) * i;
            i *= 10;
            decimal /= 8;
        }
        return octal;
    }

    String binaryToHexa(long binary) {
        String hexa = "";
        int decimal = binaryToDecimal(binary); 
        while (decimal > 0) {
            int rem = decimal % 16;
            if (rem >= 10) {
                switch (rem) {
                    case 10:
                        hexa = "A" + hexa;
                        break;
                    case 11:
                    hexa = "B" + hexa;
                        break;
                    case 12:
                    hexa = "C" + hexa;
                        break;
                    case 13:
                    hexa = "D" + hexa;
                        break;
                    case 14:
                    hexa = "E" + hexa;
                        break;
                    case 15:
                    hexa = "F" + hexa;
                        break;
                }
            } else {
                hexa = Integer.toString(rem) + hexa;
            }
            decimal /= 16;
        }
        return hexa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binary;
        System.out.print("Enter binary input: ");
        binary = sc.nextLong();
        sc.close();

        NumberConversion m = new NumberConversion();

        if (m.isBinary(binary) == true) {
            System.out.println("The decimal: " + m.binaryToDecimal(binary));
            System.out.println("The octal: " + m.binaryToOctal(binary));
            m.binaryToHexa(binary);
            System.out.println("The hexaDecimal: " + m.binaryToHexa(binary));
        }
    }
}