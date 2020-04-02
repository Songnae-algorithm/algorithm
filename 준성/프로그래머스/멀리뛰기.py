# 완료 (다시 0회)


def solution(n):
    dp = [0] * 2001
    dp[1] = 1
    dp[2] = 2

    for i in range(3, 2001):
        dp[i] = (dp[i-2] + dp[i-1]) % 1234567
    return dp[n]
