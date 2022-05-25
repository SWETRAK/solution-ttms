package com.example.solutionttms.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany
    private List<Privilage> privilages;
    @OneToMany(mappedBy = "role")
    private List<MyUser> myUsers;


    public Role() {
    }

    public Role(String name, List<Privilage> privilages, List<MyUser> myUsers) {
        this.name = name;
        this.privilages = privilages;
        this.myUsers = myUsers;
    }

    public Role(Long id, String name, List<Privilage> privilages, List<MyUser> myUsers) {
        this.id = id;
        this.name = name;
        this.privilages = privilages;
        this.myUsers = myUsers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Privilage> getPrivilages() {
        return privilages;
    }

    public void setPrivilages(List<Privilage> privilages) {
        this.privilages = privilages;
    }

    public List<MyUser> getMyUsers() {
        return myUsers;
    }

    public void setMyUsers(List<MyUser> myUsers) {
        this.myUsers = myUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (id != null ? !id.equals(role.id) : role.id != null) return false;
        if (name != null ? !name.equals(role.name) : role.name != null) return false;
        if (privilages != null ? !privilages.equals(role.privilages) : role.privilages != null) return false;
        return myUsers != null ? myUsers.equals(role.myUsers) : role.myUsers == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (privilages != null ? privilages.hashCode() : 0);
        result = 31 * result + (myUsers != null ? myUsers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", privilages=" + privilages +
                ", myUsers=" + myUsers +
                '}';
    }
}
