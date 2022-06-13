public class main {

    public static void main(String[] args) {
        Student student1 = new Student("Perri", "Ferb", "Finesovich", 21, "I219a", new int[] {1,4,1,4,2});
        System.out.println(student1.getFullName());
        System.out.println(student1.isAdult(student1));
        System.out.println(student1.getMarksAverage());
    }
}
