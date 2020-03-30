#완료 (다시 0회)
str, bombStr = input(), input()
stack = []
for i in range(len(str)-1, -1, -1):
    stack.append(str[i])
    if stack[-1] == bombStr[0] and len(stack) >= len(bombStr):
        check = False
        for j in range(len(bombStr)):
            if stack[-(j+1)] != bombStr[j]:
                check = True
        if not check:
            for j in range(len(bombStr)):
                stack.pop()
if len(stack) == 0:
    print("FRULA")
else:
    stack.reverse()
    print(''.join(stack))
