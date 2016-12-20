package at.htl.zoo.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class Animal {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    Long id;

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.setName(name);
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
        return id + ": " + name;
    }
}
