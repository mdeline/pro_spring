package fi.mdeline.darksoulswiki;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private String content = "plz help me";

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("content", content);
        return "home";
    }

    @PostMapping("/")
    public String post(@RequestParam String content) {
        this.content = content;
        return "redirect:/";
    }

    @GetMapping("/development")
    public String development() {
        return "dev_concepts";
    }

}
