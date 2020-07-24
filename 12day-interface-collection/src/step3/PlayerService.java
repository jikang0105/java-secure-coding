package step3;

import step2.Youtube;
import step2.CDPlayer;
import step2.Player;

// Service : 비즈니스 로직 담당 객체
public class PlayerService {

	public void execute(Player player) {
		if(player instanceof CDPlayer) {
			((CDPlayer) player).insertCd();
		}
		player.play();
		
	}

}
