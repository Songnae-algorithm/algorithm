#완료 (다시 0회)
import copy

def solution(count):
    if count == m:
        print(" ".join(map(str, numbers)))
        return
    for i in range(n):
        numbers.append(i+1)
        solution(count+1)
        numbers.pop()
    
n, m = map(int, input().split())
numbers = []
solution(0)