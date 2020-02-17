# 시간초과
from collections import deque
import copy
from itertools import combinations

def buildWall(lab, allZeroCases):
    buildLab = copy.deepcopy(lab)
    for i in range(len(allZeroCases)):
        buildLab[allZeroCases[i][0]][allZeroCases[i][1]] = 1
    return buildLab

def contaminated():
    for i in range(len(virusPosition)):
        x = virusPosition[i][0] 
        y = virusPosition[i][1]
        bfs(x, y)
            
def bfs(i, j):
    q = deque([{'i': i, 'j': j}])
    while q:
        v = q.popleft()
        nowX = v['i']
        nowY = v['j']
        tempLab[nowX][nowY] = 2
        for i in range(4):
            newX = dx[i] + v['i']
            newY = dy[i] + v['j']
            if newX >= 0 and newY >= 0 and newX < height and newY < width:
                if tempLab[newX][newY] == 0:
                    q.append({'i': newX, 'j': newY})
    
def countZero():
    count = 0
    for i in range(len(tempLab)):
        count += tempLab[i].count(0)
    return count

height, width = map(int, input().split())
lab = [[] for _ in range(height)]
tempLab = []
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]
countList = []
zeroPosition = []
virusPosition = []

for i in range(height):
    lab[i] = list(map(int, input().split()))
    for j in range(len(lab[i])):
        if lab[i][j] == 0:
            zeroPosition.append([i, j])
        if lab[i][j] == 2:
            virusPosition.append([i, j])
allZeroCases = list(combinations(zeroPosition, 3))

for i in range(len(allZeroCases)):
    # 0인거 차례로 3개씩 벽 세우기
    tempLab = buildWall(lab, allZeroCases[i])

    # 2로 오염 시키기
    contaminated()

    # 0 갯수 세기
    countList.append(countZero())

print(max(countList))