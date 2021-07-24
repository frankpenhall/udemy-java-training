package labs;

import java.io.*;
import java.util.Locale;

public class ReadPasswords {

    public static void main(String[] args) {
        String filename = "C:\\Users\\Frank\\IdeaProjects\\JavaTraining\\Passwords.txt";
        String[] passwords = new String[10];
        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0;i< passwords.length; i++) {
                passwords[i] = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error: Cannot open file");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: Cannot read file");
        }
        for (String password:passwords) {
            System.out.println(password);
            boolean hasNumber = false;
            boolean hasLetter = false;
            boolean hasSpecialChar = false;
            boolean hasInvalidChar = false;

            for (int n = 0; n < password.length(); n++) {
                // Condition 1: contains number
                if ("0123456789".contains(password.substring(n, n + 1))) {
                    //System.out.println("Position " + n + " contains a number");
                    hasNumber = true;
                }
                // Condition 2: contains letter
                else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n, n + 1).toLowerCase(Locale.ROOT))) {
                    //System.out.println("Position " + n + " contains a letter");
                    hasLetter = true;
                }
                // Condition 3: contains special character
                else if ("!@#$%^&*?".contains(password.substring(n, n + 1))) {
                    //System.out.println("Position " + n + " contains a special character");
                    hasSpecialChar = true;
                }
                else {
                    try {
                        throw new InvalidCharacterException(password.substring(n, n + 1));
                    } catch (InvalidCharacterException e) {
                        e.toString();
                    }
                }
            }
            try {
                if (!hasNumber) {
                    throw new NumberCriteriaException(password);
                } else if (!hasLetter) {
                    throw new LetterCriteriaException(password);
                } else if (!hasSpecialChar) {
                    throw new SpecialLetterCriteriaException(password);
                }
                else { System.out.println("Valid Password"); }
            } catch (NumberCriteriaException | LetterCriteriaException | SpecialLetterCriteriaException e) {
                e.toString();
                System.out.println("Invalid Password");
            }
        }
    }
}

class InvalidCharacterException extends Exception {
    String ch;
    public InvalidCharacterException(String ch) {
        this.ch = ch;
    }
    public String toString() {
        return "InvalidCharacterException: " + ch;
    }
}

class NumberCriteriaException extends Exception {
    String password;
    public NumberCriteriaException(String password) {
        this.password = password;
    }
    public String toString() {
        return "NumberCriteriaException: " + password;
    }
}

class LetterCriteriaException extends Exception {
    String password;
    public LetterCriteriaException(String password) {
        this.password = password;
    }
    public String toString() {
        return "LetterCriteriaException: " + password;
    }
}

class SpecialLetterCriteriaException extends Exception {
    String password;
    public SpecialLetterCriteriaException(String password) {
        this.password = password;
    }
    public String toString() {
        return "SpecialLetterCriteriaException: " + password;
    }
}