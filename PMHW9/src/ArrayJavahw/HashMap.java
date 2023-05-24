package ArrayJavahw;

/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/
public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> person = new java.util.HashMap<>();
        // add keys and values: name and age
        person.put("Tom", 33);
        person.put("Tina",15);
        person.put("Jessica",35);
        person.put("Angel",11);

        for(String name :person.keySet()){
            System.out.println("The Key : " + name+ " "+"& "+ " "+"The value: " + person.get(name));

        }
    }
}
