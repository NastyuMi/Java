public class Person {
    private String last_name;
    private String first_name;
    private String patronymic;
    private int age;

    public Person(String last_name, String first_name, String patronymic, int age) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_nameame(String first_name) {
        this.first_name = first_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult(Person person){
        return person.age >= 18;
    }

    public String getFullName(){
        if(last_name.isEmpty() || first_name.isEmpty() || patronymic.isEmpty()){
            throw new IncorrectUsernameException("Incorrect username");
        } else{
            return last_name + ", " + first_name + " " + patronymic;
        }
    }
}
