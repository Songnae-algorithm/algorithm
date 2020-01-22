def solution(s):
  # 완성
  stack = []
  for value in s:
    if value == "(":
      stack.append(value)
    else:
      if len(stack) == 0:
        return False
      stack.pop()
  
  return len(stack) == 0