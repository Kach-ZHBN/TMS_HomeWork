package homework.homework39.model;


import jakarta.validation.constraints.*;

public class User {
    private int id;
    @Size(min = 3, max = 15)
    @NotEmpty()
    private String firstName;
    @Size(min = 3, max = 15)
    @NotEmpty()
    private String lastName;
    @NotNull()
    @Min(value = 11)
    private int age;
    @Size(min = 3, max = 15)
    @NotEmpty()
    private String country;
    @NotEmpty()
    @Email()
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, int age, String country, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.email = email;
    }

    public User(int id, String firstName, String lastName, int age, String country, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
