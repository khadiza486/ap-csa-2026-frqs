# Question 3: Attendance

## What this solution does

This solution compares two course lists: one for history and one for math. It counts how many students are in both classes and have more absences in history than in math.

## How I solved it

I used nested loops to compare each student in the history list with each student in the math list. When the student IDs matched, I checked their absences.

If the student had more absences in history than math, I added one to the count. After checking the lists, I returned the final count.

## Main Java concepts used

ArrayList, nested loops, objects, getter methods, String comparison with equals, and counting with an integer variable.
