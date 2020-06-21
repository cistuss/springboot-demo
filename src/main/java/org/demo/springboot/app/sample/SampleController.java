package org.demo.springboot.app.sample;

import org.demo.springboot.app.common.security.LoggedUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    //    @Autowired
    //    private LoggedUser loggedUser;

    @RequestMapping
    public String sample(Model model, @AuthenticationPrincipal LoggedUser loggedUser) {
        if (loggedUser == null) {
            logger.debug("Not logged in");
        } else {
            model.addAttribute("", loggedUser.getUsername());
        }
        return "sample/sample";
    }
}
