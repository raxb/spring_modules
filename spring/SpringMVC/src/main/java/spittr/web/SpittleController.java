package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private final SpittleRepository repository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        repository = spittleRepository;
    }

    @GetMapping
    public String spittles(Model model) {
        model.addAttribute("spittleList", repository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }
}
