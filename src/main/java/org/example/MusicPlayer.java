package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList=new ArrayList<>();

    private  String name;
    private  int  volume;

    public MusicPlayer() { }

    //IoC
/*    public MusicPlayer(Music music) {
        this.music = music;
    }*/

    public void playMusic(){
        for(Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
