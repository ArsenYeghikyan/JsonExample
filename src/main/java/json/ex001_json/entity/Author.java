package json.ex001_json.entity;

public class Author {

    private String url = "https://playson.com/";
    private String name = "Playson";
    private String type = "Organization";


    public Author() {
    }

    public Author(String url, String name, String type) {
        this.url = url;
        this.name = name;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Author{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
