# 완료(다시 0회)
n, m = map(int, input().split())
dx = [1, 0, 1]
dy = [0, 1, 1]
dp = []

for _ in range(n):
    dp.append(list(map(int, input().split())))


for i in range(len(dp)):
    for j in range(len(dp[i])):
        # 첫 시작이면
        if i == 0 and j == 0:
            continue
        elif i == 0:
            dp[i][j] += dp[i][j-1]
        elif j == 0:
            dp[i][j] += dp[i-1][j]
        else:
            dp[i][j] += max(dp[i-dx[0]][j-dy[0]], dp[i-dx[1]]
                            [j-dy[1]], dp[i-dx[2]][j-dy[2]])
print(dp[n-1][m-1])
