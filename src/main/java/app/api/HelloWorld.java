package app.api;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@RestController
@RequiredArgsConstructor
class HelloWorld {

    private final RedisTemplate redisTemplate;

    @RequestMapping("/")
    public String index() throws UnknownHostException {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.increment("counter", 1L);

        return "Greetings from Spring Boot Server: " + Inet4Address.getLocalHost().getHostName()
            + "! You are a visitor no. " + valueOperations.get("counter");
    }
}
