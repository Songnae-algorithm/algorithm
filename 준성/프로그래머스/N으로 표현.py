#완료 (다시 0회)
answer = -1

def dfs(n, number, cnt, prev):
    global answer
    temp = n
    
    if cnt > 8:
        return;
    
    if number == prev:
        if answer == -1 or answer > cnt:
            answer = cnt
        return
    
    for i in range(8 - cnt):
        dfs(n,number, cnt+i+1, prev - temp);
        dfs(n,number, cnt+i+1, prev + temp);
        dfs(n,number, cnt+i+1, prev * temp);
        dfs(n,number, cnt+i+1, prev / temp);
			
        temp = temp*10 + n;

def solution(N, number):
    dfs(N, number, 0, 0)
    return answer