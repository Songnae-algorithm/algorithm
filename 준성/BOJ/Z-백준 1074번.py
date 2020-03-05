# 완료 (다시 0회)
def z(length, x = 0, y = 0):
    global count
    if length == 1:
        if x == r and y == c:
            print(count)
        
        count += 1
        return
    else:
        z(length // 2, x, y)
        z(length // 2, x, y + length // 2)
        z(length // 2, x + length // 2, y)
        z(length // 2, x + length // 2, y + length // 2)
            

n, r, c = map(int, input().split())
count = 0
z(2 ** n)