public class Articles {

    private int id;
    private int author_id;
    private String title;
    private String content ;

    public Articles(int id, int author_id, String title, String content) {
        this.id = id;
        this.author_id = author_id;
        this.title = title;
        this.content = content;
    }
}
