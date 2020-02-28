def solution(phone_book):
  for i, value in enumerate(phone_book):
    for k in range(0, len(phone_book)):
      if i == k:
        continue
      result = phone_book[k].startswith(value)
      
      if result == True:
        return False
          
  return True
    