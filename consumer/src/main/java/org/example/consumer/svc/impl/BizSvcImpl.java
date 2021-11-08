package org.example.consumer.svc.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.consumer.svc.BizSvc;
import org.example.entity.MongoData;
import org.example.entity.QueryData;
import org.example.svc.MongoDataSvc;
import org.springframework.stereotype.Service;

/**
 * 业务服务接口实现
 *
 * @author luchaoxin
 * @version V 1.0
 * @date 2021-11-08
 */
@Service
public class BizSvcImpl implements BizSvc {

    @DubboReference(version = "1.0.0",
            url = "dubbo://127.0.0.1:20896")
    private MongoDataSvc mongoDataSvc;

    @Override
    public MongoData query(QueryData queryData) {
        return mongoDataSvc.query(queryData);
    }
}
