package validators;

import model.*;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class FormValidator implements Validator{

    UserDAO ud= UserDAO.getInstance();


    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }



    public void validate(Object o,Errors errors) {


    }


}
