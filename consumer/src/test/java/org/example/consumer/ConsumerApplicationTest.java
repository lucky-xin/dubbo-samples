package org.example.consumer;

import org.bson.types.ObjectId;
import org.example.consumer.svc.BizSvc;
import org.example.entity.Direction;
import org.example.entity.MongoData;
import org.example.entity.QueryData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * @author luchaoxin
 * @version V 1.0
 * @date 2021-11-08
 */
@SpringBootTest(classes = ConsumerApplication.class)
public class ConsumerApplicationTest {


    @Autowired
    private BizSvc bizSvc;

    @Test
    public void test() {
        QueryData queryData = new QueryData();
        queryData.setId(new ObjectId("61692f95730e260dac69d1ef"));
        queryData.setName("xxx");
//        queryData.setSorts(List.of(Map.of(Direction.DESC, List.of("username", "id"))));
        queryData.setSorts(List.of("username", "id"));
        MongoData result = bizSvc.query(queryData);
        System.out.println(result);
        System.out.println(result.getId().toHexString().equals(queryData.getId().toHexString()));
    }

}
