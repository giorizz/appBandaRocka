package br.com.rockarolla.model;

public class Musics {

    private String groupName;
    private String musicName;

    public Musics(String groupName, String musicName) {
        this.groupName = groupName;
        this.musicName = musicName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }
}
