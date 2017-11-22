package md.model;

import javax.persistence.*;

@Entity
@Table(name = "discipline_average")

public class DisciplineAverage {

    @Id
    @ManyToMany
    @JoinColumn(name = "id")
    private Integer id;


}
