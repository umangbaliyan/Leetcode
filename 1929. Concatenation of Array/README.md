# 1929. Concatenation of Array

## Problem Statement
Given an integer array `nums` of length `n`, create an array `ans` of length `2n` such that:

- `ans[i] = nums[i]`
- `ans[i + n] = nums[i]`

for `0 <= i < n`.

In simple terms, `ans` is formed by concatenating `nums` with itself.

Return the array `ans`.

---

## Example 1

### Input
```java
nums = [1,2,1]
```

### Output
```java
[1,2,1,1,2,1]
```

### Explanation
```java
ans = [nums[0], nums[1], nums[2], nums[0], nums[1], nums[2]]
ans = [1,2,1,1,2,1]
```

---

## Example 2

### Input
```java
nums = [1,3,2,1]
```

### Output
```java
[1,3,2,1,1,3,2,1]
```

### Explanation
```java
ans = [nums[0], nums[1], nums[2], nums[3],
       nums[0], nums[1], nums[2], nums[3]]

ans = [1,3,2,1,1,3,2,1]
```

---

## Constraints

```java
n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
```

---

# Approach

1. Create a new array `ans` of size `2 * n`.
2. Traverse the original array.
3. Store each element at:
   - `ans[i]`
   - `ans[i + n]`
4. Return `ans`.

---

# Java Solution

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
```

---

## Time Complexity

```java
O(n)
```

We traverse the array once.

---

## Space Complexity

```java
O(n)
```

An additional array of size `2n` is used.