package com.example.smspr2.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tbpost")
@Controller

public class TbpostPageController {

    @GetMapping("/{page}")
    public String page(@PathVariable("page") String page) {
        return "tbpost/" + page;
    }

    @GetMapping("/page2/{order}")
    public String detail(@PathVariable("order") String order) {
        return "tbpost/page2";
    }


}
