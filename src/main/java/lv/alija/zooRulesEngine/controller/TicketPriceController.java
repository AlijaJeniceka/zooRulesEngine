package lv.alija.zooRulesEngine.controller;

import lv.alija.zooRulesEngine.model.Visitor;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketPriceController {

    @Autowired
    private KieSession kieSession;

    @PostMapping("/visitor")
    public Visitor visitorNow(@RequestBody Visitor visitor){
        kieSession.insert(visitor);
        kieSession.fireAllRules();
        return visitor;
    }
}
