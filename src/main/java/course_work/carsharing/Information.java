package course_work.carsharing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Information {

    @RequestMapping(value = {"/", "/information"})
    public String info(){
        return "index";
    }

}
