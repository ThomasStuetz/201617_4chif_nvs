package at.htl.zoo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Elephant extends Animal {

    int trunkLength;

    public Elephant() {
    }

    public Elephant(String name, int trunkLength) {
        super(name);
        this.trunkLength = trunkLength;
    }
}
