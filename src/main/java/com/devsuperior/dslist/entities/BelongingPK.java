package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Embeddable  //  2 atributos em um
public class BelongingPK {

	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;

	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList list;

	public BelongingPK(){
	}

	public BelongingPK(Game game, GameList list) {
		this.game = game;
		this.list = list;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		/*int hash = 7;
		hash = 17 * hash + Objects.hashCode(this.game);
		hash = 17 * hash + Objects.hashCode(this.list);
		return hash;*/
		return Objects.hash(game, list); //diferente na aula
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final BelongingPK other = (BelongingPK) obj;
		if (!Objects.equals(this.game, other.game)) {
			return false;
		}
		return Objects.equals(this.list, other.list);
	}






}
