package mr.manager.ray;


import mr.manager.ray.sampling.Sample;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SampleTest {

    @Test
    public void canary() {
        assertTrue(true);
    }

    @Test
    public void testAddSample() {
        float FIRST_SAMPLE = 1.0f, SECOND_SAMPLE = 0.5f, EXPECTED_RESULT = (FIRST_SAMPLE + SECOND_SAMPLE) / 2.0f;
        Sample sample = new Sample(FIRST_SAMPLE);
        Sample addedSample = sample.addSample(SECOND_SAMPLE);

        assertEquals(addedSample.getResult(), EXPECTED_RESULT, 0.01);

    }

    @Test
    public void testAddMultipleSamples() {
        final Random random = new Random();
        final int samples = random.nextInt(1000);

        Sample sample = new Sample(0.0f);
        float sum = 0.0f;
        for(int i = 0; i < samples; i ++) {
            float newSample = random.nextFloat() * 0.01f;
            sum += newSample;
            sample = sample.addSample(newSample);

        }
        sum /= (float) samples;

        assertEquals(sample.getResult(), sum, 0.1f);
    }

}
