package es.pmac.deadball.usecases.player;

import es.pmac.deadball.domain.entity.player.Player;
import es.pmac.deadball.domain.entity.player.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.jbosslog.JBossLog;

@JBossLog
@RequiredArgsConstructor
public class FindPlayerById {
    private final PlayerRepository playerRepository;

    public Player execute(String id) {
        return playerRepository.findById(id);
    }
}
