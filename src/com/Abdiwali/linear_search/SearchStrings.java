package com.Abdiwali.linear_search;

public class SearchStrings {


    static  boolean search(String str, char target){
       if (str.length()==0){
           return false;
       }
        for (int i = 0; i <str.length() ; i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
