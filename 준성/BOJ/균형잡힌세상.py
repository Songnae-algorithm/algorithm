# 완료 (다시 0회)
while True:
    str = input()
    stack = []
    if str == ".":
        break
        
    for char in str:
        if char == "(" or char == "[":
            stack.append(char)
        elif len(stack) != 0 and char == ")" and stack[-1] == "(":
            stack.pop()
        elif len(stack) != 0 and char == "]" and stack[-1] == "[":
            stack.pop()
        elif char == ")" or char == "]":
            stack.append(char)
    if len(stack) != 0:
        print('no')
    else:
        print('yes')
            