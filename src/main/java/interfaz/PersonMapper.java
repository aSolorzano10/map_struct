package interfaz;

import dbo.PersonDbo;
import dto.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANTCE = Mappers.getMapper(PersonMapper.class);

    PersonDto dboToDto(PersonDbo personDbo);
}
