# Missing Number

## Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

---

## Example 1

**Input:**
```text
nums = [3,0,1]
```

**Output:**
```text
2
```

**Explanation:**
```text
n = 3, so the numbers should be in the range [0,3].
The numbers present are 0, 1, and 3.
Therefore, the missing number is 2.
```

---

## Example 2

**Input:**
```text
nums = [0,1]
```

**Output:**
```text
2
```

**Explanation:**
```text
n = 2, so the numbers should be in the range [0,2].
The numbers present are 0 and 1.
Therefore, the missing number is 2.
```

---

## Example 3

**Input:**
```text
nums = [9,6,4,2,3,5,7,0,1]
```

**Output:**
```text
8
```

**Explanation:**
```text
n = 9, so the numbers should be in the range [0,9].
The only missing number is 8.
```

---

## Constraints

```text
1 <= n <= 10^4
n == nums.length
0 <= nums[i] <= n
All the numbers of nums are unique.
```