package org.example.entity;


import lombok.Data;
import org.bson.types.ObjectId;

import java.io.Serializable;

/**
 * MongoDB 数据
 *
 * @author luchaoxin
 * @version V 1.0
 * @date 2021/8/5
 */
@Data
public class QueryData implements Serializable {

    private ObjectId id;

    private String name;

}
