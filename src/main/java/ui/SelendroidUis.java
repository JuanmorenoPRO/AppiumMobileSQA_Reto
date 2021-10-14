package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelendroidUis {
    public static final Target ANDROID_TEXT= Target.the("").located(By.id("android:id/text1"));
    public static final Target SING_UP_BTN = Target.the("").located(By.id("io.selendroid.testapp:id/startUserRegistration"));
    public static final Target USERNAME_FIELD= Target.the("").located(By.id("io.selendroid.testapp:id/inputUsername"));
    public static final Target EMAIL_FIELD = Target.the("").located(By.id("io.selendroid.testapp:id/inputEmail"));
    public static final Target PASSWORD_FIELD= Target.the("").located(By.id("io.selendroid.testapp:id/inputPassword"));
    public static final Target NAME_FIELD= Target.the("").located(By.id("io.selendroid.testapp:id/inputName"));
    public static final Target PROGRAMMING_SELECT = Target.the("").located(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
    public static final Target PROGRAMMING_OPTION = Target.the("").locatedBy(
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[6]");
    public static final Target ACCEPT_CHX = Target.the("").located(By.id("io.selendroid.testapp:id/input_adds"));
    public static final Target REGISTER_BTN = Target.the("").located(By.id("io.selendroid.testapp:id/btnRegisterUser"));
    public static final Target VERIFY_USER = Target.the("").locatedBy(
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.TextView");
}
