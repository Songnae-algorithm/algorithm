def solution(arrangement):
  # 완성 코드
  stack = []
  count = 0
  for i in range(0, len(arrangement)):
    if arrangement[i] == "(":
      stack.append(arrangement[i])
    else:
      stack.pop()
      if arrangement[i - 1] == "(":
        count += len(stack)
      else:
        count += 1
  return count
              