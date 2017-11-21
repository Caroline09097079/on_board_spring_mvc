package md.model;

import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
@Table(name = "Library")
public class LibraryAbonament {

    @Id
    @OneToOne
    @JoinColumn(name = "id")
    private Integer id;

    @Column (name ="status")
    private String status;

    @Column (name = "start_date")
    private Data start_date;

    @Column (name = "end_date")
    private Data end_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getStart_date() {
        return start_date;
    }

    public void setStart_date(Data start_date) {
        this.start_date = start_date;
    }

    public Data getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Data end_date) {
        this.end_date = end_date;
    }
}

