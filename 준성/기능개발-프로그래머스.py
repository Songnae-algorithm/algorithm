def solution(progresses, speeds):
  # 완성(while문 수정하고 싶다)
    #다시 1회
    queue = []
    count = 0
    answer = []
    for i in range(len(progresses)):
        rest = (100 - progresses[i]) % speeds[i]
        temp = (100 - progresses[i]) // speeds[i]
        if rest == 0:
            queue.append(temp)
        else:
            queue.append(temp + 1)
    
    
    day = queue.pop(0)
    count += 1
    
    while queue:
        if day >= queue[0]:
            count += 1
            queue.pop(0)
        else:
            answer.append(count)
            day = queue.pop(0)
            count = 1
            
    answer.append(count)
    return answer
            