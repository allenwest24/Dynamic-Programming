# Dynamic-Programming
Different implementations of dynamic programming in order to sort a most optimal strategy for a given scenario.

Prompt:
1.  In a video game, the player can sometimes perform a special move that doubles the "experience points" received from a monster. 
The main limitation is that the player needs to store up energy to perform the move, so it can only be performed on every 
3rd monster at most (although a player could wait to use the stored energy).  That is, at least the previous 2 fights must 
be normal (payoff xi) in order for the special to be used (payoff 2xi).  Given a sequence of N monsters giving xiexperience 
points each, which must be fought in a particular order, the player community is arguing about what the best strategy is for 
using this move.  (The xi values are non-negative integers.)a.) One possible greedy solution would be:   sort the values that 
come third or later (those that we could choose to use the supermove on) by payoff xi, then add monsters to the schedule in order 
of decreasing experience points, as long as the monster to be added doesn't conflict with an existing monster in the schedule by 
being two or fewer spots away.  (For example, for the original values 1, 1, 4, 3, 5, 6, 7, 8, 2, the schedule adds 8 first, then 7 
is skipped because it conflicts, 6 is skipped because it conflicts, 5 is added to the schedule, and nothing else can be added.)  
Find a short counterexample to this greedy approach.b.) If the final boss monster's experience points xN are much larger than 
any other monster's experience points, give an equation for the value of OPT(N) in terms of OPT(N-3) that assumesthe best choice 
is to slay this monster.c.) Give a recurrence for the optimal number of experience points that can be had up to monster i, OPT(i).
(Assume we do not necessarily know whether it's best to slay monster i or not.)d.) Write pseudocode for an iterative algorithm 
that takes the list of the experience points pi(all positive integers) and returns a list of indices that represents the correct 
monsters to use this move on.  The indices don't need to be in any particular order.

Attempt to implement
- without memoization
- with memoization
- through iterative dynamic programming
