package search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String search(@RequestParam(name="book", required=true) String book, @RequestParam(value="website", required = true) String website, Model model){
        model.addAttribute("name", book);
        model.addAttribute("value", website);
        return "search";
    }
}
