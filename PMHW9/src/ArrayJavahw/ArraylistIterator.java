package ArrayJavahw;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using
//Iterator.
public class ArraylistIterator {
    public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(55);
        num.add(65);
        num.add(87);
        System.out.println(num);
        System.out.println("-----------------");
        Iterator<Integer> iterator = num.iterator();

        while(iterator.hasNext()){
            Integer a= iterator.next();
            System.out.println(a);

        }
    }

}
