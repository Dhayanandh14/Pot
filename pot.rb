tot=0
n=gets.to_i
n.times{
  p=gets.to_i;
  last = p%10;
  remind = p/10;
  calculate = remind **last
  tot=tot+calculate;
}
 print tot