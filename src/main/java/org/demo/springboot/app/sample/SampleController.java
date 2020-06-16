package org.demo.springboot.app.sample;

import org.demo.springboot.domain.exbhv.UserBhv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    private UserBhv userBhv;

    @RequestMapping
    public String sample() {
        userBhv.selectByPK(1);
        return "sample/sample";
    }
}
