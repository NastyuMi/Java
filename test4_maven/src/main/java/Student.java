public class Student extends Person{
    private String group;
    private int[] marks;

    public Student(String lastName, String firstName, String patronymic, int age, String group, int[] marks) {
        super(lastName, firstName, patronymic, age);
        this.group = group;
        this.marks = marks;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getMarksAverage(){
        double sum = 0;
        double result = 0.0;
        double n =marks.length;
        for(int i = 0; i < n; i++){
            sum += marks[i];
        }
        result = sum/n;
        return result;
    }

    public static Student getBetterStudentByAverage(Student student1, Student student2, Student student3) {
        double st1 = student1.getMarksAverage();
        double st2 = student2.getMarksAverage();
        double st3 = student3.getMarksAverage();

        if(st1>st2 && st1>st3)
        {
            return student1;
        }

        else if(st2 > st1 && st2 > st3){
            return student2;
        }

        else{
            return student3;
        }
    }

    public boolean isExcelentStudent(){
        for(int i = 0; i < marks.length; i++){
            if(marks[i] < 4){
                return false;
            }
        }
        return true;
    }

}
