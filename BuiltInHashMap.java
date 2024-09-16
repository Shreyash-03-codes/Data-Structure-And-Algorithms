package HashDataStructure;

import java.util.HashMap;

public class BuiltInHashMap {
    public static void main(String[] args){

        HashMap<Integer,String> map=new HashMap<>();

        //inserting in hashmap
        map.put(39,"Shreyash");
        map.put(61,"Pratik");
        map.put(42,"Rohan");
        map.put(53,"Altaf");
        map.put(55,"Aditya");

        //accessing in hashmap
        System.out.println(map.get(39));
        System.out.println(map.get(42));
        System.out.println(map.get(53));
        System.out.println(map.get(55));

        //checking the key is present or not
        if(map.containsKey(39)) {
            System.out.println("39 is Present");
        }
        else{
            System.out.println("The 39 is not present");
        }

        if(map.containsKey(61)) {
            System.out.println("61 is Present");
        }
        else{
            System.out.println("The 61 is not present");
        }

        if(map.containsKey(41)) {
            System.out.println("41 is Present");
        }
        else{
            System.out.println("The 41 is not present");
        }

        //checking the value is present or not
        if(map.containsValue("Shreyash")){
            System.out.println("The Shreyash is present");
        }
        else{
            System.out.println("The Shreyash is Not present");
        }
        if(map.containsValue("Pratik")){
            System.out.println("The Pratik is present");
        }
        else{
            System.out.println("The Pratik is Not present");
        }
        if(map.containsValue("Name")){
            System.out.println("The Name is present");
        }
        else{
            System.out.println("The Name is Not present");
        }

        //printing all hashmap elements
        System.out.println("The HashMap Elements Before the Removing Pair");
        for(Integer key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }

        //removing key-value from hashmap
        map.remove(42);

        System.out.println("The HashMap Elements After the Removing Pair");
        for(Integer key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }

        
    }
}
