# Ugly Number

An **ugly number** is a positive integer whose prime factors are limited to **2, 3, and 5**.

Given an integer `n`, return `true` if `n` is an ugly number; otherwise, return `false`.

## Examples

### Example 1
**Input:** `n = 6`  
**Output:** `true`  

**Explanation:**  
`6 = 2 × 3`

### Example 2
**Input:** `n = 1`  
**Output:** `true`  

**Explanation:**  
`1` has no prime factors.

### Example 3
**Input:** `n = 14`  
**Output:** `false`  

**Explanation:**  
`14 = 2 × 7`, and `7` is not one of the allowed prime factors.

## Constraints

- `-2³¹ <= n <= 2³¹ - 1`