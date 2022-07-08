package controller;

import application.ShieldService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StageController {
    private final ShieldService shieldService;

    public StageController(ShieldService shieldService) {
        this.shieldService = shieldService;
    }

    @PostMapping("stage1")
    public String stage1(@RequestBody String body) {
        String output = shieldService.transform(body);

        return output;
    }

    @PostMapping("stage/result")
    public void result(@RequestBody String body) {
        System.out.println("*".repeat(80));
        System.out.println("Result: " + body);
    }

}
