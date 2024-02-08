// Delta College - CST 283 - Homework 1
// Name: Aaron Pelto
// Winter 2024


// This program validates serials input by the user

// A serial is valid if
// 1. It is exactly 5 characters long
// 2. The first two characters must be capital letters and adjacent in the alphabet
// 3. Character 3-4-5 must be a digit. Their sum can not be divisible by 3
public class validSerial {
    public static void main(String[] args) {

        System.out.println(isSerialValid("AB127"));
        System.out.println(isSerialValid("Ax125"));
        System.out.println(isSerialValid("$X724"));
        System.out.println(isSerialValid("AB12"));
        System.out.println(isSerialValid("ABC1234"));
        System.out.println(isSerialValid("BA123"));
        System.out.println(isSerialValid("BA12X"));
        System.out.println(isSerialValid("BA124"));

    }

    // Method isSerialValid

    public static boolean isSerialValid(String serialNum) {
        int sum = 0;

        if (serialNum.length() != 5) {
            return false;
        }

        if (serialNum.charAt(0) + 1 != serialNum.charAt(1) || !Character.isUpperCase(serialNum.charAt(0)) || !Character.isUpperCase(serialNum.charAt(1))) {
            return false;
        }

        for (int i = 2; i < 5; i++) {
            if (!Character.isDigit(serialNum.charAt(i))) {
                return false;
            }
            sum += Character.getNumericValue(serialNum.charAt(i));
        }

        if (sum % 3 == 0) {
            return false;
        }

        return true;


    }
}

