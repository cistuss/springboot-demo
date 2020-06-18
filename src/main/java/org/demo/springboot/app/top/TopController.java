package org.demo.springboot.app.top;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TopController {

    @RequestMapping
    public String index() {
        return "top";
    }
}
