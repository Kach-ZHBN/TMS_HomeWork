package homework.homework14;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UniversityTest {
    private final University university = new University();

    @BeforeTest
    public void initialize(){
        university.addStudent(new Student("Alex", "PE-16", 2, 4, 5, 4, 3, 5)); //4.2
        university.addStudent(new Student("John", "IS-42", 4, 3, 3, 3, 3, 3)); //3.0
        university.addStudent(new Student("Mary", "AS-10", 1, 5, 5, 4, 5, 5)); //4.8
        university.addStudent(new Student("Mason", "PE-16", 2, 2, 3, 3, 2, 2)); //2.4
        university.addStudent(new Student("Michael", "PE-14", 4, 2, 2, 3, 2, 2)); //2.2
        university.addStudent(new Student("Ethan", "PE-16", 2, 2, 3, 3, 2, 2)); //2.4
        university.addStudent(new Student("Jacob", "PE-16", 2, 5, 4, 3, 2, 2)); //3.2
        university.addStudent(new Student("William", "PE-16", 2, 3, 4, 5, 3, 2)); //3.4
    }
    @Test
    public void testSession() {
        university.session();
        assertEquals(university.getStudentList().size(), 5);
        assertEquals(university.getStudentList().get(0).getCourse(), 3);
        assertEquals(university.getStudentList().get(1).getCourse(), 5);
        assertEquals(university.getStudentList().get(2).getCourse(), 2);
        assertEquals(university.getStudentList().get(3).getCourse(), 3);
        assertEquals(university.getStudentList().get(4).getCourse(), 3);
    }
}