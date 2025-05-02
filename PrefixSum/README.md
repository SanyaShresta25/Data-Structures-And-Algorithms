### 🚀 What is Prefix Sum?

Prefix Sum is a technique to **quickly calculate the sum of elements in a range** of an array.

---

### 💡 Why use it?

If you're asked:
> "What is the sum of elements from index `L` to index `R` in an array?"

Doing this repeatedly using a loop is **slow** (O(n)) for each query.  
Using Prefix Sum, you can do it in **O(1) time** after a one-time setup.

---

### 🔧 How it works?

Let’s say you have an array:  
```js
arr = [3, 1, 4, 2, 5]
```

Now, create a **prefix sum array**:

```js
prefix = [3, 4, 8, 10, 15]
```

Each `prefix[i]` is the **sum of all elements from index 0 to i**.

So:
- prefix[0] = 3
- prefix[1] = 3 + 1 = 4
- prefix[2] = 3 + 1 + 4 = 8
- and so on...

---

### ✅ How to get sum from index L to R?

Formula:
```
sum = prefix[R] - prefix[L-1]
```

Example: Sum from index 1 to 3 (`[1, 4, 2]`)  
→ `prefix[3] - prefix[0] = 10 - 3 = 7`

For `L = 0`, just return `prefix[R]` directly.

---

