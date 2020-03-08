# 완료 (다시 풀기)
n = int(input())
tp = []

for _ in range(n):
    tp.append(list(map(int, input().split())))
dp = [0 for i in range(n)]

# 마지막날은 소요일 1일 일때만 상담 가능
if tp[n-1][0] == 1:
    dp[n-1] = tp[n-1][1]
    
for i in range(n - 2, -1, -1):
    day, money = tp[i][0], tp[i][1]
    if day + i == n:
        dp[i] = max(money, dp[i+1])
    elif day + i < n:
        dp[i] = max(money + dp[day + i], dp[i+1])
    elif day + i > n:
        dp[i] = dp[i + 1]
print(dp[0])