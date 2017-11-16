package md.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Mark {

    private Integer mark;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
