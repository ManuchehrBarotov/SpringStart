package ru.manu.webSpring;

public class MusicSet {
	private Music music;
	private String name;
	private int volum;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolum() {
		return volum;
	}

	public void setVolum(int volum) {
		this.volum = volum;
	}

	public MusicSet() {
		
	}

	public MusicSet(Music music) {
		
		this.music = music;
	}
	
	public void setMusic(Music music) {
		this.music=music;
	}
	
	
	public String getMusic() {
		return music.getSong();
	}

}
