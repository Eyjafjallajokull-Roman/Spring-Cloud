package epam.com.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallMethod")
    public String userServiceFallBackMethod() {
        return "User service takes to long";
    }

    @GetMapping("/roomServiceFallMethod")
    public String roomServiceFallBackMethod() {
        return "Room service takes to long";
    }
}
