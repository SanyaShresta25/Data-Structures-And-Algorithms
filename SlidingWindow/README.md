
### 🧠 What is Sliding Window?

Sliding Window is a method to **look at a part (window) of an array**, and **slide it step by step** to find something — like max, min, or average.

Instead of checking every possible subarray from scratch, we just **slide the window** and **reuse previous calculations**, which saves time!

---

### 💡 Why use it?

To solve problems **faster** — especially when you’re dealing with:
- Subarrays
- Fixed-size or variable-size ranges
- Problems that ask for "max sum", "min length", "longest substring", etc.

---

### 🪟 Think of it like this:

Imagine you have a window of size `k` over an array:

```
Array:       [1, 2, 3, 4, 5]
Window (k=3): [1, 2, 3] → then slide → [2, 3, 4] → [3, 4, 5]
```

You calculate something in the window (like the sum), then **slide forward** by removing the left element and adding the next one on the right.

---

### 🔧 Code Example (Maximum sum of subarray of size k)

```java
int maxSum = 0, windowSum = 0;
for (int i = 0; i < k; i++) {
    windowSum += arr[i];
}
maxSum = windowSum;

for (int i = k; i < arr.length; i++) {
    windowSum += arr[i] - arr[i - k]; // slide window
    maxSum = Math.max(maxSum, windowSum);
}
```

---

### ⚡ Efficiency:
- **Without sliding window**: O(n * k) — slow
- **With sliding window**: O(n) — fast!

---