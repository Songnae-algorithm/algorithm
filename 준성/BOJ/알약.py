# 완료 (다시 0회)
cache = [[0 for _ in range(31)] for _ in range(31)]


def solution(one, half):
    if one == 0 and half == 1:
        return 1

    if cache[one][half] != 0:
        return cache[one][half]

    if one != 0:
        cache[one][half] += solution(one - 1, half + 1)

    if half != 0:
        cache[one][half] += solution(one, half - 1)

    return cache[one][half]


while True:
    n = int(input())
    if n == 0:
        break
    print(solution(n, 0))
