# 완료(다시 0회)
from collections import deque

def bfs(i, j):
    q = deque([[i, j]])
    while q:
        v = q.popleft()
        nowX = v[0]
        nowY = v[1]
        if farm[nowX][nowY] == 1:
            farm[nowX][nowY] = 0
            for i in range(4):
                newX = nowX + dx[i]
                newY = nowY + dy[i]
                if newX >= 0 and newY >= 0 and newX < n and newY < m:
                    if farm[newX][newY] == 1:
                        q.append([newX, newY])


dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]
m, n, k, count = 0, 0, 0, 0
farm = []
countList = []
t = int(input())
for _ in range(t):
    m, n, k = map(int, input().split())
    farm = [[0] * m for _ in range(n)]
    for _ in range(k):
        x, y = map(int, input().split())
        farm[n - 1 - y][x] = 1
    
    for i in range(len(farm)):
        for j in range(len(farm[i])):
            if farm[i][j] == 1:
                bfs(i, j)
                count += 1
    countList.append(count)
    count = 0

for value in countList:
    print(value)
