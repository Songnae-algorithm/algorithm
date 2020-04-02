# 완료 (다시 0회)
def sol(n):
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for i in range(4, n+1):
        dp[i] = dp[i-3] + dp[i-2] + dp[i-1]
    return dp[n]


tc = int(input())
dp = [0] * 12
for i in range(tc):
    n = int(input())
    print(sol(n))
