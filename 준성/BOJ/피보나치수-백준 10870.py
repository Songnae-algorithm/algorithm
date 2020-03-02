def fibonachi(num):
    if num <= 1:
        return num
    else:
        return fibonachi(num - 1) + fibonachi(num - 2)

num = int(input())
print(fibonachi(num))