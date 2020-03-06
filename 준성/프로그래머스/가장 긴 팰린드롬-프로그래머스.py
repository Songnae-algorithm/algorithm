# 효율성2 X
def palindrome(string):
    if len(string) <= 1:
        return True
    
    if string[0] == string[-1]:
        return palindrome(string[1:-1])
    else:
        return False

def solution(s):
    for cut in range(len(s), 0, -1):
        for start in range(0, len(s)):
            cutStr = s[start:start+cut]
            # 자른 string 전달
            if palindrome(cutStr) == True:
                return len(cutStr)
            
            if start+cut >= len(s):
                break
            