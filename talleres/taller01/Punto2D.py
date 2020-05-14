import math

class Punto2D:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return self.x

    def get_y(self):
    		return self.y

    def radio_polar(self):
        return math.sqrt((self.x**2) + (self.y**2))

    def angulo_polar(self):
        return math.atan2(self.y, self.x)

    def dist_euclidiana(self, other):
    		return math.sqrt(((other.get_x() - self.x)**2)+((other.get_y() -self.y)**2))
p1 = Punto2D(10,20)
p2 = Punto2D(0,0)
print("Punto 1: (", p1.x, ",", p1.y, ")")
print("Punto 2: (", p2.x, ",", p2.y, ")")
print("Radio Polar:", p1.radio_polar())
print("Angulo Polar:", p1.angulo_polar())
print("Distancia Euclidiana:",  p1.dist_euclidiana(p2))