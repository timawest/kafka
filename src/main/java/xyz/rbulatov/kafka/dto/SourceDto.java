package xyz.rbulatov.kafka.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SourceDto {
    @JsonProperty(value = "firstName")
    private String firstName;
    @JsonProperty(value = "lastName")
    private String lastName;
    @JsonProperty(value = "middleName")
    private String middleName;
    @JsonProperty(value = "systemDateTime")
    private LocalDateTime systemDateTime;
}
