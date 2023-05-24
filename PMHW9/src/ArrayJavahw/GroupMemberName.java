package ArrayJavahw;

import java.util.ArrayList;

/*Write program and add all group members names in to array and iterates
through for each loop and print your name.*/
public class GroupMemberName {
    public static void main(String[] args) {
        ArrayList<String> MemberName = new ArrayList<String>();
        MemberName.add("Falguni");
        MemberName.add("Jignesh");
        MemberName.add("Hemi");
        MemberName.add("Mahesh");
        MemberName.add("Maulik");
        MemberName.add("Punam");
        System.out.println("All the group member name: " +MemberName);
        String m = MemberName.get(5);
        for(String name:MemberName){
            System.out.println("My name is "+m);
            break;
        }

    }
}
