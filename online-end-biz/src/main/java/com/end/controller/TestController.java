package com.end.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description :
 * FileName :
 *
 * @author : Hu mingzhi
 * @version :
 * @date : 2021/8/3 17:39
 */
@RestController
public class TestController {


    @RequestMapping("/index")
    public String home() {
        return "success";

    }

}
