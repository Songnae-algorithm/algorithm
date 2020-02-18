from collections import deque
# 완료
def bfs(i, j, zeroCount):
    q = deque([[i, j]])
    while q:
        v = q.popleft()
        nowX = v[0]
        nowY = v[1]
        if square[nowX][nowY] == 0:
            square[nowX][nowY] = 1
            zeroCount += 1
            for i in range(4):
                newX = dx[i] + nowX
                newY = dy[i] + nowY
                if newX >= 0 and newY >= 0 and newX < M and newY < N:
                    if square[newX][newY] == 0:
                        q.append([newX, newY])
    return zeroCount

M, N, K = map(int, input().split())
square = [[0] * N for _ in range(M)]
areaCount = 0
zeroCount = 0
countList = []
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

for i in range(K):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(y1, y2):
        for j in range(x1, x2):
            square[i][j] = 1

for i in range(len(square)):
    for j in range(len(square[i])):
        if square[i][j] == 0:
            countList.append(bfs(i, j, zeroCount))
            areaCount += 1
            zeroCount = 0
            
print(areaCount)
countList.sort()
for count in countList:
    print(count, end=' ')