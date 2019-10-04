package Arrays;

public class ClassDataApp {
    public static void main(String[] args) {
        ClassDataArray dataArray = new ClassDataArray(10);
        dataArray.insert("Raj", "Chahal", 34);
        dataArray.insert("Manish", "Kadia", 33);
        dataArray.display();
        Person found = dataArray.find("Kadia");
        if(found != null)
        {
            System.out.println("Found Person.");
            found.displayPerson();
        }
        else
        {
            System.out.println("could not find person.");
        }
        dataArray.delete("Kadia");
        dataArray.display();
    }
}
