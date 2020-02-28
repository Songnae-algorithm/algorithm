def solution(a, b):
  answer = ""
  days = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
  daySum = 0
  
  for i in range(0, a - 1):
    daySum = daySum + days[i]
  daySum += b
      
  if daySum % 7 == 1:
    answer = "FRI"
  elif daySum % 7 == 2:
    answer = "SAT"
  elif daySum % 7 == 3:
    answer = "SUN"
  elif daySum % 7 == 4:
    answer = "MON"
  elif daySum % 7 == 5:
    answer = "TUE"
  elif daySum % 7 == 6:
    answer = "WED"
  elif daySum % 7 == 0:
    answer = "THU"
  
  return answer