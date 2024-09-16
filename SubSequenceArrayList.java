package Recursion;

import java.util.ArrayList;

public class SubSequenceArrayList {
    public static void main(String[] args) {
        System.out.println(subset("abc"));
    }

    static ArrayList<String> subset(String up){
        return subset("",up);
    }

    static ArrayList<String> subset(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> result=new ArrayList<>();
            result.add(p);
            return result;
        }

        char ch=up.charAt(0);

        ArrayList<String> first=subset(p+ch,up.substring(1));
        ArrayList<String> second=subset(p,up.substring(1));

        first.addAll(second);

        return first;
    }
}
