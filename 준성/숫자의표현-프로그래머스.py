def solution(n):
  # 아직 못푼 문제
  sum = 0
  count = 0
  for i in range(1, n + 1):
    for k in range(i, n + 1):
      sum += k
      if sum < 15:
        continue
      elif sum == 15:
        count += 1
        break
      else:
        break
        
    sum = 0
  return count