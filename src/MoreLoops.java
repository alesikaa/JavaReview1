public class MoreLoops {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {// outer loop



            for (int j = 1; j <= 3; j++) {// inner loop
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------");
    }
}