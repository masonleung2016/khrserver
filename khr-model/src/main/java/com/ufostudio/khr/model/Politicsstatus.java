package com.ufostudio.khr.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:49
 * @Package: com.ufostudio.khr.model
 */

public class Politicsstatus implements Serializable {
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
        Politicsstatus that = (Politicsstatus) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public Politicsstatus() {

    }

    public Politicsstatus(String name) {

        this.name = name;
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
