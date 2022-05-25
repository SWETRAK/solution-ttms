package com.example.solutionttms.models;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String email;
    @ManyToOne
    private Role role;


    public MyUser() {
    }

    public MyUser(String firstName, String email, Role role) {
        this.firstName = firstName;
        this.email = email;
        this.role = role;
    }

    public MyUser(Long id, String firstName, String email, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyUser myUser = (MyUser) o;

        if (!Objects.equals(id, myUser.id)) return false;
        if (!Objects.equals(firstName, myUser.firstName)) return false;
        if (!Objects.equals(email, myUser.email)) return false;
        return Objects.equals(role, myUser.role);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
