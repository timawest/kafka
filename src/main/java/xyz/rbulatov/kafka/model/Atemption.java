package xyz.rbulatov.kafka.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "atemption")
public class Atemption {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDateTime start;
    private LocalDateTime finish;
    private String description;
}
