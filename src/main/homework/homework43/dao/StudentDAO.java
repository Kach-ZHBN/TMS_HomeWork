package homework.homework43.dao;

import homework.homework43.HibernateSessionFactory;
import homework.homework43.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {
    private Session session;


    private Session openCurrentSession(){
        session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
        return session;
    }


    public Student create(Student student){
        Transaction transaction = openCurrentSession().beginTransaction();

        session.persist(student);
        transaction.commit();

        session.close();
        return student;
    }

    public Student get(int id){
        Transaction transaction = openCurrentSession().beginTransaction();

        Student student = session.get(Student.class, id);
        session.close();

        return student;
    }

    public void update(Student student){
        Transaction transaction = openCurrentSession().beginTransaction();;

        session.update(student);
        transaction.commit();
        session.close();
    }

    public void delete(Student student){
        Transaction transaction = openCurrentSession().beginTransaction();

        session.delete(student);
        session.flush();
        transaction.commit();
        session.close();
    }
}
