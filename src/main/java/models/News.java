package models;

public class News {

    private String title;
    private  String content;
    private int id;

    public News (String title, String content){
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }

}
