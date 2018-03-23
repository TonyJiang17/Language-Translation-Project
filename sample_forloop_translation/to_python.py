#functions: expr(L), asgnexpr_python(L), bodyexpr_python(L), and bodyexpr_python(L)
#Objective: convert listed s-expression of for-loop syntax in SAS into for-loop syntax in python

#SAS syntax s-expression in lists
sexp = ['prog', ['doexpr', 'do', ['asgnexpr', 'n', '=', 1], 'to', 5, ['bodyexpr', 'put hello'], ';'], 'end', ';']
print(sexp)

#Delete prog and combine nested lists into one complete list (General)
def expr(L):
  ans = []
  for index in L:
    if type(index) != type([]):
      if index != 'prog' and index != 'expr':
        ans = ans + [index]
    else:
      ans = ans + expr(index)
  return ans

print(expr(sexp))
listExpression = expr(sexp)

#convert to python assignment syntax 
def asgnexpr_python(L):
  if L[0] == "asgnexpr":
    return str(L[1]) + " in range (" + str(L[3]) + ", " + str(L[5]) + "):"


#convert to python body syntax 
def bodyexpr_python(L):
  if L[0] == "bodyexpr":
    output = ""
    for x in range(1,len(L)-1):
      output = output + str(L[x]) + " "
  return output


#convert to python for-loop syntax in list (Specific to SAS for loop only)
def doexpr_python(L):
  if L[0] == "doexpr" and L[2] == "asgnexpr" and L[8] == "bodyexpr":
    asgnL = L[2:8]
    bodyL = L[8:11]
    return "for " + asgnexpr_python(asgnL) + "\n" + "  " + bodyexpr_python(bodyL) 
print(doexpr_python(listExpression))


  