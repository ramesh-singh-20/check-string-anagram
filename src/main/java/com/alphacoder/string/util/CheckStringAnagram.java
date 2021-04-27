package com.alphacoder.string.util;

import java.util.Arrays;

public class CheckStringAnagram {

    public static boolean checkStringAnagrams(String s1, String s2){
        if(s1== null || s2== null){
            return false;
        }

        if(s1.length()!= s2.length()){
            return false;
        }

        if(s1.length()== s2.length()){
            s1= s1.toLowerCase();
            s2= s2.toLowerCase();
            char[] arr1= s1.toCharArray();
            char[] arr2= s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }
        return false;
    }

    public static boolean isAnagramCounting(String string1, String string2) {
        if(string1== null || string2== null){
            return false;
        }

        if (string1.length() != string2.length()) {
            return false;
        }

        int CHARACTER_RANGE= 256;

        int count[] = new int[CHARACTER_RANGE];
        string1= string1.toLowerCase();
        string2= string2.toLowerCase();

        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
