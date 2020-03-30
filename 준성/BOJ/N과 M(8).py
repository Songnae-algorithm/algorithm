#완료 (다시 0회)
import copy

def solution(count):
    if count == m:
        print(" ".join(map(str, result)))
        return
    for i in range(len(numbers)):
        if len(result) != 0 and numbers.index(result[-1]) > i:
            continue
        result.append(numbers[i])
        solution(count+1)
        result.pop()
    
n, m = map(int, input().split())
numbers = list(map(int, input().split()))
numbers.sort()
result = []
solution(0)