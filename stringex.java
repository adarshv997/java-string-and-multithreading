package asd.t3.t4;
import java.util.*;
public class stringex {
    public static void main(String[] args) {
        String s1="Market";
        char ch[]={'s','i','m','p','l','i','f','i','e','d'};
        String s2= new String(ch);
        System.out.println(s1 + s2);
        String s3="\"Market Simplified\"";
        System.out.println(s3);
        int l= s1.length();
        System.out.println("length of first string "+l);
        char c=s1.charAt(2);
        System.out.print("3rd character "+c);
        if(s1.endsWith("t")){
            System.out.println("\ns1 Ends with t");
        }
        if(s1.equals(s2)){
            System.out.println("string equal");
        }
        else{
            System.out.println("not equal");
        }
        char c1[]=s1.toCharArray();
        System.out.println(c1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.split("mar"));
    }
    
}
