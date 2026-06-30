# 1295. Find Numbers with Even Number of Digits

## Problem Statement

Given an integer array `nums`, return the number of integers that contain an **even number of digits**.

---

## Examples

### Example 1

**Input:**
```text
nums = [12,345,2,6,7896]
```

**Output:**
```text
2
```

**Explanation:**

- `12` → 2 digits ✅
- `345` → 3 digits ❌
- `2` → 1 digit ❌
- `6` → 1 digit ❌
- `7896` → 4 digits ✅

So, the answer is **2**.

---

### Example 2

**Input:**
```text
nums = [555,901,482,1771]
```

**Output:**
```text
1
```

**Explanation:**

Only `1771` has an even number of digits.

---

## Constraints

- `1 <= nums.length <= 500`
- `1 <= nums[i] <= 10^5`

---

# Approach 1: Convert Number to String

### Idea

- Traverse each number in the array.
- Convert the number to a string.
- Check the length of the string.
- If the length is even, increment the count.

### Algorithm

1. Initialize `count = 0`.
2. Loop through every number in `nums`.
3. Convert the number to a string.
4. If `string.length() % 2 == 0`, increment `count`.
5. Return `count`.

---

## Dry Run

For:

```text
nums = [12,345,2,6,7896]
```

| Number | Digits | Even? | Count |
|--------|--------|-------|------|
| 12 | 2 | ✅ | 1 |
| 345 | 3 | ❌ | 1 |
| 2 | 1 | ❌ | 1 |
| 6 | 1 | ❌ | 1 |
| 7896 | 4 | ✅ | 2 |

Final Answer = **2**

---

## Java Solution

```java
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)` (ignoring temporary string creation)

---

# Approach 2: Count Digits Using Mathematics

### Idea

Instead of converting the number to a string, repeatedly divide it by `10` to count its digits.

### Algorithm

1. Initialize `count = 0`.
2. For every number:
   - Count digits by repeatedly dividing by `10`.
3. If digit count is even, increment `count`.
4. Return `count`.

---

## Java Solution

```java
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
```

---

## Complexity Analysis

- **Time Complexity:** `O(n × d)`
  - `d` = number of digits (maximum 6)
- **Space Complexity:** `O(1)`

---

# Optimal Approach

The **String conversion approach** is the most concise and easy to understand for this problem. Since the maximum number has only **6 digits**, both approaches run efficiently within the given constraints.

---