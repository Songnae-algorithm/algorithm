import heapq

def solution(scoville, K):
  heapq.heapify(scoville)
  i = 0
  count = 0
  check = False
  length = len(scoville)
  
  while i < length:
    if scoville[0] < K:
      mixScoville = scoville[0] + scoville[1] * 2
      count += 1
      heapq.heappush(scoville, mixScoville) 
      i = 0
      length = len(scoville)
      check = True
    else:
      i += 1
          
  if check == True and count == 0:
    return 0
  elif check == False:
    return -1