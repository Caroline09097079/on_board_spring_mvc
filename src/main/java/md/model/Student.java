package md.model;

import javax.persistence.*;
import java.util.Collection;

public class Student extends Person2 {

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @OneToMany(mappedBy = "student")
    private Collection<Mark> marks;

    @ManyToMany
    @JoinTable(name = "student_discipline",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "discipline_id"))
    private Collection<Discipline> disciplines;
//
//    public double calculateASd(){
//        return marks.stream()
//                .mapToInt(Mark::getMark)
//                .average().orElse(0);
//    }

    public Collection<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Collection<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public Group getGroup() {
        return group;
    }

    public Collection<Mark> getMarks() {
        return marks;
    }

    public void setMarks(Collection<Mark> marks) {
        this.marks = marks;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
