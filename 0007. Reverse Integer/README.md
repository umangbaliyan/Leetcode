# Reverse Integer

Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2³¹, 2³¹ - 1]`, return `0`.

Assume the environment does not allow storing 64-bit integers.

## Examples

### Example 1
**Input:** `x = 123`  
**Output:** `321`

### Example 2
**Input:** `x = -123`  
**Output:** `-321`

### Example 3
**Input:** `x = 120`  
**Output:** `21`

## Constraints

- `-2³¹ <= x <= 2³¹ - 1`

## Java Solution

```java
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            if (rev < -2147483648 / 10 || rev > 2147483647 / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
            x = x / 10;
        }

        return rev;
    }
}