package asd.t3.t4;
import java.util.*;
public class stringex {
    public static void main(String[] args) {
        String s1="Market";
        char ch[]={'s','i','m','p','l','i','f','i','e','d'};
        String s2= new String(ch);//char array to string
        System.out.println(s1 + s2);
        String s3="\"Market Simplified\"";// \" for double quote"
        System.out.println(s3);
        int l= s1.length();// find length of string
        System.out.println("length of first string "+l);
        char c=s1.charAt(2);//character at 2nd position
        System.out.print("3rd character "+c);
        if(s1.endsWith("t")){//ends with perticular character
            System.out.println("\ns1 Ends with t");
        }
        if(s1.equals(s2)){//two strings equal
            System.out.println("string equal");
        }
        else{
            System.out.println("not equal");
        }
        char c1[]=s1.toCharArray();//string into character array
        System.out.println(c1); 
        System.out.println(s1.toUpperCase());//string to uppercase
        System.out.println(s1.toLowerCase());//string to lowercase
    }
    
}
