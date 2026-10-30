package org.arham.spring_jpa_demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Standard
{
    @Id
    int std;

    @Column
    String description;

    public Standard() {
    }

    public Standard(int std, String description) {
        this.std = std;
        this.description = description;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
