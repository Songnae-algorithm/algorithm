#완료(다시 0회)
import copy
import sys
sys.setrecursionlimit(100000)

def dfs(x, y, tempMap):
    tempMap[x][y] = 0 #방문표시
    for i in range(4):
        newX = x + dx[i]
        newY = y + dy[i]
        if (0 <= newX < N) and (0 <= newY < N):
            if tempMap[newX][newY] != 0:
                dfs(newX, newY, tempMap)

N = int(input())
myMap = [list(map(int, input().split())) for _ in range(N)]
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]
maxList = []
maxValue = 0
answer = 1
countList = []
for i in range(len(myMap)):
    maxList.append(max(myMap[i]))
maxValue = max(maxList)

# k는 비가 오는 양 1 ~ 배열 내 최대 높이양까지 잠기는 검사
for k in range(1, maxValue + 1):
    tempMap = copy.deepcopy(myMap)
    for i in range(len(tempMap)):
        for j in range(len(tempMap[i])):
            if tempMap[i][j] <= k:
                tempMap[i][j] = 0 # -1이면 잠김
    
    count = 0
    for x in range(len(tempMap)):
        for y in range(len(tempMap[x])):
            if tempMap[x][y] != 0: # 안잠긴 영역 and 방문 안한 영역
                dfs(x, y, tempMap)
                count += 1
                
    answer = max(answer, count)

print(answer)