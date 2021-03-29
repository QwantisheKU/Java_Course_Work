package course_work.carsharing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Rules {

    @RequestMapping(value = {"/rules"})
    public String rules(){
        return "rules";
    }

}
