package md.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Address")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "Country")
    private String country;

    @Column(name = "City")
    private String city;

    @Column(name = "Address")
    private String adress;

    @OneToMany(mappedBy="address")
    private List<Person2> persons;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Person2> getPersons() {
        return persons;
    }

    public void setPersons(List<Person2> persons) {
        this.persons = persons;
    }
}
