package org.arham.spring_jpa_demo.model;

import jakarta.persistence.*;

@Entity
public class Student
{

    @Id
    int rollno;

    @Column
    String name;

    @Column
    int maths;

    @Column
    int science;

    @ManyToOne
    Standard standard;

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }
}
