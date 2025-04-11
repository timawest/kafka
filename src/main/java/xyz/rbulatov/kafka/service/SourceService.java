package xyz.rbulatov.kafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.rbulatov.kafka.dto.SourceDto;
import xyz.rbulatov.kafka.mapper.SourceMapper;
import xyz.rbulatov.kafka.model.Source;
import xyz.rbulatov.kafka.repository.SourceRepository;

@Service
@RequiredArgsConstructor
public class SourceService {
    private final SourceRepository sourceRepository;

    public Source save(SourceDto dto){
        Source sourceModel = SourceMapper.dtoToModel(dto);
        return sourceRepository.save(sourceModel);
    }
}
