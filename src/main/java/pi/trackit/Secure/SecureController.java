package pi.trackit.Secure;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SecureController {

    @PostMapping(value = "secure")
    public String welcome()
    {
        return "Welcome form secure endpoint";
    }
    
}
