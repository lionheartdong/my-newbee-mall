package xcd.newbee.mall.mynewbeemall.dao;

import xcd.newbee.mall.mynewbeemall.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author lionheart
 * @create 2020-07-06 21:49
 */
public interface UserDao {
    //返回数据列表
    List<User> findAllUsers();
    //添加
    int insertUser(User user);

    //修改
    int upUser(User user);

    //删除
    int delUser(Integer id);
}
