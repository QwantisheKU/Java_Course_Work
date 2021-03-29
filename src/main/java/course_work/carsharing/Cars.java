package course_work.carsharing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cars {

    @RequestMapping(value = {"/automobiles"})
    public String cars(){
        return "cars";
    }

}
