### Approach

1. Perform a level-order traversal (BFS) of the binary tree. Use a queue to process each node level by level.
2. For each level, compute the sum of the node values.
3. Store the sums in a list. Once the entire tree is traversed, this list will contain the sum for each level.
4. Sort the list in descending order to get the sums from largest to smallest.
5. Return the k-th largest sum (considering that k is 1-based, so retrieve res[k-1]).
6. If k is larger than the number of levels, return -1 as the tree doesn’t have enough levels.

### Complexity

- Time complexity:
The BFS traversal takes O(N), where N is the number of nodes in the tree. Sorting the level sums takes O(LlogL), where L is the number of levels in the tree. Therefore, the overall time complexity is O(N+LlogL).

- Space complexity:
The space complexity is O(N) because of the queue used for BFS and the list storing level sums.