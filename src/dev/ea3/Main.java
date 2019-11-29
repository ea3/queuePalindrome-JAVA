package dev.ea3;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
//        StringBuilder noSpaceNoPunctuation = new StringBuilder(string.length());
        String toLowerCase = string.toLowerCase();

        for (int i = 0; i < string.length(); i++){
            char c = toLowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
//                noSpaceNoPunctuation.append(c);
                queue.add(c);
                stack.push(c);
            }
        }

        return stack.toString().equals(queue.toString());
    }
}


//queue  -> adds and removes. peeks.
//stack ->  push and pops. also peeks.