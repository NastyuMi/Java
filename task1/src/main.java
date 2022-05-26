import java.util.Date;

public class main {
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.input("Maria", 1999);
        person1.newName("Misha");
        person1.output();
        Person person2 = new Person();
        person2.input("Petro", 1956);
        person2.output();
        Person person3 = new Person();
        person3.input("Olha", 2000);
        person3.output();
        Person person4 = new Person();
        person4.input("Mark", 1973);
        person4.output();
        person4.newName("Rita");
        person4.output();
        Person person5 = new Person();
        person5.input("Nastya",2001);
        person5.output();

    }
}

class Person
{
    String name;
    int birthYear;
    private String getName(String name)
    {
        return name;
    }
    private int getBirthYear(int birthYear)
    {
        return birthYear;
    }
    public void  input(String name, int birthYear)
    {
        this.name=name;
        this.birthYear=birthYear;
    }

    private int age()
    {
        return 2022-birthYear;
    }

    public String newName (String new_name)
    {
        name= new_name;
        return name;
    }

    public void output()
    {
        System.out.println("This is " + name+". She/He is "+ age()+" years old.");
    }
}