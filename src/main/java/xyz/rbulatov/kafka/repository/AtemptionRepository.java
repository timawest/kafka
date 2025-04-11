package xyz.rbulatov.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.rbulatov.kafka.model.Atemption;

import java.util.UUID;

@Repository
public interface AtemptionRepository extends JpaRepository<Atemption, UUID> {
}
