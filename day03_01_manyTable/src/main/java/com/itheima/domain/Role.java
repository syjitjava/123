package com.itheima.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Role {
    private Integer rid;
    private String roleName;
    private String description;

    public List<User> getRoles() {
        return roles;
    }

    public void setRoles(List<User> roles) {
        this.roles = roles;
    }

    private List<User> roles =new ArrayList<User>(0);

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
