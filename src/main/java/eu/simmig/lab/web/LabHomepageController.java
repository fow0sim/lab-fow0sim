package eu.simmig.lab.web;

import eu.simmig.lab.service.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabHomepageController {

    @Autowired
    EnvironmentService environmentService;

    @RequestMapping(value = "/")
    public String indexPage(Model model) {
        return "index";
    }

    @RequestMapping(value = "/impressum")
    public String impressumPage(Model model) {
        return "impressum";
    }

    @RequestMapping("/environment")
    public String environmentPage(Model model) {
        model.addAttribute("environment", environmentService.getEnvironment());
        return "environment";
    }

}
