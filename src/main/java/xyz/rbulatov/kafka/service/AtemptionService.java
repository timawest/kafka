package xyz.rbulatov.kafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.rbulatov.kafka.model.Atemption;
import xyz.rbulatov.kafka.repository.AtemptionRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AtemptionService {
    private final AtemptionRepository atemptionRepository;

    public Atemption startAtemption(){
        Atemption atemption = new Atemption();
        atemption.setStart(LocalDateTime.now());
        atemption.setDescription("Kafka");
        return atemptionRepository.save(atemption);
    }

    public Atemption finishAtemption(Atemption atemption){
        atemption.setFinish(LocalDateTime.now());
        return atemptionRepository.save(atemption);
    }
}
