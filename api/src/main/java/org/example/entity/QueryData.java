package org.example.entity;


import lombok.Data;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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

    /**
     * 排序字段
     */
//    private List<Map<Direction, List<String>>> sorts;
    private List<String> sorts;

}
