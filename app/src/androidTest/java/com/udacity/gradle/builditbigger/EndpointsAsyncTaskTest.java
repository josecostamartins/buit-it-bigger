package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.test.InstrumentationTestRunner;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by josecostamartins on 3/5/17.
 */
public class EndpointsAsyncTaskTest {

    @Test
    public void jokeNotNullTest(){

        new EndpointsAsyncTask(InstrumentationRegistry.getContext(), new JokeCallback() {
            @Override
            public void jokeCallback(String result) {
                assertNotNull(result);
            }
        }).execute();
    }

}