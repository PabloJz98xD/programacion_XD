from account import Account


class Car:
    
    id = int
    licence = str
    driver = Account("","")
    passengeger = int

    def __init__(self, licnese, driver):
        self.licence  =  license
        self.driver  =   driver 