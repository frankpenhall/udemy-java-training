package labs;

import java.io.*;

public class PhoneNumberApp {

    public static void main(String[] args) throws FileNotFoundException {
        // Read a text tile file and will retrieve phone number

        String filename = "C:\\Users\\Frank\\IdeaProjects\\JavaTraining\\PhoneNumber.txt";
        File file = new File(filename);
        String[] phoneNums = new String[5];
        String phoneNum = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; phoneNums.length > i; i++) {
                phoneNums[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
                System.out.println("Error: File not found");
        } catch (IOException e) {
                System.out.println("Error: Could not read file");
        }

        // Valid phone number: 10 digits long
        // Area code cannot start in 0 or 9
        // There can be no 911 in the phone
        for (int i = 0; phoneNums.length > i; i++) {
            phoneNum = phoneNums[i];
            try {
                if (phoneNum.length() != 10) {
                    throw new TenDigitsException(phoneNum);
                }
                if (phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9")) {
                    throw new AreaCodeException(phoneNum);
                }
                System.out.println(phoneNum);
                for (int n = 0; (phoneNum.length() - 2) > n; n++) {
                    if (phoneNum.substring(n, n + 1).equals("9")) {
                        if (phoneNum.substring(n, n + 2).equals("11")) {
                            throw new EmergencyException(phoneNum);
                        }
                    }
                }
            } catch (TenDigitsException e) {
                System.out.println("Error: Phone number is not ten digits");
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println("Error: Phone number has invalid area code");
                System.out.println(e.toString());
            } catch (EmergencyException e) {
                System.out.println("Error: Invalid 911 sequence found");
                System.out.println(e.toString());
            }
        }
    }
}

class TenDigitsException extends Exception {
    String num;
    TenDigitsException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("TenDigitsException: " + num);
    }
}

class AreaCodeException extends Exception {
    String num;
    AreaCodeException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("AreaCodeException: " + num);
    }
}


class EmergencyException extends Exception {
    String num;
    EmergencyException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("EmergencyException: " + num);
    }
}

