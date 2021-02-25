from car import Car
from UberX import UberX
from account import Account


if __name__ == "__main__":
    print("Hola XD")
    car = Car ("AMW123", Account("Pablo Zuniga", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))
 
    uberX = UberX("LASJ123", Account("Pablo Zuniga", "ASD"),"Nissan", "March")
    print(vars(uberX))
    print(vars(uberX.driver))