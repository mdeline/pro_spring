package fi.mdeline.darksoulswiki;

import fi.mdeline.darksoulswiki.model.Boss;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AldrichController {
    private List<String> victims;

    public AldrichController() {
        this.victims = new ArrayList<>();
        this.victims.add("Gwyndolin");
        this.victims.add("Priscilla");
    }

    @GetMapping(value = "/aldrich")
    public String aldrich(Model model) {
        model.addAttribute("victims", victims);
        model.addAttribute("Aldrich", new Boss("Aldrich", 4727, "Anor Londo"));
        return "aldrich";
    }

}
