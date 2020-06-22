package com.atguigu.springcloud.entities;

import lombok.*;

/**
 * @author ch33orange
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    private String serial;
}
