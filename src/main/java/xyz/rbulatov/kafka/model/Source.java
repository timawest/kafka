package xyz.rbulatov.kafka.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "source")
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createDate;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDateTime systemDateTime;
}
