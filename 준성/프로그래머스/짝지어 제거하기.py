# 완료(다시 0회)
def solution(s):
    stack = [s[0]]

    for i in range(1, len(s)):
        if len(stack) != 0 and stack[-1] == s[i]:
            stack.pop()
            continue
        stack.append(s[i])

    if len(stack) == 0:
        return 1
    else:
        return 0
