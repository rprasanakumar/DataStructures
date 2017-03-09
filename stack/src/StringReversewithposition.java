import java.util.LinkedList;

/**
 * Created by prass on 3/7/2017.
 */
public class StringReversewithposition {


    static String strin = "This is the book reads";
    public static void main(String[] str){

        LinkedList<LinkedList<Character>> lstStr = new LinkedList<LinkedList<Character>>();
        LinkedList<Character> lstChr = new LinkedList<Character>();


      int lengthStr = strin.length()-1;
        while(lengthStr>=0){


            if(strin.charAt(lengthStr)==' '){
                lstChr.addFirst(' ');
                lstStr.addFirst(lstChr);
                lstChr = new LinkedList<Character>();
            }
            lstChr.addLast(strin.charAt(lengthStr));
            lengthStr--;
        }
        lstStr.addFirst(lstChr);
        System.out.print(lstStr.toString());
    }
}
