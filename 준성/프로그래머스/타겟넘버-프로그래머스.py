# 완료(다시 0회)
count = 0

def dfs(numbers, index, sum, target):
    global count
    if index == len(numbers):
        if target == sum:
            count += 1
        return
    else:
        dfs(numbers, index+1, sum+numbers[index], target)
        dfs(numbers, index+1, sum-numbers[index], target)
        
def solution(numbers, target):
    dfs(numbers, 0, 0, target)
    return count