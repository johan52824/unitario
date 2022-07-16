package facci.erick.mera.pruebasunitariasmera;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    public static final String correo1="erick@gmail.com";
    public static final String contraseña="";
    public static final String correo2="erickgmail.com";
    public static final String contraseña="erick";
    public static final String correo3="";
    public static final String contraseña="mera";

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void primera(){
        onView(withId(R.id.email)).perform(typeText(correo1),closeSoftKeyboard());
        onView(withId(R.id.contra)).perform(typeText(contraseña1),closeSoftKeyboard());
        onView(withId(R.id.bntEnviar)).perform(click());
    }


    @Test
    public void segundo(){
        onView(withId(R.id.email)).perform(typeText(correo2),closeSoftKeyboard());
        onView(withId(R.id.contra)).perform(typeText(contraseña2),closeSoftKeyboard());
        onView(withId(R.id.bntEnviar)).perform(click());
    }


    @Test
    public void tercero(){
        onView(withId(R.id.email)).perform(typeText(correo3),closeSoftKeyboard());
        onView(withId(R.id.contra)).perform(typeText(contraseña3),closeSoftKeyboard());
        onView(withId(R.id.bntEnviar)).perform(click());
    }
}
