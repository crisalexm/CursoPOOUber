from Account import Account
from car import *
from Payment import *

if __name__ == "__main__":
    print ("Hola Mundo")
    car = Car("AMS234", Account("Cristhian Martínez", "ANDA876", "cristhian@python.com", "1234"))
    print(vars(car))
    print(vars(car.driver))
     
