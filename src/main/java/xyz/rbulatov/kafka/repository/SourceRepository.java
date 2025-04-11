package xyz.rbulatov.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.rbulatov.kafka.model.Source;

@Repository
public interface SourceRepository extends JpaRepository<Source, Long> {
}
