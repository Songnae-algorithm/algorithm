import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    i = 0
    count = 0
    check = False
    length = len(scoville)
    
    while scoville[0] < K:
        mixScoville = scoville[0] + scoville[1] * 2
        heapq.heappop(scoville)
        heapq.heappop(scoville)
        count += 1
        heapq.heappush(scoville, mixScoville)
        
                

    