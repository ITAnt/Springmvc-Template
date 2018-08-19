package com.cenyol.example.controller.api;

import com.alibaba.fastjson.JSON;
import com.cenyol.example.model.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    // 添加@ResponseBody注解就可以返回json了
    @RequestMapping(value = "/huiyun/register", method = RequestMethod.GET)
    @ResponseBody
    public String register(/*@ModelAttribute("user") UserEntity userEntity, @ModelAttribute("activeCode") String code*/) {
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象



        // 数据库中添加一个用户，并立即刷新缓存
        //userRepository.saveAndFlush(userEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(0);
        responseResult.setMessage("Success");
        return JSON.toJSONString(responseResult);
    }
}
