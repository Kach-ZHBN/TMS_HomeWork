package homework.homework14;

import java.util.LinkedList;
import java.util.List;

public class University {
    private final List<Student> studentList;

    public University() {
        studentList = new LinkedList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void session() {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getAverageMark() < 3) {
                studentList.remove(student);
                i--;
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public void printAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
