package top.zzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zzh.model.User;
import top.zzh.service.UserService;

/**
 * Created by Administrator on 2018/4/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "add",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public int addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "all/{pageNum}/{pageSize}",produces ={"application/json;charset=UTF-8"} )
    @ResponseBody
    public Object findAllUser(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

}
