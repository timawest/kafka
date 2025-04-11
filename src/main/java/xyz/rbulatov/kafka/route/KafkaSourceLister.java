package xyz.rbulatov.kafka.route;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import xyz.rbulatov.kafka.dto.SourceDto;
import xyz.rbulatov.kafka.model.Atemption;
import xyz.rbulatov.kafka.property.KafkaProperty;
import xyz.rbulatov.kafka.service.AtemptionService;
import xyz.rbulatov.kafka.service.SourceService;

@Component
@Slf4j
public class KafkaSourceLister extends RouteBuilder {
    private final ObjectMapper objectMapper;
    private final SourceService service;
    private final AtemptionService atemptionService;
    private final String mainRoute;

    public KafkaSourceLister(KafkaProperty kafkaProperty, ObjectMapper objectMapper, SourceService service, AtemptionService atemptionService) {
        this.objectMapper = objectMapper;
        this.service = service;
        this.atemptionService = atemptionService;
        this.mainRoute = "kafka:" + kafkaProperty.getTopicName() +
                "?brokers=" + kafkaProperty.getServers() +
                "&groupId=" + kafkaProperty.getGroupId();
    }

    @Override
    public void configure() throws Exception {
        from(mainRoute)
                .routeId("KafkaSource")
                .process(exchange -> log.info(exchange.getIn().getBody(String.class)))
                .process(exchange -> {
                    Atemption atemption = atemptionService.startAtemption();
                    SourceDto user = objectMapper.readValue(exchange.getIn().getBody(String.class), SourceDto.class);
                    service.save(user);
                    atemptionService.finishAtemption(atemption);
                })
                .end();
    }
}
