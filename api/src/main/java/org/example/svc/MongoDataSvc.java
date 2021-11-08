package org.example.svc;

import org.example.entity.MongoData;
import org.example.entity.QueryData;

/**
 * MongoDB 数据查询服务接口
 *
 * @author luchaoxin
 * @version V 1.0
 * @date 2021-11-08
 */
public interface MongoDataSvc {

    /**
     * 数据查询
     *
     * @param queryData
     * @return
     */
    MongoData query(QueryData queryData);
}
