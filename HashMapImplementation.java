package HashDataStructure;

import java.util.Arrays;

public class HashMapImplementation {
    private static class HashMap {

        private final int N = 41;

        private final String[] hash = new String[N];

         HashMap() {
            Arrays.fill(hash, "null");
        }

        private int hashCode(int key) {
            return key % N;
        }

        void put(int key, String value) {
            int code = hashCode(key);
            if (hash[code] == "null") {
                hash[code] = value;
            } else {
                System.out.println("Collision Occurs:");
            }
        }

        String get(int key) {
            int code = hashCode(key);

            return hash[code];
        }

        void remove(int key) {
            int code = hashCode(key);

            hash[code] = "null";
        }

        boolean containsKey(int key) {
            int code = hashCode(key);
            if (hash[code]!= "null") {
                return true;
            }
            return false;
        }


        public void display() {
            for (int i = 0; i < N; i++) {
                if(hash[i]!="null"){
                    System.out.println(hash[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        HashMap map=new HashMap();

        map.put(39,"Shreyash");
        map.put(45,"Yash");
        map.put(90,"Abhijeet");
        map.put(11,"Vishnu");
        map.put(33,"Avishkar");

        System.out.println("Accessing The HashMap Elements:");
        System.out.println(map.get(39));
        System.out.println(map.get(45));
        System.out.println(map.get(33));

        System.out.println("Checking The Keys Are Present are or not");
        if(map.containsKey(39)){
            System.out.println("Key is Present");
        }
        else{
            System.out.println("Key is Not Present");
        }
        if(map.containsKey(100)){
            System.out.println("Key is Present");
        }
        else{
            System.out.println("Key is Not Present");
        }

        System.out.println("The HashMap Elements Before The Removing:");
        map.display();

        map.remove(45);

        System.out.println("The HashMap Elements After The Removing:");
        map.display();

    }
}
