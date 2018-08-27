package fi.academy.climateswipe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Tasks {
    @Id
    @GeneratedValue
    private int id;

    private String title;
    @Lob
    private String content1;
    @Lob
    private String content2;
    private byte img;
    private String rating;

    public Tasks() {
    }

    public Tasks(int id, String title, String content1, String content2, byte img, String rating) {
        this.id = id;
        this.title = title;
        this.content1 = content1;
        this.content2 = content2;
        this.img = img;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public byte getImg() {
        return img;
    }

    public void setImg(byte img) {
        this.img = img;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
