public class NestedLoops {

    public static void main(String[] args) {

        // nested loop-loop inside another loop

        for( int i=0; i<=3;i++){// outer loop
            System.out.println(i);


            for( int j=1;j>=3;j++){// inner loop
                System.out.println(j);
            }
        }
    }
}
