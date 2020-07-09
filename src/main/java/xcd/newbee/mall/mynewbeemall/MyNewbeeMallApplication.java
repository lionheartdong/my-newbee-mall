package xcd.newbee.mall.mynewbeemall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("xcd.newbee.mall.mynewbeemall.dao")
@SpringBootApplication
public class MyNewbeeMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyNewbeeMallApplication.class, args);
    }

}
