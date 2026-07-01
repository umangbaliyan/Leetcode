# 442. Find All Duplicates in an Array

## Problem
Given an integer array `nums` of length `n` where all the integers are in the range `[1, n]` and each integer appears **once or twice**, return an array of all the integers that appear **twice**.

You must solve it in **O(n)** time and use only **constant extra space** (excluding the output array).

---

## Example 1

**Input**
```text
nums = [4,3,2,7,8,2,3,1]
```

**Output**
```text
[2,3]
```

---

## Example 2

**Input**
```text
nums = [1,1,2]
```

**Output**
```text
[1]
```

---

## Example 3

**Input**
```text
nums = [1]
```

**Output**
```text
[]
```

---

## Constraints

- `n == nums.length`
- `1 <= n <= 10^5`
- `1 <= nums[i] <= n`
- Each element appears **once or twice**.

---

# Brute Force Approach

### Idea
For every element, count how many times it appears by traversing the entire array.

### Algorithm
- Pick one element.
- Count its frequency.
- If frequency is `2`, add it to the answer (avoid duplicates).

### Time Complexity
- **O(n²)**

### Space Complexity
- **O(1)**

---

# Better Approach (HashMap / HashSet)

### Idea
Store the frequency of every number.

### Algorithm
1. Traverse the array.
2. Store frequencies in a HashMap.
3. Traverse the map.
4. Add keys whose frequency is `2`.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(n)**

---

# Optimal Approach (Negative Marking)

## Intuition

Since every number lies in the range **1 to n**, each value can be used as an **index**.

For every number:

- Find its corresponding index.
- If the value at that index is already negative, we've seen this number before.
- Otherwise, make that value negative to mark it as visited.

This lets us detect duplicates without using extra space.

---

## Algorithm

1. Create an empty answer list.
2. Traverse the array.
3. Compute:
   - `index = abs(nums[i]) - 1`
4. If `nums[index] < 0`
   - Add `abs(nums[i])` to the answer.
5. Otherwise
   - Make `nums[index]` negative.

---

## Dry Run

### Input

```text
[4,3,2,7,8,2,3,1]
```

| Number | Index | Action | Answer |
|--------|-------|--------|--------|
|4|3|Mark negative|[]|
|3|2|Mark negative|[]|
|2|1|Mark negative|[]|
|7|6|Mark negative|[]|
|8|7|Mark negative|[]|
|2|1 already negative|Duplicate|[2]|
|3|2 already negative|Duplicate|[2,3]|
|1|0|Mark negative|[2,3]|

Final Answer:

```text
[2,3]
```

---

# Java Solution

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return ans;
    }
}
```

---

# Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)` (excluding the output list)

---

# Key Concept

The constraint `1 <= nums[i] <= n` allows every value to act as an index.

We use the sign of each indexed element as a **visited marker**:

- **Positive → First occurrence**
- **Negative → Duplicate found**

This achieves the required **O(n)** time and **constant auxiliary space**.