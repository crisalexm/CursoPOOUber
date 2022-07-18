from lib2to3.pgen2 import driver

from Account import Account

class Car:
    id = int
    license = str
    driver = Account("","")
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver 
