package smpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "owners/index"})
    public String listsOwners() {
        return "owners/index";
    }
}
