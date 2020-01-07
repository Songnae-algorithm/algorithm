def solution(heights):
  answer = []
  isNumber = False
  for i in range(len(heights) - 1, -1, -1):
    for j in range(i - 1, -1, -1):
      if heights[i] < heights[j]:
        answer.append(j + 1) #배열에 push
        isNumber = True
        break
    if isNumber == False:
      answer.append(0) #배열에 push
    else:
      isNumber = False
  answer.reverse()
  return answer