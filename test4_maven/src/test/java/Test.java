import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test {
    private static Student st0, st1, st2, st3;

    @BeforeAll
    public static void new_Student() {
        st0 = new Student("", "", "", 0, "",new int[]{2,5,3,5,4,1,2});
        st1 = new Student("Smith", "John", "Rey", 21, "IKM-219a", new int[]{5,5,5,4,5,5,4,4,5});
        st2 = new Student("Antrade", "Mishel", "Borusovna", 16, "KN-55", new int[]{1,5,3,3,3,3});
        st3 = new Student("Ruby", "Alex","Nick", 56, "KIT-022l", new int[]{5,5,5,4,5,4,5,4});
    }

    @Test
    public void Test_getFullName() throws IncorrectUsernameException {
        Assertions.assertEquals(st3.getLast_name() + " " + st3.getFirst_name() + " " + st3.getPatronymic(), st3.getFullName());
    }

    @Test
    public void Test1_isAdult() {
        Assertions.assertTrue(st3.isAdult(st3));
    }

    @Test
    public void Test2_isAdult() {
        Assertions.assertFalse(st2.isAdult(st2));
    }

    @Test
    public void Test_GetMarksAverage(){
        Assert.assertEquals(5, st2.getMarksAverage());
    }

    @Test
    public void Test_getBetterStudentByAverage() {
        Assertions.assertEquals(st3, Student.getBetterStudentByAverage(st1, st2, st3));
    }

    @Test
    public void Test_IsExcelentStudent(){
        Assert.assertTrue(st1.isExcelentStudent());
    }
}
