package com.Tuki.Tuki_Backend_Provisional.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebRedirectController {
    @GetMapping("/")
    public String redirectHome(){
        return "redirect:http://localhost:5173/";
    }
}
