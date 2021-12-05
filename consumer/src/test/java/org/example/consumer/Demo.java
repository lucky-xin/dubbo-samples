package org.example.consumer;

import com.alibaba.com.caucho.hessian.io.Hessian2Input;
import com.alibaba.com.caucho.hessian.io.Hessian2Output;
import lombok.SneakyThrows;
import org.bson.types.ObjectId;
import org.example.entity.Direction;
import org.example.entity.QueryData;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/**
 * @author luchaoxin
 * @version V 1.0
 * @date 2021-12-05
 */
public class Demo {

    @Test
    public void test() throws Exception {
        String file = "obj";
        try (OutputStream out = new FileOutputStream(file)) {
            QueryData queryData = new QueryData();
            queryData.setId(new ObjectId("61692f95730e260dac69d1ef"));
            queryData.setName("xxx");
            queryData.setSorts(List.of("username", "id"));
            Hessian2Output hessian2Output = new Hessian2Output(out);
            hessian2Output.writeObject(queryData);
        }

        try (InputStream in = new FileInputStream(file)) {
            Hessian2Input hessian2Output = new Hessian2Input(in);
            QueryData obj = (QueryData) hessian2Output.readObject(QueryData.class);
            System.out.println(obj);
        }
    }
}
