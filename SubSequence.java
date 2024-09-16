package Recursion;

public class SubSequence {
    public static void main(String[] args) {
        subset("abc");
    }

    static void subset(String set){

        subset("",set);

    }

    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }
}
