import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class TextTranslator {

    public static void main(String[] args) {
        String textToTranslate = "Hello, world!";
        String targetLanguageCode = "es"; // target language code, e.g. "es" for Spanish

        Translate translate = TranslateOptions.getDefaultInstance().getService();

        Translation translation = translate.translate(textToTranslate, Translate.TranslateOption.targetLanguage(targetLanguageCode));

        System.out.println("Original text: " + textToTranslate);
        System.out.println("Translated text: " + translation.getTranslatedText());
    }
}
