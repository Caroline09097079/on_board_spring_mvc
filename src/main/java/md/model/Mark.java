package md.model;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.nio.MappedByteBuffer;

public class Mark {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne


    @JoinColumn(name = "student_id")
    private Student student;

    @JoinColumn(name = "discipline_id")
    private Discipline discipline;

    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}

