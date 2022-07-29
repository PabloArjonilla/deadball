package es.pmac.deadball.infrastructure.drivers.api.player.mapper.response;

import es.pmac.deadball.domain.player.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerAPIResponseMapper {

    PlayerAPIResponseMapper INSTANCE = Mappers.getMapper(PlayerAPIResponseMapper.class);

    @Mappings({
            @Mapping(target = "uuid", source = "uuid.value"),
            @Mapping(target = "name", source = "name"),
    })
    PlayerAPIResponse requestToModel(Player source);

}