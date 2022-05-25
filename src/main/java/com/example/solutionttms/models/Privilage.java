package com.example.solutionttms.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Privilage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String privilageName;
    @ManyToMany
    private List<Role> roles;

    public Privilage() {
    }

    public Privilage(String privilageName, List<Role> roles) {
        this.privilageName = privilageName;
        this.roles = roles;
    }

    public Privilage(Long id, String privilageName, List<Role> roles) {
        this.id = id;
        this.privilageName = privilageName;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilageName() {

        return privilageName;
    }

    public void setPrivilageName(String privilageName) {
        this.privilageName = privilageName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Privilage that = (Privilage) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (privilageName != null ? !privilageName.equals(that.privilageName) : that.privilageName != null)
            return false;
        return roles != null ? roles.equals(that.roles) : that.roles == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (privilageName != null ? privilageName.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Privilages{" +
                "id=" + id +
                ", privilageName='" + privilageName + '\'' +
                ", roles=" + roles +
                '}';
    }
}
