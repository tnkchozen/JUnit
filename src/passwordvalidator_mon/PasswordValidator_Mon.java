package passwordvalidator_mon;

import java.util.*;

public class PasswordValidator_Mon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter password \n length should be 8 characters " +
                "\n one upper case and one special character.");

        String password = input.nextLine();

        if(checkLength(password)) {
            System.out.println("Length is okay");
        }

    }

    public static boolean checkLength(String password) {
        if(password.length() >= 8) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkUpperCase(String password) {
        boolean pass2 = false;
        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c)) {
                pass2 = true;
            }
        }
        return pass2;
    }

    public static boolean checkSpecial(String password) {
        boolean pass3 = false;
        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(!Character.isLetterOrDigit(c)) {
                pass3 = true;
            }
        }
        return pass3;
    }

//    public static boolean checkPassword(String password) {
//        boolean pass1 = false;
//        boolean pass2 = false;
//        boolean pass3 = false;
//
//        if(password.length() >= 8){
//            pass1 = true;
//        }
//        for(int i = 0; i < password.length(); i++) {
//            char c = password.charAt(i);
//            if(Character.isUpperCase(c)) {
//                pass2 = true;
//            }
//        }
//        for(int i = 0; i < password.length(); i++) {
//            char c = password.charAt(i);
//            if(!Character.isLetterOrDigit(c)) {
//                pass3 = true;
//            }
//        }
//        if(pass1 && pass2 && pass3){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }

}