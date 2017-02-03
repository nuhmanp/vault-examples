package daggerok.vault.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class IndexPage {

    @GetMapping({
            "",
            "/404", })
    public String redirect() {
        return "redirect:/";
    }

    @GetMapping("/")
    public String index(@PathVariable final Optional<Long> projectId) {
        return "/index.html";
    }
}
