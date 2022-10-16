package com.malcolmdeck.projecteuler;

import com.malcolmdeck.projecteuler.util.PrimeFinder;

public class Problem3 {

    private static final boolean DEBUG = true;
    private static final int frequency = 10000;

    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     *
     * What is the largest prime factor of the number 600851475143 ?
     *
     * TODO: this runs quite slowly right now (23451ms). Need to speed up prime finding.
     */
    public static Long largestPrimeFactor() {
        long composite = 600851475143l;
        Long maxPrime = 0l;
        PrimeFinder primeFinder = new PrimeFinder();
        for (Long i = 2l; i*i < composite; ++i) {
            if (DEBUG &&
                    i % frequency == 0) {
                System.out.println("Up to: " + i + ". Max prime found so far is: " + maxPrime);
            }
            if (composite % i == 0 &&
                    primeFinder.isPrime(i)) {
                maxPrime = i;
            }
        }
        return maxPrime;
    }

}
