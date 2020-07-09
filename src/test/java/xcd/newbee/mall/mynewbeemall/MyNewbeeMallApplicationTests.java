package xcd.newbee.mall.mynewbeemall;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyNewbeeMallApplicationTests {

    @Autowired
    private DataSource defaultDataSource;

    @Test
    public void datasourceTest() throws SQLException {
//        Connection connection = defaultDataSource.getConnection();
//        System.out.println("获取连接");
//        System.out.println(connection != null);
//        connection.close();
        System.out.println("默认数据源为： "+ defaultDataSource.getClass());
    }

}
