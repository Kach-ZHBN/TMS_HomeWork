package homework;

import homework.homework20.dao.UserDAO;
import homework.homework20.model.User;

public class HomeworkTwenty {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User firstUser = new User("firstName", "lastName", 33, "Belarus", "email@email.by");
        userDAO.save(firstUser);
        User secondUser = new User("SecondfirstName", "SecondlastName", 233, "SecondCountry", "Second_email@email.by");
        userDAO.save(secondUser);

        System.out.println("Get all");
        System.out.println(userDAO.getAll());
        System.out.println("------------------");

        System.out.println("Get by first name and last name");
        User firstUserFromDB = userDAO.getByFistNameLastName("firstName", "lastName");
        User secondUserFromDB = userDAO.getByFistNameLastName("SecondfirstName", "SecondlastName");
        System.out.println(firstUserFromDB);
        System.out.println(secondUserFromDB);
        System.out.println("------------------");

        System.out.println("Get by id");
        System.out.println(userDAO.getById(firstUserFromDB.getId()));
        System.out.println(userDAO.getById(secondUserFromDB.getId()));
        System.out.println("-----------------");

        System.out.println("Update");
        firstUserFromDB.setFirstName("UpdatedFirstName");
        firstUserFromDB.setLastName("UpdatedLastName");
        firstUserFromDB.setAge(91);
        firstUserFromDB.setCountry("UpdatedCountry");
        firstUserFromDB.setEmail("Updated email");
        userDAO.update(firstUserFromDB.getId(), firstUserFromDB);
        System.out.println(userDAO.getAll());
        System.out.println("-----------------");

        System.out.println("Delete");
        userDAO.delete(firstUserFromDB.getId());
        userDAO.delete(secondUserFromDB.getId());
        if(userDAO.getById(secondUserFromDB.getId()) == null || userDAO.getById(firstUserFromDB.getId()) == null){
            System.out.println("Succes");
        }else {
            System.out.println("Error");
        }
        System.out.println("------------------");
    }
}
