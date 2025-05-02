
### 🧠 What is the Two Pointers Technique?

Two Pointers means using **two variables (pointers)** to **scan** or **compare** elements in an array, usually from:
- **Start and end** (like left and right)
- Or one slower and one faster (like in linked list problems)

---

### 💡 Why use it?

To solve problems in a **faster and cleaner** way — often in **O(n)** time instead of O(n²).

---

### 🚀 Classic Examples

1. **Finding a pair with a target sum in a sorted array**
   - One pointer starts at the beginning, the other at the end
   - Move the pointers based on the current sum

2. **Reversing an array or string**
   - Swap elements from both ends, move inward

3. **Container With Most Water** (like the code you shared!)
   - Area = min(height[left], height[right]) × width
   - Move the pointer that has the shorter height

---

### 🧊 Real-life Analogy

Imagine checking if a word is a **palindrome**:
- One finger on the **first letter**, one on the **last**
- Move inward, comparing letters
- If all match → it's a palindrome!

---