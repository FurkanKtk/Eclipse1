package business.concretes;

import business.abstracts.BasePlayersManager;
import business.abstracts.IPlayersCheckService;

import entities.Players;

public class PlayersManager extends BasePlayersManager {

	IPlayersCheckService _playersCheckService;

	public PlayersManager(IPlayersCheckService playersCheckService) {
		_playersCheckService = playersCheckService;
	}

	@Override
	public void add(Players players) {
		if (_playersCheckService.CheckIfRealPerson(players)) {
			super.add(players);
		} else {
			System.out.println("ki�i bulunamad�.");

		}
	}

	@Override
	public void update(Players players) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Players players) {
		// TODO Auto-generated method stub

	}

}
