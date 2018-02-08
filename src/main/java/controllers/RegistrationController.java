package controllers;

import model.repositories.UserRepository;
import model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/register")
public class RegistrationController extends HttpServlet {
    @Autowired
    private UserRepository ur;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String phone=req.getParameter("phone");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        User user;
        try {
            user = ur.findUsersByEmailAndPassword(email,pass);
        }catch (NullPointerException e){
            user=null;
        }
        if (user == null) {
            ur.saveAndFlush(new User(name,phone, email, pass));
            RequestDispatcher rd = req.getRequestDispatcher("/");
            resp.setStatus(200); //HTTP OK-status
            rd.forward(req, resp);
        }
    }
}
