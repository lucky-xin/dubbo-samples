package org.example.provider.svc.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.entity.MongoData;
import org.example.entity.QueryData;
import org.example.svc.MongoDataSvc;
import org.springframework.stereotype.Service;

/**
 * MongoDB 数据查询服务实现
 *
 * @author luchaoxin
 * @version V 1.0
 * @date 2021-11-08
 */
@Service
@DubboService(
        interfaceClass = MongoDataSvc.class,
        version = "${dubbo.application.version}",
        registry = "${dubbo.registry.id}"
)
public class MongoDataSvcImpl implements MongoDataSvc {

    @Override
    public MongoData query(QueryData queryData) {
        System.out.println(queryData);
        MongoData mongoData = new MongoData();
        mongoData.setId(queryData.getId());
        mongoData.setName(queryData.getName());
        return mongoData;
    }
}
