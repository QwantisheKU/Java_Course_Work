package course_work.carsharing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Contacts {

    @RequestMapping(value = {"/contacts"})
    public String contacts(){
        return "contacts";
    }

}
