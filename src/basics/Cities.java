package basics;

public class Cities {

    public static void main(String[] args) {
        String[] cities = {"New York", "San Francisco", "Denver", "Austin"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        // Declare array
        String[] states = new String[5];
        states[0] = "California";
        states[1] = "Oregon";
        states[2] = "Texas";
        states[3] = "North Carolina";
        states[4] = "Maine";
        int i = 0;
        // do loop: enters loop then test condition
        do {
            System.out.println(states[i]);
            i = i + 1;
        } while (i < 5);

        // while loop: test condition and then loop
        i = 0;

        boolean stateFound = false;

        while (!stateFound ) {
            String state = states[i];
            if (state == "Texas") {
                System.out.println("State found!");
                stateFound = true;
            }
            i++;
        }

        // for loop: known amount of iterations
        for  (int x = 0; x < 5; x++) {
            System.out.println(states[x]);
        }
    }
}
