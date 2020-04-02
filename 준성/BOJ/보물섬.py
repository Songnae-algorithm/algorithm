#완료 (다시 0회)
from collections import deque

def bfs(i, j):
    q = deque([[i, j, 0]])
    maxCount = 0
    while q:
        value = q.popleft()
        x = value[0]
        y = value[1]
        count = value[2]
        if not visited[x][y]:
            visited[x][y] = True
            maxCount = max(maxCount, count)
            for i in range(4):
                newX = dx[i] + x
                newY = dy[i] + y
                if newX >= 0 and newY >= 0 and newX < n and newY < m and visited[newX][newY] == False and treasure[newX][newY] == "L":
                    q.append([newX, newY, count+1])
    return maxCount
                    
n, m = map(int, input().split())
treasure = []
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
visited = []
result = 0

for _ in range(n):
    treasure.append(list(input()))

for i in range(len(treasure)):
    for j in range(len(treasure[i])):
        if treasure[i][j] == "L":
            visited = [[False for _ in range(m)] for _ in range(n)]
            result = max(result, bfs(i, j))
print(result)