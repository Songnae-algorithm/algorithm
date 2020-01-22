def solution(skill, skill_trees):
  result = []
  count = 0
  isSkillTree = True
  for value in skill_trees:
    for i in range(0, len(value)):
      if skill.find(value[i]) != -1:
        result.append(value[i])
            
    for k in range(0, len(result)):
      if result[k] != skill[k]:
        isSkillTree = False
        break
    
    if isSkillTree == True:
      count += 1
    else:
      isSkillTree = True
    result = []
              
  return count