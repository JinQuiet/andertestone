package com.andersen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

}
