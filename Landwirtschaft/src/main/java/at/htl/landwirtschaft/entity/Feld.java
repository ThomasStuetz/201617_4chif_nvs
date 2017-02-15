package at.htl.landwirtschaft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feld {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    public Feld(String name) {
        this.name = name;
    }

    public Feld() {
    }

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

    @Override
    public String toString() {
        return "Feld{" +
                id +
                ": " + name +
                '}';
    }
}
