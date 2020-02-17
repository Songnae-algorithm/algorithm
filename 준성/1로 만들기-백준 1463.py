n = int(input())
dp = [0 for _ in range(n + 1)]
q = [n]

while q:
    value = q.pop(0)
    if value == 1:
        print(dp[1])
        break
    else:
        if value % 2 == 0 and dp[value // 2] == 0:
            dp[value // 2] = dp[value] + 1
            q.append(value // 2)
        if value % 3 == 0 and dp[value // 3] == 0:
            dp[value // 3] = dp[value] + 1
            q.append(value // 3)
        if dp[value - 1] == 0:
            dp[value - 1] = dp[value] + 1
            q.append(value - 1)