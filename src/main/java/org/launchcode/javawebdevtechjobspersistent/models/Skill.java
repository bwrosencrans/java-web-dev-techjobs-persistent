package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.ArrayList;

@Entity

public class Skill extends AbstractEntity {

    String description;

    //@ManyToMany(mappedBy ="skills")
    //List<Job> jobs;

    public Skill() {
        this.description = "";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String location) {
        this.description = location;
    }

}