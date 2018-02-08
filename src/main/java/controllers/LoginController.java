package controllers;

import model.repositories.UserRepository;
import model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/login")
public class LoginController{
    private static LoginController instance;

    public static LoginController getInstance(){
        if(instance == null) instance =new LoginController();
        return instance;
    }

    @Autowired
    UserRepository ur;
    public void login(HttpServletRequest request, HttpServletResponse response){
        try{
            String  email=request.getParameter("email");
            String pass=request.getParameter("pass");
            User user=ur.findUsersByEmailAndPassword(email,pass);
            if(user!=null) response.setStatus(200);
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }






}




