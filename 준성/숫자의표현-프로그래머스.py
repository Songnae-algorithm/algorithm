def solution(n):
  # 완성 코드
  sum = 0
  count = 0
  for i in range(1, n + 1):
    for k in range(i, n + 1):
      sum += k
      if sum < n:
        continue
      elif sum == n:
        count += 1
        break
      else:
        break
        
    sum = 0
  return count