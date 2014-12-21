package mr.manager.ray.sampling;

public class Sample {

    final int numSamples;
    final float totalSum;

    public Sample(float firstSample) {
        numSamples = 1;
        totalSum = firstSample;
    }

    private Sample(float totalSum, int numSamples) {
        this.totalSum = totalSum;
        this.numSamples = numSamples;
    }

    public Sample addSample(float sample) {
        return new Sample(totalSum + sample, numSamples + 1);
    }

    public float getResult() {
        return totalSum / (float) numSamples;
    }
}
