#완료(다시 1회)
from collections import deque

def bfs(v, target):
    q = deque([[v, 0]])
    minCount = 0
    while q:
        value = q.popleft()
        v = value[0]
        count = value[1]
        
        if not visited[v]:
            visited[v] = True
            if v == target:
                return count

            if v * 2 <= 100000:
                q.append([v*2, count+1])
            if v - 1 >= 0:
                q.append([v-1, count+1])
            if v + 1 <= 100000:
                q.append([v+1, count+1])
    
n, k = map(int, input().split())
visited = [False] * 100001
print(bfs(n, k))
