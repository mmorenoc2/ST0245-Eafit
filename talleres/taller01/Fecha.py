class Fecha:
    """Representacion de punto en 2 dimensiones"""

    def __init__(self, x):
        self.x = x
        
    def get_fecha(self):

      return self.x

    def get_dia(self):
      s = self.x % 100
      return s

    def get_mes(self):
      s = (self.x // 100) % 100
      return s

    def get_anio(self):
      s = self.x // 10000
      return s

    def  equals (self, other):     
      if (other.get_fecha() - self.x) == 0:
        f = True
        print("Las fechas son iguales")
      else:
        f = False
        print("Las fechas son diferentes")
        return f

    def compare (self, other):
      if other.get_fecha() < self.x:
          f = other.get_fecha() - self.x
          print("la fecha #1 va antes y la fecha #2 va despues")
      elif other.get_fecha() > self.x:
          f = other.get_fecha() - self.x
          print("la fecha #1 va antes y la fecha #2 va despues")
      else:
          f = 0
          print("Son iguales")
          return f
    



f1 =Fecha(20010819)
f2 =Fecha(20010819)

print(f1.get_dia())
print(f1.get_mes())
print(f1.get_anio())
print(f1.equals(f2))
print(f1.compare(f2))