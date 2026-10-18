package se.iths.katharina.typingtestapp.data;

import org.yaml.snakeyaml.Yaml;
import se.iths.katharina.typingtestapp.model.TypingText;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TypingTextCatalog {
    private final List<TypingText> texts;

    public TypingTextCatalog() {
        this.texts = loadTextsFromYaml();
    }

    public List<TypingText> loadTextsFromYaml() {
        try (InputStream inputStream = TypingTextCatalog.class.getResourceAsStream("/typing-texts.yaml")) {
            if (inputStream == null) {
                throw new IllegalStateException("Filen 'typing-texts.yaml' kunde inte hittas.");
            }

            Yaml yaml = new Yaml();
            Object data = yaml.load(inputStream);

            List<TypingText> loadedTexts = new ArrayList<>();

            if (data instanceof List<?> entries) {
                for (Object entry : entries) {
                    if (entry instanceof Map<?, ?> textData) {
                        Object titleValue = textData.get("title");
                        Object difficultyValue = textData.get("difficulty");
                        Object textValue = textData.get("text");
                        if (titleValue instanceof String title
                                && difficultyValue instanceof String difficulty
                                && textValue instanceof String text) {
                            TypingText typingText = new TypingText(title, difficulty, text);
                            loadedTexts.add(typingText);
                        } else {
                            throw new IllegalStateException("En skrivtext i Yaml-filen saknar giltig titel, svårighetsgrad eller text.");
                        }
                    } else {
                        throw new IllegalStateException("En post i Yaml-filen har felaktig struktur.");

                    }
                }
            } else {
                throw new IllegalStateException("Filen 'typing-texts.yaml' kunde inte bearbetas.");
            }
            return loadedTexts;
        } catch (IOException e) {
            throw new IllegalStateException("Ett I/O-fel uppstod vid hantering av Yaml-filen.", e);
        }
    }

    public TypingText findTextByDifficulty(String selectedDifficulty) {
        List<TypingText> matchingTexts = new ArrayList<>();
        for (TypingText typingText : texts) {
            if (selectedDifficulty.equals(typingText.getDifficulty())) {
                matchingTexts.add(typingText);
            }
        }
        if (matchingTexts.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(matchingTexts.size());
        TypingText selectedText = matchingTexts.get(randomIndex);
        return selectedText;
    }

}