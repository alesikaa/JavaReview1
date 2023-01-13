public class ForLoop {
    public static void main(String[] args) {

        // 1. initialization
        //2. condition
        // 3. if true -> code goes inside the loop body
        // 4. goes back, increment
        // repeat
        for ( int i=1; i<=5; i++){
            System.out.println("Hello "+i);
        }
        System.out.println(" --------------------");

        for ( int a=0; a<8; a+=4){
            System.out.println("Bye");
        }
        System.out.println("-------------");

        for (int i=2; i>10; i++){
            System.out.println(i); // no run because condition is false
        }

        for(int i=1;i<=6; i++){
            if (i%2==0){
                System.out.println("even number "+i);
            }
        }
    }
}
