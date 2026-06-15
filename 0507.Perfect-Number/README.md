# Perfect Number

## Problem Statement

A **perfect number** is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.

A **divisor** of an integer `x` is an integer that divides `x` evenly.

Given an integer `num`, return `true` if `num` is a perfect number; otherwise, return `false`.

---

## Examples

### Example 1

**Input:**
```text
num = 28
```

**Output:**
```text
true
```

**Explanation:**
```text
28 = 1 + 2 + 4 + 7 + 14
```

The divisors of `28` (excluding itself) are:
`1, 2, 4, 7, 14`

Their sum is `28`, so it is a perfect number.

### Example 2

**Input:**
```text
num = 7
```

**Output:**
```text
false
```

---

## Constraints

```text
1 <= num <= 10^8
```