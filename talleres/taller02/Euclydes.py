def gcd_euclid(p,q):
    
    if q == 0:
        return p
    
    return gcd_euclid(q, p%q)

print("El resultado es ", gcd_euclid(60,48))