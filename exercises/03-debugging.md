# Exercise 11 — The Debugging Gauntlet

Five programs, escalating difficulty. Fix each one, then document it.

For each: what type of error, what the message said (or didn't), and what was actually wrong.

---

## DebugMe1

| | |
|---|---|
| **Error type** (syntax / runtime / logic) | syntax|
| **Message Java gave** | exspected|
| **What was actually wrong** | missing semicolon|
| **The fix** | add semi colon|

---

## DebugMe2

| | |
|---|---|
| **Error type** |syntax |
| **Message** | exspected string connot be converted to int|
| **What was wrong** | missing semicolon qoutations |
| **The fix** | delete qoutes and add semicolon|

---

## DebugMe3

| | |
|---|---|
| **Error type** | syntax|
| **Message** | lossy conversion from double to int|
| **What was wrong** | incompaddapol types|
| **The fix** | add math.round and cast|

---

## DebugMe4

| | |
|---|---|
| **Error type** | syntax|
| **Message** | can't find average|
| **What was wrong** | total score was not camel case and average |
| **The fix** | lower case the average and camel case total score|

---

## DebugMe5

> ⚠️ This one **compiles and runs**. It just gives the wrong answer.

| | |
|---|---|
| **Error type** | logic|
| **What output did you expect?** | 86%|
| **What output did you get?** |0.0% |
| **What was actually wrong** | it didnt calculate a double even when % exspect one|
| **The fix** | cast a double|
| **How did you find it?** | basic math|

---

## Reflection

**1. Which was hardest? Why?**

[your answer]

**2. DebugMe5 had no error message at all. What strategy did you use to find the problem?**

[your answer]

**3. Why is a logic error more dangerous in real software than a syntax error?**

[your answer]
