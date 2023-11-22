package Model;
import java.util.Observable;

public class LanguageObservable extends Observable {
    public void setLanguage(String language) {
        setChanged();
        notifyObservers(language);
    }
}