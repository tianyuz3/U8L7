import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava",3));
        System.out.println(isAnagram("anagram","margana"));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> list = new ArrayList<String>();
    for(int i = 0 ; i<s.length()-2 ; i++){
        list.add(s.substring(i,i+3));
    }
    smallest = list.get(0);
        for(int i = 1 ; i<list.size() ; i++){
            if(smallest.compareTo(list.get(i))>0){
                smallest = list.get(i);
            }
        }
        largest = list.get(0);
        for(int i = 1; i<list.size() ; i++){
            if(largest.compareTo(list.get(i))<0){
                largest = list.get(i);
            }
        }

        return smallest + "\n" + largest;
    }
    public static boolean isAnagram(String a, String b) {
        ArrayList<String> compare = new ArrayList<String>();
        for(int i = 0 ; i<a.length() ; i++){
            compare.add(a.substring(i,i+1).toUpperCase());
        }
        b = b.toUpperCase();
        for(int i = 0 ; i<b.length(); i++){
            for(int j = 0 ; j<compare.size() ; j++){
                if(compare.get(j).equals(b.substring(i,i+1))){
                    compare.remove(compare.get(j));
                    j = compare.size();
                }
            }
        }
        if(compare.size()==0) {
            return true;
        }

        return false;
    }
}
