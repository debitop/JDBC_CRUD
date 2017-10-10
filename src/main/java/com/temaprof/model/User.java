package com.temaprof.model;


import java.util.Date;

/**
 * Created by TEMAPROF on 03.06.2017.
 * Each of the variables in this class represents the field in USERS table in our database.
 */
public class User {
    private int userid;
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [userid=" + userid + ", firstName=" + firstName
                + ", lastName=" + lastName + ", dob=" + dob + ", email="
                + email + "]";
    }
}
