package starter.navigation;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegateTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the home page",
                Open.browserOn().the(OpenPage.class));
    }
}