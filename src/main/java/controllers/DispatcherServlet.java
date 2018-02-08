package controllers;

import model.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(types = User.class)
public class DispatcherServlet {

    @RequestMapping(value = "/")
    public String init(){
        return "/WEB-INF/pages/index.html";
    }



}
