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

        return rulePassed;
    }
}
