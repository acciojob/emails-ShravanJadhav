package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals(this.password)){
            if(newPassword.length()>=8 && isValid(newPassword)){
                this.password = newPassword;
            }
        }

    }

    private boolean isValid(String newPassword){
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialCharacter = false;

        for(int i=0; i<newPassword.length(); i++){
            char ch = newPassword.charAt(i);

            if(Character.isUpperCase(ch))
                upperCase = true;
            if(Character.isLowerCase(ch))
                lowerCase = true;
            if(Character.isDigit(ch))
                digit=true;
            if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch))
                specialCharacter = true;

        }
        if(upperCase==true && lowerCase==true && digit==true && specialCharacter==true)
            return true;
        return false;
    }
}
