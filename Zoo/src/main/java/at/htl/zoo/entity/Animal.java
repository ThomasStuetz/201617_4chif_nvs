package at.htl.zoo.entity;

import javax.persistence.*;


@NamedQueries({
        @NamedQuery(name = "Animal.findAll",
                query = "select a from Animal a")
})
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    Long id;

    private String name;

    @Column(name = "DTYPE", insertable = false, updatable = false)
    private String dType;

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

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
