# Question 1: Account

## What this solution does

This solution works with the Account class. It creates a username based on the requested name. If that username is already taken, the program keeps adding numbers until it finds a username that is available.

The second part shortens a username by removing each hyphen and the character right before it.

## How I solved it

For the constructor, I first checked if the requested username was available. If it was available, I used it as the username.

If it was not available, I used a while loop to keep trying the requested name with a number added at the end. The number starts at 1 and keeps increasing until an available username is found.

For the shortened name method, I went through the username and created a new version of it without the hyphens and the characters before the hyphens.

## Main Java concepts used

Constructors, Strings, while loops, for loops, substring, and if statements.
