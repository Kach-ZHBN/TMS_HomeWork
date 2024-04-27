package homework.homework43.model;

import jakarta.persistence.*;

@Entity
@Table(name= "student_record_book")
public class StudentsRecordBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "rating")
    private double averageRating;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    public StudentsRecordBook() {
    }

    public StudentsRecordBook(double averageRating) {
        this.averageRating = averageRating;
    }

    public StudentsRecordBook(double averageRating, Student student) {
        this.averageRating = averageRating;
        this.student = student;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
