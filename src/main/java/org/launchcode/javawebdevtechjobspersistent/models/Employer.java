package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Employer extends AbstractEntity {

    String location;

    @OneToMany @JoinColumn
    private List<Job> jobs;

    public Employer() {
        this.location = "";
        this.jobs = new ArrayList<Job>();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

