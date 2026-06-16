# Question 2: Bottle

## What this solution does

This solution creates a Bottle class that keeps track of the bottle’s capacity and the current amount of liquid inside it. Each bottle starts full.

When liquid is removed, the program updates the amount left in the bottle. If the bottle gets too low, it automatically refills back to full.

## How I solved it

I used instance variables to store the capacity and the current amount. In the constructor, I set the current amount equal to the capacity because the bottle starts full.

In the updateAmount method, I subtracted the amount used from the current amount. Then I checked if the bottle had less than 25% left. If it did, I refilled it back to the full capacity.

## Main Java concepts used

Classes, instance variables, constructors, double values, if statements, and return values.
