package ArrayJavahw;

import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.*/
public class ColoursArrayslist {
    public static void main(String[] args) {
        ArrayList<String>colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Purple");

        for(String c :colours){
            System.out.println(c);
        }
    }
}
