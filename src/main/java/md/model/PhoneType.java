package md.model;


import javax.persistence.*;

@Entity
@Table (name = "phone_type")
public class PhoneType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "phone_type")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
