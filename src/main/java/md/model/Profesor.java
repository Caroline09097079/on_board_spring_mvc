package md.model;

        import com.fasterxml.jackson.annotation.JsonFormat;

        import javax.persistence.*;
        import java.io.Serializable;
        import java.time.LocalDate;
        import java.util.Date;

@Entity
@Table (name = "Profesor")
public class Profesor extends Person {

    @Id
    @ManyToMany
    @JoinColumn (name = "id")
    private Integer id;

    @Column(name = "salary")
    private Double salary ;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
