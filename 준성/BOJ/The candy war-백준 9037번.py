#완료 (다시 0회)
def plusOneCandy(candy):
    for i in range(len(candy)):
        if candy[i] % 2 != 0:
            candy[i] += 1
            
def gameStart(candy):
    cycle = 0
    while len(set(candy)) != 1:
        giveAccount = []
        cycle += 1
        for i in range(len(candy)):
            account = candy[i] // 2
            candy[i] -= account
            giveAccount.append(account)

        for j in range(-1, len(candy) - 1):
            candy[j+1] += giveAccount[j]

        plusOneCandy(candy)
    return cycle
    
    
for t in range(int(input())):
    n, candy = int(input()), list(map(int, input().split()))
    
    plusOneCandy(candy)
    print(gameStart(candy))
    