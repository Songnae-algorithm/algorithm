# 완성코드(다시 0)
from collections import deque

def bfs(i, j):
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    dic = {'i': i, 'j': j}
    q = deque([dic])
    danjiCount = 0
    while q:
        now = q.popleft()
        if danji[now['i']][now['j']] != 0:
            danji[now['i']][now['j']] = 0
            danjiCount += 1
            for k in range(4):
                new_i = now['i'] + dx[k]
                new_j = now['j'] + dy[k]
                if new_i < n and new_j < n and new_i >= 0 and new_j >= 0:
                    if danji[new_i][new_j] == 1:
                        q.append({'i': new_i, 'j': new_j})
    return danjiCount

n = int(input())
danji = [[] for _ in range(n)]
count = 0
countList = []

for i in range(n):
    danji[i] = list(map(int, input()))

for i in range(len(danji)):
    for j in range(len(danji[i])):
        if danji[i][j] == 1:
            countList.append(bfs(i, j))
            count += 1
print(count)
countList.sort()
for value in countList:
    print(value)