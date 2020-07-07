package com.ufostudio.khr.model;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:50
 * @Package: com.ufostudio.khr.model
 */

public class RespPageBean {
    private Long total;
    private List<?> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
