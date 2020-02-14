package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.ArrayList;

@Entity

public class Skill extends AbstractEntity {


    private String description;

    @ManyToMany(mappedBy ="skills") //@JoinColumn
    private List<Job> jobs = new ArrayList<>();
    public List<Job> getJobs() {
        return jobs;
    }

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