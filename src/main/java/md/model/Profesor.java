package md.model;

        import com.fasterxml.jackson.annotation.JsonFormat;

        import javax.persistence.*;
        import java.io.Serializable;
        import java.time.LocalDate;
        import java.util.Date;

@Entity
public class Profesor extends Person {
    @Column
   private Double salary ;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
