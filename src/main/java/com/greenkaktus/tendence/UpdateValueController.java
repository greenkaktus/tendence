package com.greenkaktus.tendence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateValueController {

    @RequestMapping("/updateValue")
    public String index(@RequestParam("value") String value) {
        return "index";
    }

}
