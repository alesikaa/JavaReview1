public class ForLoop1 {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);

        }
        // break and continue
        System.out.println("-----------------");


        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);
            if (i == 12) {
                System.out.println("i is equal to 12 - I am breaking my loop");
                break;// stops / break the loop
            }
        }
        //continue - skips current iteration
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                continue;// java goes back to the beginning of the loop
                //and skips the rest of the code that is inside loop body
            }
            System.out.println("Hello");
            System.out.println("How are you");
            System.out.println("Hope you well");
            break;
        }
    }
}
