package md.model;

import javax.persistence.*;

@Entity
@Table(name = "Group")
public class Group {

    @Id
    @OneToOne
    @JoinColumn (name = "person_id")
    private Long id;

    @Column(name = "Name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
