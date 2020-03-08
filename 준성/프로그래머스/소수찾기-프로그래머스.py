#완료 (다시 풀어보기)
from itertools import permutations

def solution(numbers):
    count = 0
    maximum = 10000000
    prime_list = [False, False] + [True] * maximum
    for index, num in enumerate(prime_list):
        if num:
            k = index * 2
            while k <= maximum:
                prime_list[k] = False
                k += index

    for r in range(1, len(numbers) + 1):
        permuNumbers = list(permutations(list(numbers), r))
        temp = list(set(permuNumbers))
        for i in range(len(temp)):
            if temp[i][0] == "0":
                continue
            num = int("".join(temp[i]))
            if prime_list[num]:
                count += 1
    return count