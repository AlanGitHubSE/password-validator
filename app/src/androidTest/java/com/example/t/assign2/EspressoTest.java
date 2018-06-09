package com.example.t.assign2;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void CheckExistInput(){
        Espresso.onView(withId(R.id.password_Field)).check(matches(isDisplayed()));
    }

    @Test
    public void CheckExistButton(){
        Espresso.onView(withId(R.id.validate_Button)).check(matches(isDisplayed()));
    }

    @Test
    public void CheckExistTextField(){
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(isDisplayed()));
    }

    @Test
    public void InputPassword_TooWeak1() {
        Espresso.onView(withId(R.id.password_Field)).perform(typeText("password"));
        Espresso.onView(withId(R.id.validate_Button)).perform(click());
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(withText("Too Weak")));
    }

    @Test
    public void InputPassword_TooWeak2() {
        Espresso.onView(withId(R.id.password_Field)).perform(typeText(""));
        Espresso.onView(withId(R.id.validate_Button)).perform(click());
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(withText("Too Weak")));
    }

    @Test
    public void InputPassword_Weak1() {
        Espresso.onView(withId(R.id.password_Field)).perform(typeText("abcdefgh"));
        Espresso.onView(withId(R.id.validate_Button)).perform(click());
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(withText("Weak")));
    }


    @Test
    public void InputPassword_Weak2() {
        Espresso.onView(withId(R.id.password_Field)).perform(typeText("8"));
        Espresso.onView(withId(R.id.validate_Button)).perform(click());
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(withText("Weak")));
    }

    @Test
    public void InputPassword_Middle() {
        Espresso.onView(withId(R.id.password_Field)).perform(typeText("abcdefg8"));
        Espresso.onView(withId(R.id.validate_Button)).perform(click());
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(withText("Middle")));
    }

    @Test
    public void InputPassword_Strong() {
        Espresso.onView(withId(R.id.password_Field)).perform(typeText("strong!1."));
        Espresso.onView(withId(R.id.validate_Button)).perform(click());
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(withText("Strong")));
    }

    @Test
    public void InputPassword_Very_Strong1() {
        Espresso.onView(withId(R.id.password_Field)).perform(typeText("V.Strong!1."));
        Espresso.onView(withId(R.id.validate_Button)).perform(click());
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(withText("Very Strong")));
    }

    @Test
    public void InputPassword_Very_Strong2() {
        Espresso.onView(withId(R.id.password_Field)).perform(typeText("StrongPassword1!"));
        Espresso.onView(withId(R.id.validate_Button)).perform(click());
        Espresso.onView(withId(R.id.strength_Indicator)).check(matches(withText("Very Strong")));
    }
}
