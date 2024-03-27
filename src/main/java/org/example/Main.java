package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String []{"flower","flow","flight"}));

    }


public static int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        Integer result = 0;

        for (int i = 0; i < s.length() ; i++) {

          if(i<s.length()-1 &&roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){

              result-=roman.get(s.charAt(i));
          }else{
              result+=roman.get(s.charAt(i));
          }

        }

        return result;
    }

    //14. Longest Common Prefix
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for(int i=0;i< strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;


    }




}
