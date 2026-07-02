# 1796. Second Largest Digit in a String

## Problem Statement

Given an alphanumeric string `s`, return the **second largest numerical digit** that appears in `s`, or `-1` if it does not exist.

An alphanumeric string consists of lowercase English letters and digits.

---

## Example 1

**Input:**
```text
s = "dfa12321afd"
```

**Output:**
```text
2
```

**Explanation:**

The digits present are:

```text
1, 2, 3
```

The largest digit is `3`, so the second largest digit is `2`.

---

## Example 2

**Input:**
```text
s = "abc1111"
```

**Output:**
```text
-1
```

**Explanation:**

Only one unique digit (`1`) appears, so there is no second largest digit.

---

## Constraints

- `1 <= s.length <= 500`
- `s` consists only of lowercase English letters and digits.

---

# Approach

- Traverse each character in the string.
- If the character is a digit:
  - Convert it to an integer.
  - Keep track of the largest and second largest **unique** digits.
- Ignore duplicate digits.
- Return the second largest digit if it exists; otherwise return `-1`.

---

# Java Solution

```java
class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int num = ch - '0';

                if (num > first) {
                    second = first;
                    first = num;
                } else if (num < first && num > second) {
                    second = num;
                }
            }
        }

        return second;
    }
}
```

---

# Time Complexity

```text
O(n)
```

- We traverse the string once.

---

# Space Complexity

```text
O(1)
```

- Only two variables are used.