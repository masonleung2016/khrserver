package com.ufostudio.khr.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:51
 * @Package: com.ufostudio.khr.model
 */

public class Role implements Serializable {
    private Integer id;

    private String name;

    private String nameZh;

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

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}
