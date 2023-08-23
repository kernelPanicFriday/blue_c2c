package com.kernalPanic.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {
    @GetMapping("/home")
    public String home(){
        //@RequestParam(name="name", required=false, defaultValue="Stranger") String name, Model model
        //model.addAttribute("name", name);
        return "home";
    };

    @GetMapping("/fileScan")
    public String fileScan(){
        return "fileScan";
    }

    @GetMapping("/domainCheck")
    public String domainCheck(){
        return "domainCheck";
    }
}
