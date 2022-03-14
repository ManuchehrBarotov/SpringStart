package ru.manu.webSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	private  Classical music;
	private RockMusic rock;
	
	@Autowired
	public MusicPlayer(Classical music,RockMusic rock) {
		this.rock=rock;
		this.music = music;
	}
	
	public String playMusic() {
		return "now =="+music.getSong()+"-||-"+"next->"+rock.getSong();
	}
	
	
	public void setMusic(Classical music,RockMusic rock) {
		this.music=music;
		this.rock=rock;
	}

}
