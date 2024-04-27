package homework.homework43;

import homework.homework43.dao.StudentDAO;
import homework.homework43.model.Student;
import homework.homework43.model.StudentsRecordBook;

public class Test {


    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        StudentsRecordBook studentsRecordBook = new StudentsRecordBook(6.8);
        Student student = new Student(25, "firstName", "lastName", "group", true);
        student.setStudentsRecordBook(studentsRecordBook);
        studentDAO.create(student);

        Student updatedStudent = studentDAO.get(3);
        updatedStudent.setStudentsRecordBook(new StudentsRecordBook(3.3336));
        studentDAO.update(updatedStudent);


        Student deletedStudent = studentDAO.get(28);
        studentDAO.delete(deletedStudent);

    }


}
