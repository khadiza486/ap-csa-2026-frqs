# Question 4: GameBoard

## What this solution does

This solution works with a game board made from a 2D array of Space objects. The method calculates the total points for one row of the board.

If every space in that row has the same color, the total points are doubled. If the colors are not all the same, the method returns the normal total.

## How I solved it

I saved the color of the first space in the row. Then I looped through the rest of the row by moving across the columns.

While looping, I added the points from each space and checked if each color matched the first color. If all the colors matched, I doubled the score. Otherwise, I returned the regular score.

## Main Java concepts used

2D arrays, objects, getter methods, for loops, String comparison with equals, and boolean variables.
