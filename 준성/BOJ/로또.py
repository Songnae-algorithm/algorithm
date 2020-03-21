#완료 (다시 0회)
from itertools import combinations

while True:
    k, *s = list(map(int, input().split()))
    if k == 0:
        break
    combi = list(combinations(s, 6))
    for combiList in combi:
        for value in list(combiList):
            print(value, end=' ')
        print()
    print()