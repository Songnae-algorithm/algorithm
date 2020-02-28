def solution(s):
  # 완성(다시 1회)
  # 더 좋은 코드는 없을까?
  stack = []
  for value in s:
    if value == "(":
      stack.append(value)
    else:
      if len(stack) == 0:
        return False
      stack.pop()
  
  return len(stack) == 0