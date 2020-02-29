# 쉬운 문제지만 풀이 코드 센스 익히기
n, listN = int(input()), {value: 1 for value in map(int, input().split())}
m = input()
for value in list(map(int, input().split())):
    print(listN.get(value, 0))