package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity

public class Skill extends AbstractEntity {

    String description;

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