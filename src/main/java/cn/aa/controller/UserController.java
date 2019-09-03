package cn.aa.controller;

import cn.aa.pojo.User;
import cn.aa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping(value = "getUserByID", method = RequestMethod.GET)
    @ResponseBody
    public User getUserByID(String id){
        return userService.getUserByID(Integer.parseInt(id));
    }

}
