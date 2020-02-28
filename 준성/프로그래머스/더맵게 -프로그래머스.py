import heapq

def solution(scoville, K):
  heapq.heapify(scoville)
  count = 0
  
  while scoville[0] < K:
    if len(scoville) < 2:
      count = -1
      break
    else:
      mixScoville = scoville[0] + scoville[1] * 2
      heapq.heappop(scoville)
      heapq.heappop(scoville)
      heapq.heappush(scoville, mixScoville)
      count += 1
        
      # arr1 = heapq.heappop(scoville)
      # arr2 = heapq.heappop(scoville)
      # heapq.heappush(scoville, arr1 + arr2 * 2)
      # count += 1
      
  return count