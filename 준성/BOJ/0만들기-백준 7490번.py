# 정답은 맞으나 다시!!
def zero(sum, sign, num, now, numberStr):
    global target
    if now == target:
        sum += (num * sign)
        if sum == 0:
            print(numberStr)
        return
    zero(sum, sign, num * 10 + (now+1), now+1, numberStr + " " + str(now+1))
    zero(sum + (sign* num), 1, now+1, now+1, numberStr + "+" + str(now+1))
    zero(sum + (sign*num), -1, now+1, now+1, numberStr + "-" + str(now+1))
        
t = int(input())
target = 0
for i in range(t):
    target = int(input())
    numberStr = "1"
    zero(0, 1, 1, 1, numberStr)
    print()