package org.demo.springboot.app.top;

import org.demo.springboot.app.common.security.LoggedUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author cistus
 */
@Controller
@RequestMapping("/")
public class TopController {

    private static final Logger logger = LoggerFactory.getLogger(TopController.class);

    @RequestMapping
    public String index(Model model, @AuthenticationPrincipal LoggedUser loggedUser) {
        logger.debug("{}", loggedUser);
        model.addAttribute("user", loggedUser);
        return "top";
    }
}
