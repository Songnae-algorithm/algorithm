def solution(answers):
  answer = []
  myAnswer = [[1,2,3,4,5], [2,1,2,3,2,4,2,5], [3,3,1,1,2,2,4,4,5,5]]
  countList = []
  count = 0
  
  # 수포자 1,2,3 이라 3번 반복
  for k in range(0, 3):
    for i in range(0, len(answers)):
      # 테스트 케이스 answers만큼 반복 하는데 수포자들의 답안 규칙을 활용하기 위해 나머지를 이용
      # ex) index가 0, 1, 2, 3, 4 다시 0, 1, 2, 3, 4 형식으로 반복되게
      j = i % len(myAnswer[k])
      if answers[i] == myAnswer[k][j]:
        count += 1
    countList.append(count)
    count = 0
  
  maxItem = max(countList)
  for i in range(0, len(countList)):
    if countList[i] == maxItem:
      answer.append(i + 1)
  
  return answer