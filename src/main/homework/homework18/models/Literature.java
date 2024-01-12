package homework.homework18.models;

import java.util.ArrayList;
import java.util.List;

public class Literature {
    private String firstName;
    private String lastName;
    private String title;
    private final List<String> lines;

    public Literature(String firstName, String lastName, String title, List<String> lines) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.lines = lines;
    }

    public Literature() {
        this.lines = new ArrayList<>();
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : lines) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}
