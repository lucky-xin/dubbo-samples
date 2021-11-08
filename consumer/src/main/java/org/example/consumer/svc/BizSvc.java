package org.example.consumer.svc;

import org.example.entity.MongoData;
import org.example.entity.QueryData;

/**
 * 业务服务接口
 *
 * @author luchaoxin
 * @version V 1.0
 * @date 2021-11-08
 */
public interface BizSvc {
    /**
     * 查询数据
     *
     * @param queryData
     * @return
     */
    MongoData query(QueryData queryData);
}
