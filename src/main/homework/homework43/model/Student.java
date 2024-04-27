package homework.homework43.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "age")
    private int age;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "university_group")
    private String group;
    @Column(name = "course_is_paid")
    private boolean courseIsPaid;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentsRecordBook studentsRecordBook;

    public Student() {
    }

    public Student(int age, String firstName, String lastName, String group, boolean courseIsPaid) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.courseIsPaid = courseIsPaid;
    }

    public Student(int age, String firstName, String lastName, String group, boolean courseIsPaid, StudentsRecordBook studentsRecordBook) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.courseIsPaid = courseIsPaid;
        this.studentsRecordBook = studentsRecordBook;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCourseIsPaid() {
        return courseIsPaid;
    }

    public void setCourseIsPaid(boolean courseIsPaid) {
        this.courseIsPaid = courseIsPaid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public StudentsRecordBook getStudentsRecordBook() {
        return studentsRecordBook;
    }

    public void setStudentsRecordBook(StudentsRecordBook studentsRecordBook) {
        this.studentsRecordBook = studentsRecordBook;
        studentsRecordBook.setStudent(this);
    }
}
