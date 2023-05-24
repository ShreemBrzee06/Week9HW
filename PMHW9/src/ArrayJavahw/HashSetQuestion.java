package ArrayJavahw;

import java.util.HashSet;

//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else)
public class HashSetQuestion {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(4);
        num.add(7);
        num.add(8);
        for(int i =0 ; i<=10;i++){
            if(num.contains(i)){
                System.out.println(i + " "+"is available in the set of 1 to 10");
            }
            else{
                System.out.println(i+""+ "is not available in the set of 1 to 10");
            }
        }
    }

}
