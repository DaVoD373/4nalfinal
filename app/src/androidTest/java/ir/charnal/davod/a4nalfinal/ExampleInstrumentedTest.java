package ir.charnal.davod.a4nalfinal;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented ic_most_sales, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under ic_most_sales.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("ir.charnal.davod.a4nalfinal", appContext.getPackageName());
    }
}
