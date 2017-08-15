package controllers;


import model.Entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.Resource;




@Controller
@SessionAttributes(types = User.class)
public class PageController {

    private ModelAndView mw=new ModelAndView();

    @Resource(name = "viewResolver")
    InternalResourceViewResolver viewResolver;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getLoginPage(){
        User user=new User();

        mw.addObject("user",user);
        mw.setViewName("login");
        return mw;
    }
    @RequestMapping(value = "/registration.jsp",method = RequestMethod.GET)
    public ModelAndView getRegistrationPage(){
        User user=new User();
        mw.setViewName("registration");
        return mw;
    }


}
