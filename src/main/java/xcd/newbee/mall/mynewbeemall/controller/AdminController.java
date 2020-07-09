package xcd.newbee.mall.mynewbeemall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lionheart
 * @create 2020-07-09 20:26
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/indexAll")
    public String indexAll(){
        return "admin/index-all";
    }
}
