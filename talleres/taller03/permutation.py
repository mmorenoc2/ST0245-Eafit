def permutations(base, stri):
  n = len(stri)
  if n == 0:
    print(base)
  else:
    for i in range(n):
      permutations(base + stri[i] , stri[0:i] + stri[i+1:n])

permutations(" ","abc")