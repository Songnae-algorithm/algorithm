#완료
from collections import deque

def bfs(N, K):
    q = deque([N])
    count = 0
    flag = False
    while q:
        for _ in range(len(q)):
            v = q.popleft()
            if not visited[v]:
                visited[v] = True
                if v == K:
                    flag = True
                    break
                if v - 1 >= 0:
                    q.append(v - 1)
                if v + 1 <= 100000:
                    q.append(v + 1)
                if v * 2 <= 100000:
                    q.append(v * 2)
        
        if flag:
            print(count)
            break
        count += 1
        
        
N, K = map(int, input().split())
visited = [False] * 100001
bfs(N, K)