package com.epam.algorithms;

import com.epam.algorithms.utils.Complexity;

/**
 * Tasks for assessing the algorithm complexity. The following are the ratios of the constants with the BigO estimate:
 * <p>
 * Complexity.O_LOG_N       -> O(log N) Complexity.O_N_2         -> O(log N^2) Complexity.O_FACTORIAL_N -> O(!N)
 * Complexity.O_2_N         -> O(2 * N) Complexity.O_N_LOG_N     -> O(N * log N) Complexity.O_1           -> O(1)
 * Complexity.O_N           -> O(N)
 */
public class AlgorithmComplexity {

    /**
     * Return the linear search complexity if the element you are looking for is at the end of the array.
     */
    public Complexity  badLinerSearch() {
        // If the target element is at the end of the array,
        // we need to iterate through the entire array of length N.
        // Therefore, the complexity is O(N).
        return Complexity.O_N;
    }

    /**
     * Return the complexity of accessing an array element by index.
     */
    public Complexity arrayIndexItemAccess() {
        // Accessing an array element by index has a constant time complexity of O(1),
        // regardless of the size of the array.
        return Complexity.O_1;
    }

    /**
     * Return the complexity of a binary search.
     */
    public Complexity binarySorting() {
        // Binary search has a logarithmic time complexity of O(log N),
        // where N is the length of the array.
        return Complexity.O_LOG_N;
    }

    /**
     * Return the complexity of the Two Cycle Sorting algorithm.
     */
    public Complexity twoCycleSorting() {
        // Two Cycle Sorting has a worst case time complexity of O(N^2).
        // This is because in the worst case, we might need to perform N iterations
        // of the outer loop and potentially N-1 iterations of the inner loop for each outer iteration.
        // Therefore, the total number of operations is proportional to N^2.
        return Complexity.O_N_2;
    }

}
