package com.andersen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    /**
    * Here we will get the index responce when requesting http://localhost:1111/ page for the App
    */
    @GetMapping("/")
    public String index() {
        //index is the name of the view to be returned stored in the resources/templates/
        return "index";
    }

    /**
    * Processes requests to the welcome page.
    * Sends simple message from the controller in response.
    */
    @GetMapping("/welcome")
    public ModelAndView welcome() {

        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("message", "Spring 'welcome controller' says: \"Hi!\"");

        return mv;
    }
}
