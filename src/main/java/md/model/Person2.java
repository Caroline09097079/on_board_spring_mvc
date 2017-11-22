package md.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Table(name="Person")
public class Person2 implements Serializable{

    private static final long serialVersionUID = -5527566248002296042L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="person_id")
    private Integer personid;


    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinTable(name="person_address", joinColumns = @JoinColumn(name = ""))
    private Adress adress;

    @Column(name = "First_Name")
    private String firstname;

    @Column(name = "Last_Name")
    private String lastname;

    @Column(name = "Dob")
    private LocalDate dob;

    @Column(name = "Gender")
    private Character gender;

    @Column(name = "Address")
    private Adress address;

    @Column(name = "Phone")
    private Phone phones;

    @Column(name = "Picture")
    private byte picture;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public Phone getPhones() {
        return phones;
    }

    public void setPhones(Phone phones) {
        this.phones = phones;
    }

    public byte getPicture() {
        return picture;
    }

    public void setPicture(byte picture) {
        this.picture = picture;
    }
}
