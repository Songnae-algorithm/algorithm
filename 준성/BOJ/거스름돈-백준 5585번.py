n = int(input())
rest = 1000 - n
coins = [500, 100, 50, 10, 5, 1]
count = 0

for coin in coins:
    if rest // coin > 0:
        count = count + (rest // coin)
        rest = rest % coin

print(count)