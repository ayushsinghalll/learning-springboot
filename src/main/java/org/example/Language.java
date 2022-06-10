package org.example;

import java.util.Properties;

public class Language {
    private Properties Language;

    public Properties getLanguage() {
        return Language;
    }

    public void setLanguage(Properties language) {
        Language = language;
    }

    @Override
    public String toString() {
        return "Language{" +
                "Language=" + Language +
                '}';
    }



}
