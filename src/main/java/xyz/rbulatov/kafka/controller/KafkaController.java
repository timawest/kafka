package xyz.rbulatov.kafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.rbulatov.kafka.service.KafkaProducerService;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    @GetMapping("/send")
    public void sendMessage() {
        String message;
        for (int i = 0; i <= 10; i++) {
            message = "{\n" +
                    "  \"firstName\": \"John\",\n" +
                    "  \"lastName\": \"Doe\",\n" +
                    "  \"middleName\": \"Doe\",\n" +
                    "  \"systemDateTime\": \"" + LocalDateTime.now() + "\"\n" +
                    "  }";
            kafkaProducerService.sendMessage(message);
        }
    }
}
