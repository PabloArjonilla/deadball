package es.pmac.deadball.infrastructure.drivers.api.player.mapper.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PlayerAPIResponse {
    //TODO No usado por el controller, devuelve objeto de dominio
    private String id;
    private String name;
    private String team;
}
