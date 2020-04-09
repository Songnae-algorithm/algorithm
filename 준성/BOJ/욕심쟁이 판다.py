#완료 (다시 0회)

import sys
sys.setrecursionlimit(300000)

def dfs(x, y):
    if memo[x][y]:
        return memo[x][y]
    memo[x][y] = 1
    for i in range(4):
        newX, newY = dx[i] + x, dy[i] + y
        if 0 <= newX < n and 0 <= newY < n and dp[newX][newY] > dp[x][y]:
            memo[x][y] = max(memo[x][y], dfs(newX, newY) + 1)
    return memo[x][y]

n = int(input())
dp = []
memo = [[0 for _ in range(n)] for _ in range(n)]
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]
answer = 0

for _ in range(n):
    dp.append(list(map(int, input().split())))

for i in range(n):
    for j in range(n):
        memo[i][j] = dfs(i, j)

print(max(map(max, memo)))
