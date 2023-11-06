package homework.homework14;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    private String group;
    private int course;
    private final List<Integer> marks;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = new ArrayList<>();
    }

    public Student(String name, String group, int course, int... marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = new ArrayList<>();
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public void addSubjectMark(int mark){
        marks.add(mark);
    }

    public double getAverageMark(){
        if(marks.isEmpty()){
            return 0;
        }else{
            double averageMark = 0;
            for (Integer mark : marks) {
                averageMark += mark;
            }
            return averageMark / marks.size();
        }
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks.toString() +
                ", average mark=" + this.getAverageMark() +
                '}';
    }
}
