package ArrayJavahw;
//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
import java.util.ArrayList;

public class EmptyandUndergroundtubenames {
    public static void main(String[] args) {
        ArrayList<String>tubeNamesList = new ArrayList<>();
       tubeNamesList.add("Jubilee Line");
       tubeNamesList.add("Metropolitan Line");
       tubeNamesList.add("Yellow Line");
       tubeNamesList.add("Northern Line");
       if(tubeNamesList.isEmpty()){
           System.out.println("The Array is empty");
       }else{
           System.out.println("The Array list is not empty");
           System.out.println("The names of  are: " + tubeNamesList);
       }
    }

}
