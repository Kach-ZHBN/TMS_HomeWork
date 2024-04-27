package homework.homework43.dao;

import homework.homework43.HibernateSessionFactory;
import homework.homework43.model.StudentsRecordBook;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
public class StudentsRecordBookDAO {
    private Session session;


    private Session openCurrentSession(){
        session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
        return session;
    }


    public StudentsRecordBook create(StudentsRecordBook studentsRecordBook){
        Transaction transaction = openCurrentSession().beginTransaction();

        session.persist(studentsRecordBook);
        transaction.commit();

        session.close();
        return studentsRecordBook;
    }

    public StudentsRecordBook get(int id){
        Transaction transaction = openCurrentSession().beginTransaction();

        StudentsRecordBook studentsRecordBook = session.get(StudentsRecordBook.class, id);
        session.close();

        return studentsRecordBook;
    }

    public void update(StudentsRecordBook studentsRecordBook){
        Transaction transaction = openCurrentSession().beginTransaction();;

        session.update(studentsRecordBook);
        transaction.commit();
        session.close();
    }

    public void delete(StudentsRecordBook studentsRecordBook){
        Transaction transaction = openCurrentSession().beginTransaction();

        session.delete(studentsRecordBook);
        session.flush();
        transaction.commit();
        session.close();
    }

}
