package first.example.paliz.materialdesign.Part03.model;

public class Music {

    private String name , name_song ,time , link_img ,  favorite;

    public Music() {
    }

    public Music(String name, String name_song, String link_img) {
        this.name = name;
        this.name_song = name_song;
        this.link_img = link_img;
    }

    public Music(String name, String name_song, String time, String link_img, String favorite) {
        this.name = name;
        this.name_song = name_song;
        this.time = time;
        this.link_img = link_img;
        this.favorite = favorite;
    }

    public Music(String name_song, String name , String link_img, String time) {
        this.name = name;
        this.name_song = name_song;
        this.time = time;
        this.link_img = link_img;
    }

    public Music(String link_img) {
        this.link_img = link_img;
    }

    public Music(String name, String link_img) {
        this.name = name;
        this.link_img = link_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_song() {
        return name_song;
    }

    public void setName_song(String name_song) {
        this.name_song = name_song;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }
}
