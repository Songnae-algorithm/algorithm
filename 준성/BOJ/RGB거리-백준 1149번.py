# 완료(다시 0회)
dp = []
n = int(input())
for _ in range(n):
    num1, num2, num3 = map(int, input().split())
    dp.append([num1,num2,num3])

for i in range(1, len(dp)):
    for j in range(3):
        if j == 0:
            dp[i][0] = min(dp[i-1][1] + dp[i][0], dp[i-1][2] + dp[i][0])
        if j == 1:
            dp[i][1] = min(dp[i-1][0] + dp[i][1], dp[i-1][2] + dp[i][1])
        if j == 2:
            dp[i][2] = min(dp[i-1][0] + dp[i][2], dp[i-1][1] + dp[i][2])
    
print(min(dp[n-1]))