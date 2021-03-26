package fr.esiea.ex4A;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class ApiController {

    private final LoveService loveService;

    public ApiController(LoveService loveService) {
        this.loveService = loveService;
    }


    @PostMapping("/api/inscription")
    void inscription(@RequestBody UserInfo userInfo) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2L);
        System.out.println(userInfo);
    }

    @GetMapping("/api/matches")
    List<RandomGuy> matches() {
        return List.of(
            new RandomGuy("david", "david"),
            new RandomGuy("emma","emma")
        );
    }
}
