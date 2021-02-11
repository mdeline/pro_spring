package fi.mdeline.darksoulswiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("*")
    @ResponseBody
    public String home() {
        return "<h1>Dark Souls Wiki</h1>";
    }

    @GetMapping("/development")
    public String development() {
        return "dev_concepts";
    }
}
