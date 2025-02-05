# Problem
You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided.

Example 1:
Input: n = 7
Output: 6
Explanation: Details of the tournament: 
- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 3 + 2 + 1 = 6.
Example 2:

Input: n = 14
Output: 13
Explanation: Details of the tournament:
- 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
- 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
- 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 7 + 3 + 2 + 1 = 13.
 

Constraints:
1 <= n <= 200

---------------------------------------------------------------------------------------------------------------------------------------
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The recursive approach is suitable for this problem because it reflects the nature of tournament structures **where teams compete in matches, and the winners of those matches proceed to the next round until a single team is left**.

# Approach
<!-- Describe your approach to solving the problem. -->
How the recursion works:

1. Base Case (if teams == 1): If there is only one team, there are no matches to play, so the function returns 0.

2. General Case: 2 conditions
- *Even Number of Teams:* If the number of teams is even, half of them play matches and advance to the next round (teams / 2). The function then recursively calls itself with the updated number of teams (n / 2).

 - *Odd Number of Teams:* If the number of teams is odd, one team gets a bye (advances to the next round without playing) while the remaining teams play matches. The function recursively calls itself with the updated number of teams for the matches ((teams - 1) / 2) and the team with a bye ((teams - 1) / 2 + 1).

The recursion continues until the base case is reached, and the results are accumulated to calculate the total number of matches. Recursive approaches are often used for problems with a natural hierarchical or divide-and-conquer structure, such as this tournament scenario.

# Complexity
- Time complexity: O(log n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
The time complexity is determined by the number of recursive calls and the work done in each call.

In each recursive call, the number of teams is halved (for even teams) or reduced by approximately half (for odd teams). Therefore, the time complexity can be expressed as O(log n), where n is the initial number of teams.

- Space complexity: O(log n)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
The space complexity is influenced by the depth of the recursion stack.

Since each recursive call introduces a new stack frame, and the depth of the recursion is proportional to the logarithm of the input size (due to halving the number of teams in each recursive call), the space complexity is O(log n).

In addition to the recursion stack, there may be additional space used for local variables, but this is constant for each level of recursion and doesn't affect the overall complexity analysis.


# Code
```
class Solution {
    public int numberOfMatches(int n) {
        int teams = n;

        if( teams== 1 ){
            return 0;
        }
        if ( teams%2==0 ){
            return teams/2 + numberOfMatches(n/2);
        }else{
            return (teams-1)/2 + numberOfMatches( (teams-1)/2 +1);
        }
    }
}
```
