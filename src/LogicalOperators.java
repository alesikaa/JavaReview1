

public class LogicalOperators {

    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=false; // will get failed because true && false= false

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed ");
        }else {
            System.out.println(" Test case failed");
        }

        System.out.println("   ----------Logical or--------   ");

          boolean dashboard=true;
          String  message="Welcome admin";

          if ( dashboard || message.equals("Welcome admin")){ //true || true= true ELSE  false || true=TRUE
              System.out.println("User is successfully logged in");
          } else {
              System.out.println("User is not logged in ");
          }
        System.out.println(" -------Logical Not-------");

          boolean b=true;
        System.out.println(!true);// output will get false


        boolean agreeCheckboxSelected=true;


        if (!agreeCheckboxSelected){ // true false
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");


    }
}
