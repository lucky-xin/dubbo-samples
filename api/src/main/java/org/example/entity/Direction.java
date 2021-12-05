package org.example.entity;

import lombok.Getter;

import java.io.Serializable;

/**
 * @author luchaoxin
 * @version V 1.0
 * @date 2021-12-05
 */
@Getter
public enum Direction implements Serializable {
    /**
     * 生序排序
     */
    ASC(0),

    /**
     * 降序排序
     */
    DESC(1);
    private Integer value;

    Direction(Integer value) {
        this.value = value;
    }

}
