package com.example.t.assign2;

public class Validator {

    public int Password_Strength(String userPassword) {
        // Only pass rule 'not equal to password'"
        if (userPassword == null)
            return 1;

        int rulePassed = 0;

        if (userPassword.length() >= 8)
            rulePassed++;

        if (!userPassword.equals("password"))
            rulePassed++;

        // One special character
        for (int i = 0; i < userPassword.length(); i++) {
            boolean match = false;
            char[] specialChar = {',', '.', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '~'};

            for (int j = 0; j < specialChar.length; j++) {
                if (userPassword.charAt(i) == specialChar[j]) {
                    match = true;
                    break;
                }
            }

            if (match) {
                rulePassed++;
                break;
            }
        }

        // One digit
        for (int i = 0; i < userPassword.length(); i++) {
            boolean match = false;
            char[] specialChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

            for (int j = 0; j < specialChar.length; j++) {
                if (userPassword.charAt(i) == specialChar[j]) {
                    match = true;
                    break;
                }
            }

            if (match) {
                rulePassed++;
                break;
            }
        }

        // One upper letter, one lower letter

        boolean matchU = false;
        boolean matchL = false;
        for (int i = 0; i < userPassword.length(); i++) {

            char[] specialCharUpper = {'A', 'B', 'B', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L',
                    'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

            char[] specialCharLower = {'a', 'b', 'b', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l',
                    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


            for (int j = 0; j < specialCharUpper.length; j++) {
                if (userPassword.charAt(i) == specialCharUpper[j]) {
                    matchU = true;
                    break;
                }
            }

            for (int k = 0; k < specialCharLower.length; k++) {
                if (userPassword.charAt(i) == specialCharLower[k]) {
                    matchL = true;
                    break;
                }
            }

            if (matchU && matchL) {
                rulePassed++;
                break;
            }
        }

        return rulePassed;
    }
}
