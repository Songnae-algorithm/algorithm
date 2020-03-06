# 완료(다시 0회)
def goodString(string):
    if len(string) % 2 != 0:
        return False
    else:
        stack = [string[0]]
        for i in range(1, len(string)):
            if len(stack) == 0:
                stack.append(string[i])
                continue
            if stack[-1] == string[i]:
                stack.pop()
            else:
                stack.append(string[i])
        if len(stack) == 0:
            return True
        else:
            return False

count = 0
for _ in range(int(input())):
    string = input()
    if goodString(string):
        count += 1
print(count)