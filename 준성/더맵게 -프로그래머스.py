import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    count = 0
    
    while scoville[0] <= K:
        mixScoville = scoville[0] + scoville[1] * 2
        heapq.heappop(scoville)
        heapq.heappop(scoville)
        heapq.heappush(scoville, mixScoville)
        count += 1
        
        if scoville[0] < K and len(scoville) == 1:
            count = -1
            break
        
    return count