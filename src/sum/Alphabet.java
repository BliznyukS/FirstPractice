package sum;

import sun.applet.Main;

import java.util.HashSet;
import java.util.Set;

public class Alphabet {
    public static void main(String[] args) {
        Alphabet main = new Alphabet();
        // System.out.println(main.check("abcdeFghijKlmnopqrstuvwxyz"));
        System.out.println('a' + 0);


    }

    public boolean check(String input) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }

        for (int i = 0; i < 26; i++) {
            if (!set.contains((char) ('a' + i)) && !set.contains((char) ('A' + i))) {
                return false;
            }
        }
        return true;
    }

}