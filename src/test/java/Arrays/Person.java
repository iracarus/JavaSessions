package Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String first, String last, int a)
    {
        firstName = first;
        lastName = last;
        age = a;
    }

    public void displayPerson()
    {
        System.out.println("First Name : " + firstName + ", Last Name : " + lastName + ", Age : " + age);
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String first)
    {
        firstName = first;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String last)
    {
        lastName = last;
    }
}
