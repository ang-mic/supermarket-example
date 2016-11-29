package org.supermarket.user;


import java.util.Date;

public class User {
    private final long id;
    private final String username, password, firstname, lastname, email, contactNumber;
    private final Date dob;
    //    private final Address address;

    public User() {
        this.id = -1;
        this.username = "";
        this.password = "";
        this.firstname = "";
        this.lastname = "";
        this.email = "";
        this.contactNumber = "";
        this.dob = new Date();
    }

    public User(long id,
                String username,
                String password,
                String firstname,
                String lastname,
                String email,
                String contactNumber,
                Date dob) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.contactNumber = contactNumber;
        this.dob = dob;
    }

    public long id() {
        return id;
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }

    public String firstname() {
        return firstname;
    }

    public String lastname() {
        return lastname;
    }

    public String email() {
        return email;
    }

    public String contactNumber() {
        return contactNumber;
    }

    public Date dob() {
        return dob;
    }
}
