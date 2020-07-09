package xcd.newbee.mall.mynewbeemall.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xcd.newbee.mall.mynewbeemall.dao.UserDao;
import xcd.newbee.mall.mynewbeemall.entity.User;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author lionheart
 * @create 2020-07-06 22:03
 */
@RestController
public class MyBatisController {

    @Resource
    UserDao userDao;

    //查询
    @GetMapping("/users/mybatis/queryAll")
    public List<User> queryAll(){
        return userDao.findAllUsers();
    }
    //添加
    @GetMapping("/users/mybatis/insert")
    public Boolean insert(String name,String password){
        //不能为空
        if(StringUtils.isEmpty(name) || StringUtils.isEmpty(password)){
            return false;
        }
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        return userDao.insertUser(user) > 0;
    }
    //更新
    @GetMapping("/users/mybatis/update")
    public Boolean insert(Integer id,String name, String password){
        if(id == null || StringUtils.isEmpty(name) || StringUtils.isEmpty(password)){
            return false;
        }
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        return userDao.upUser(user) > 0;
    }
    //删除
    @GetMapping("/users/mybatis/delete")
    public Boolean insert(Integer id){
        if(id == null || id < 1){
            return false;
        }
        return userDao.delUser(id) >0;
    }
// 查询所有记录
//@GetMapping("/users/mybatis/queryAll")
//public List<User> queryAll() {
//    return userDao.findAllUsers();
//}
//
//    // 新增一条记录
//    @GetMapping("/users/mybatis/insert")
//    public Boolean insert(String name, String password) {
//        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
//            return false;
//        }
//        User user = new User();
//        user.setName(name);
//        user.setPassword(password);
//        return userDao.insertUser(user) > 0;
//    }
//
//    // 修改一条记录
//    @GetMapping("/users/mybatis/update")
//    public Boolean insert(Integer id, String name, String password) {
//        if (id == null || id < 1 || StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
//            return false;
//        }
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        user.setPassword(password);
//        return userDao.upUser(user) > 0;
//    }
//
//    // 删除一条记录
//    @GetMapping("/users/mybatis/delete")
//    public Boolean insert(Integer id) {
//        if (id == null || id < 1) {
//            return false;
//        }
//        return userDao.delUser(id) > 0;
//    }
}
