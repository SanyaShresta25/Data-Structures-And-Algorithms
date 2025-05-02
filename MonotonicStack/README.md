### 🔷 What is a **Monotonic Stack**?

A **monotonic stack** is just a normal stack that **keeps elements in a specific order** — either **increasing** or **decreasing** — while you go through a list (like an array).

---

### 🔹 Two Types:

1. **Monotonically Increasing Stack**

   * The values (or indices) in the stack go **up** from bottom to top.
   * You **pop** from the stack when you find a **smaller** or **equal** element.

2. **Monotonically Decreasing Stack**

   * The values in the stack go **down** from bottom to top.
   * You **pop** when you find a **larger** element.

---

### 🧠 Why is it useful?

It helps solve problems where you need to find:

* The **next greater/smaller element** for each item in a list.
* The **span** or **distance** to the next bigger or smaller item.
* Problems like:

  * *Daily Temperatures*
  * *Next Greater Element*
  * *Largest Rectangle in Histogram*

---

### ✅ Real Example: Daily Temperatures

You want to know: **how many days until it's warmer**?

* You loop through each day's temperature.
* Use a stack to store the **indices of days with unanswered warmer days**.
* When a warmer day is found, you pop from the stack and calculate the number of days passed.

---

### 🔁 Summary

Think of a **monotonic stack** as a smart helper:

* It remembers just what you need.
* It removes things that are no longer useful.
* It does it all while keeping numbers in order (increasing or decreasing).

---
