package com.malcolmdeck.projecteuler.util;

import java.util.HashSet;
import java.util.Set;

public class PrimeFinder {

    private Set<Long> primes;
    private Long maxChecked;

    public PrimeFinder() {
        primes = new HashSet<>();
        primes.add(2l);
        maxChecked = 2l;

    }

    public boolean isPrime(Long i) {
        findPrimesUpTo(i);
        return primes.contains(i);
    }

    /**
     * This is incredibly slow. Perhaps try a Sieve of Eratosthenes[1] instead of checking each independently.
     * Note that this may require batching into smaller groups depending on how big the gap between
     * `maxChecked` and `i` is.
     *
     * [1] https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     */
    private void findPrimesUpTo(Long i) {
        while (maxChecked < i) {
            maxChecked++;
            boolean isPrime = true;
            for (Long prime : primes) {
                if (maxChecked % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(maxChecked);
            }
        }
        return;
    }
}
