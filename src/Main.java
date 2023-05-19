
import java.util.regex.Pattern;

public class Main {
    
    /* 
    this function for an automaton -DFA- that accepts all strings over {0,1} and ends with 01
    */ 
    public static String automaton(String s){
        Pattern pattern = Pattern.compile("(0|1)*");
        if(s.endsWith("01") && pattern.matcher(s).matches())
            return "Accepted";
        else
            return "rejected";
}
    /* 
    this function for couting the number of  a target word in a sentence 
    */ 
    public static int countWord(String sentence,String target){
        int count = 0;
        String[] x = sentence.split(" ");
        for(String y : x){
        if(Pattern.compile(target).matcher(y).find())
            count++;
        }
        return count;
    }

    /* 
    this function for replacing band words with **** band words are {evil,bad,hate} from a letter 
    */ 
    public static String filString(String s){
        StringBuilder reString = new StringBuilder();
        String[] x = s.split(" ");
        for(String n : x){
            if(n.equals("evil")  ||n.equals("bad") || n.equals("hate")){
                n = "****";
            }
            reString.append(n).append(" ");
        }
        return reString.toString();
    }
    public static void main(String[] args) {
        System.out.println(filString("i hate you and you are evil"));
        System.out.println(automaton("01010001"));
        // System.out.println(filString("i hate you and you are evil"));
        System.out.println(countWord("i hate you and you are evil hghfghf evil ","evil"));
    }
}