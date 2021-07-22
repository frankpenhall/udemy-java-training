package basics;

public class Strings {

    public static void main(String[] args) {
        String bookTitle;
        String wordChoice = "Rings";
        bookTitle = "Lord of the Rings";

        if (bookTitle.contains(wordChoice)) {
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";
        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("The browser is Chrome");
        }

        String firstName = "Frank";
        String lastName = "Raymond";
        String cellNumber = "0123456789";

        System.out.println("There are " + cellNumber.length() + " digits in your number");

        System.out.print(firstName.substring(0, 1));
        System.out.print(lastName.substring(0, 5));
        System.out.print(cellNumber.substring(6));
    }
}
