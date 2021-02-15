package fi.mdeline.darksoulswiki;

import fi.mdeline.darksoulswiki.model.Boss;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BossController {
    private List<Boss> bossList;

    public BossController() {
        this.bossList = new ArrayList<>();
        this.bossList.add(new Boss("Curse-Rotted Greatwood", 5405, "Undead Settlement"));
        this.bossList.add(new Boss("Crystal Sage", 2723, "Road of Sacrifices"));
        this.bossList.add(new Boss("Abyss Watchers", 1548, "Farron Keep"));
    }

    @GetMapping("/bosses")
    public String home(Model model) {
        model.addAttribute("bossList", bossList);
        return "bosses";
    }
}
