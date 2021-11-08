package org.example.entity;


import org.bson.types.ObjectId;
import lombok.Data;

import java.io.Serializable;

/**
 * MongoDB 数据
 *
 * @author luchaoxin
 * @version V 1.0
 * @date 2021/8/5
 */
@Data
public class MongoData implements Serializable {

    private ObjectId id;

    private String name;

}
