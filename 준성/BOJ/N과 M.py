#완료(다시 0회)
from itertools import permutations

n, m = map(int, input().split())
nList = []

for i in range(1, n + 1):
    nList.append(i)
    
permute = list(permutations(nList, m))

for i in range(len(permute)):
    for j in range(len(permute[i])):
        print(permute[i][j], end=' ')
    print()