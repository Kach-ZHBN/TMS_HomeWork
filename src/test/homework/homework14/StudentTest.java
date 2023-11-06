package homework.homework14;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StudentTest {

    @Test
    public void testGetAverageMark() {
        Student student = new Student("Alex", "OS-2", 1);
        assertEquals(student.getAverageMark(), 0);
        student.addSubjectMark(3);
        assertEquals(student.getAverageMark(), 3);
        student.addSubjectMark(4);
        student.addSubjectMark(2);
        student.addSubjectMark(3);
        student.addSubjectMark(1);
        assertEquals(student.getAverageMark(), 2.6);

        student = new Student("Alex", "OS-2", 1, 4, 7, 4, 5, 6, 1, 2, 3, 4);
        assertEquals(student.getAverageMark(), 4);
    }
}