package foodGroup4.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ChinhanhmonId implements Serializable {
    private Chinhanh chinhanh;
    private Mon mon;

    public ChinhanhmonId(Chinhanh chinhanh, Mon mon) {
        this.chinhanh = chinhanh;
        this.mon = mon;
    }

    public ChinhanhmonId() {
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Mon getMon() {

        return mon;
    }

    public void setMon(Mon mon) {
        this.mon = mon;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Chinhanh getChinhanh() {

        return chinhanh;
    }

    public void setChinhanh(Chinhanh chinhanh) {

        this.chinhanh = chinhanh;
    }
}
