import java.util.Stack;

/**
 * Created by prass on 3/7/2017.
 */
public class StackExamples {

   static String strin = "This is the book reads";
    public static void main(String[] args){

        Stack<Character> str = new Stack<Character>();

        for (int i=0; i<strin.length();i++){

            str.push(strin.charAt(i));

        }

        while(!str.isEmpty()){

            System.out.print(str.pop());
        }


    }
}
