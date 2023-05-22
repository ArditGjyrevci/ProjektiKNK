package service;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageUtil {
    private static ResourceBundle bundle;
    private static Locale currentLocale;

    public static void setLanguage(String language) {
        if (language.equalsIgnoreCase("Shqip")) {
            currentLocale = new Locale("sq");
        } else {
            currentLocale = new Locale("en");
        }
        bundle = ResourceBundle.getBundle("translations.messages", currentLocale);
    }

    public static String getMessage(String key) {
        return bundle.getString(key);
    }
}
