package datastructures;

public class Arrays {

    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f"};

        for (int i=0; i < 6; i++) {
            System.out.print(alphabet[i] + " ");
        }

        System.out.println("\nUsing the length variable");
        // Using the length variable
        int size = alphabet.length;
        for (int n=0; n<size; n++) {
            System.out.print(alphabet[n] + " ");
        }

        System.out.println("\nUsing the For-Each method");
        for(String letter : alphabet) {
            System.out.print(letter + " ");
        }

        System.out.println("\n\nDouble Arrays");
        String[][] users = {{"John","Williams", "jw@testemail.com", "2918002781"},
                {"Sarah","Jackson", "sj@testemail.com", "2817290137"},
                {"Bob", "Green", "bg@testemail.com", "7361836219"}};

        // Get the size of array
        int numOfUsers = users.length;
        int numOfFields = users[0].length;

        System.out.println("Number of users " + numOfUsers);
        System.out.println("Number of fields " + numOfFields);

        //Old fashion Traverse the double array
        for (int i=0; i<numOfUsers; i++) {
            for (int j=0; j<numOfFields; j++) {
                System.out.println(users[i][j]);
            }
        }

        //Traverse the double array
        for (int i=0; i<numOfUsers; i++) {
            String firstName = users[i][0];
            String lastNane = users[i][1];
            String email = users[i][2];
            String phone = users[i][3];
            System.out.println(firstName + " " + lastNane + " " + email + " " + phone);
        }

        System.out.println("\n\nUsing For-Each");
        //For-Each method on double array
        for(String[] user:users) {
            System.out.print("[ ");
            for (String field: user) {
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }
}
