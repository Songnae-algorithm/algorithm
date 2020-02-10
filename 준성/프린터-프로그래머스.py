def solution(priorities, location):
  # 완료(다시 0회)
    count = 0
    locationList = []
    for i in range(len(priorities)):
        locationList.append(i)
        
    while priorities:
        while priorities.index(max(priorities)) != 0:
            value = priorities.pop(0)
            index = locationList.pop(0)
            priorities.append(value)
            locationList.append(index)

        priorities.pop(0)
        index = locationList.pop(0)
        count += 1
        if index == location:
            return count