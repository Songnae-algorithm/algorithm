from collections import deque

def bfs(c, b):
    count = 0
    q = deque([[c, b, count]])
    while q:
        value = q.popleft()
        cony, brown, count = value[0], value[1], value[2]
        if cony == brown:
            return count
        count += 1
        if cony + count > 200000:
            return -1
        if brown - 1 <= 200000:
            q.append([cony + count, brown - 1, count])
        if brown + 1 <= 200000:
            q.append([cony + count, brown + 1, count])
        if brown * 2 <= 200000:
            q.append([cony + count, brown * 2, count])
                    
c, b = map(int, input().split())
print(bfs(c, b))
    