package ru.manu.webSpring;

import org.springframework.stereotype.Component;

@Component
public class Comp {
	private int id;
	private MusicPlayer player;
	
	
	public Comp(MusicPlayer player) {
		id=1;
		this.player = player;
	}


	@Override
	public String toString() {
		return "Comp [id=" + id + ", player=" + player.playMusic() + "]";
	}

}
