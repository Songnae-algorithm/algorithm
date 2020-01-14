def solution(n):
  i = 1
  while True:
    binary = bin(n)
    nextBinary = bin(n + i)

    if binary.count("1") == nextBinary.count("1"):
      return int(nextBinary, 2)
    else:
      i += 1
        