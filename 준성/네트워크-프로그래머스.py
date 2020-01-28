def dfs(v, visited, adj):
    visited[v] = True
    for e in adj[v]:
        if not visited[e]:
            dfs(e, visited, adj)

def solution(n, computers):
  # 완성 코드(다시 1회)
    count = 0
    adj = [[] for _ in range(n)]
    for i in range(len(computers)):
        for k in range(len(computers[i])):
            if i == k:
                continue
            elif computers[i][k] == 1:
                adj[i].append(k)
                
    visited = [False] * (n)
    for i in range(n):
        if not visited[i]:
            dfs(i, visited, adj)
            count += 1
            
    return count
