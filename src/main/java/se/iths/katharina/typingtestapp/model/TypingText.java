package se.iths.katharina.typingtestapp.model;

public class TypingText {
    private final String title;
    private final String difficulty;
    private final String text;

    public TypingText(String title, String difficulty, String text) {
        this.title = title;
        this.difficulty = difficulty;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getText() {
        return text;
    }
}
