package models;

public class News {

    private String title;
    private  String content;
    private  int id;

    public News (String titlei, String content){
        this.title=title;
        this.content=content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }
}
