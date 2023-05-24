package ArrayJavahw;
/* 11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.*/
import java.util.ArrayList;

public class PrintYourName {
    static String P = "Punam";
    public static void main(String[] args) {
        ArrayList<String> PostMan = new ArrayList<String>();
        PostMan.add("Falguni");
        PostMan.add("Jignesh");
        PostMan.add("Hemi");
        PostMan.add("Mahesh");
        PostMan.add("Maulik");
        PostMan.add("Punam");
        System.out.println("All the Postman Group Member Name: " + PostMan);

        for(String k:PostMan){
            if (PostMan.contains(P)){
            System.out.println("My name is " + P);}
            break;
        }
    }
}
