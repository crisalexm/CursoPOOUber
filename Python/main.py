from account import Account
from car import *

if __name__ == "__main__":
    print ("Hola Mundo")
    car = Car("AMS234", Account("Cristhian Martínez", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))
    
