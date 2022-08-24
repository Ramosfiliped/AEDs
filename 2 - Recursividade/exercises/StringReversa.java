package exercises;
import java.lang.StringBuilder;

public class StringReversa{
    public void stringReverse(StringBuilder s){
        char c = s.charAt(0);
        StringBuilder subString = s.deleteCharAt(0);
        stringReverse(subString);
        System.out.println(c);
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("recursividade");
        stringReverse(s);
    }
}