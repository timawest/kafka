package xyz.rbulatov.kafka.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kafka")
@Data
public class KafkaProperty {
    String servers;
    String groupId;
    String autoOffsetReset;
    String topicName;
}
