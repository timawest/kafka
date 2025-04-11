package xyz.rbulatov.kafka.mapper;

import xyz.rbulatov.kafka.dto.SourceDto;
import xyz.rbulatov.kafka.model.Source;

import java.time.LocalDateTime;

public class SourceMapper {
    public static Source dtoToModel(SourceDto dto){
        Source source = new Source();
        source.setFirstName(dto.getFirstName());
        source.setCreateDate(LocalDateTime.now());
        source.setLastName(dto.getLastName());
        source.setMiddleName(dto.getMiddleName());
        source.setSystemDateTime(dto.getSystemDateTime());
        return source;
    }
}
