tot=0
n=int(input())
for i in range(0,n):
  p=int(input())
  last = p%10;
  remind = p//10;
  calculate = pow(remind,last)
  tot=tot+calculate
print (tot)