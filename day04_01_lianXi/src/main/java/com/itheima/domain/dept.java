package com.itheima.domain;

public class dept {
    private Integer did;
    private String dept_name;

    @Override
    public String toString() {
        return "dept{" +
                "did=" + did +
                ", dept_name='" + dept_name + '\'' +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
