package com.example.owner.passwordvalidator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.owner.passwordvalidator", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void passwordNotStrongTest() throws Exception {
        onView(withId(R.id.edit)).perform(replaceText(""));
        onView(withId(R.id.edit)).perform(typeText("password"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.strength)).check(matches(withText("Password not strong.")));
        //onView(withId(R.id.strength)).check(matches(withText("Password is strong.")));
    }

    @Test
    public void passwordStrongTest() throws Exception {
        onView(withId(R.id.edit)).perform(replaceText(""));
        onView(withId(R.id.edit)).perform(typeText("passwordP1?"));
        onView(withId(R.id.button)).perform(click());
        //onView(withId(R.id.strength)).check(matches(withText("Password not strong.")));
        onView(withId(R.id.strength)).check(matches(withText("Password is strong.")));
    }
}
