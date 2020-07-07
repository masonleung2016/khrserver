package com.ufostudio.khr.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:48
 * @Package: com.ufostudio.khr.model
 */

public class Nation implements Serializable {
    private Integer id;

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Nation nation = (Nation) o;
        return Objects.equals(name, nation.name);
    }

    public Nation() {
    }

    public Nation(String name) {

        this.name = name;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
