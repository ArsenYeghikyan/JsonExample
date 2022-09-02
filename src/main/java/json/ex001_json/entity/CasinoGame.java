package json.ex001_json.entity;

import java.util.ArrayList;
import java.util.List;

public class CasinoGame {

    private String url = "https://bet-boom.com/en/game/635/";

    private String name = "100 Joker Staxx";
    private String type = "VideoGame";
    private List<String> genre;
    private String image = "/r/256x-/static/uploads/images/4d27da12-4143-4454-aa07-c21f96029bf6.jpg?q=100";

    private Author author;
    private String context = "http://schema.org";
    private String cheatCode = "Get free spins and bonus for registration. Real money, play online now.";
    private String publisher = "Bet-boom.com";

    private List<String> inLanguage ;

    private List<String> translator;

    private String description = "100 Joker Staxx - real money online casino game for free (demo).";

    public CasinoGame() {
    }

    public CasinoGame(String url, String name, String type, List<String> genre, String image, Author author, String context, String cheatCode, String publisher, List<String> inLanguage, List<String> translator, String description) {
        this.url = url;
        this.name = name;
        this.type = type;
        this.genre = genre;
        this.image = image;
        this.author = author;
        this.context = context;
        this.cheatCode = cheatCode;
        this.publisher = publisher;
        this.inLanguage = inLanguage;
        this.translator = translator;
        this.description = description;
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

    public List<String> getGenre() {
        return genre;
    }

    public String getImage() {
        return image;
    }

    public Author getAuthor() {
        return author;
    }

    public String getContext() {
        return context;
    }

    public String getCheatCode() {
        return cheatCode;
    }

    public String getPublisher() {
        return publisher;
    }

    public List<String> getInLanguage() {
        return inLanguage;
    }

    public List<String> getTranslator() {
        return translator;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CasinoGame{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", genre=" + genre +
                ", image='" + image + '\'' +
                ", author=" + author +
                ", context='" + context + '\'' +
                ", cheatCode='" + cheatCode + '\'' +
                ", publisher='" + publisher + '\'' +
                ", inLanguage=" + inLanguage +
                ", translator=" + translator +
                ", description='" + description + '\'' +
                '}';
    }
}
