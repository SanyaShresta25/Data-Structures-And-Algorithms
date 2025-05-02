### 🧠 What is it?

The **fast and slow pointer** technique uses **two pointers** that move through a data structure (like a linked list) at **different speeds**.

- `slow` → moves **1 step at a time**  
- `fast` → moves **2 steps at a time**

---

### 📦 Why use it?

It helps solve problems like:
- ✅ Finding the **middle** of a list  
- ✅ Detecting a **cycle** in a list  
- ✅ Finding where a **cycle starts**

---

### 🎯 Real-life Analogy:

Imagine two people walking around a circular track:
- One walks (slow)
- One runs (fast)

If the track is a **loop**, the fast one will **eventually catch** the slow one → **cycle detected**  
If not, the fast one will reach the end first.

---

### 🧪 Example: Find middle of linked list

```java
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
```

When `fast` reaches the end, `slow` is at the **middle**!

---
