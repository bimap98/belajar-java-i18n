package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {

        var pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetikan \"{0}\" di pencarian.";
        var messageFormat = new MessageFormat(pattern);

        var format = messageFormat.format(new Object[]{
                "Eko", "Kurniawan"
        });

        System.out.println(format);

    }

    @Test
    void testMessageFormatBundle() {
        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
           "Eko", "Programmer Zaman Now"
        });

        System.out.println(format);
    }
}
