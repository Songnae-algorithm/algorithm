import sys
sys.setrecursionlimit(10000)

def factorial(n):
    if n <= 1:
        return n
    return n * factorial(n - 1)
    
n = int(input())
print(factorial(n))