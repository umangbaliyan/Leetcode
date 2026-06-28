# 242. Valid Anagram

**Difficulty:** Easy

## Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An **anagram** is a word or phrase formed by rearranging the letters of another word, using all the original letters exactly once.

---

## Examples

### Example 1

**Input:**
```text
s = "anagram", t = "nagaram"
```

**Output:**
```text
true
```

---

### Example 2

**Input:**
```text
s = "rat", t = "car"
```

**Output:**
```text
false
```

---

## Constraints

- `1 <= s.length, t.length <= 5 × 10^4`
- `s` and `t` consist of lowercase English letters.

---

## Follow-up

What if the inputs contain Unicode characters? How would you adapt your solution to handle this case?