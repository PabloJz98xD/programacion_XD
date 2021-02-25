# pesos = input("Cuantos pesos mexicanos tienes? ")
# pesos = float (pesos)
# valor_dolar = 20.5
# dolares = pesos / valor_dolar
# dolares = round(dolares, 2)
# dolares = str(dolares)
# print("Tienes $" + dolares + " dolares")

# menu = """
# Bienvenido al conversor de monedas 

# 1.- Pesos Mexicanos
# 2.- Pesos Colombianos
# 3.-Pesos Argentinos

# Elige una opcion: """

# opcion = int(input(menu))

# if (opcion == 1):
#     pesos = input("Cuantos pesos mexicanos tienes? ")
#     pesos = float (pesos)
#     valor_dolar = 20.5
#     dolares = pesos / valor_dolar
#     dolares = round(dolares, 2)
#     dolares = str(dolares)
#     print("Tienes $" + dolares + " dolares")
# elif (opcion == 2):
#     pesos = input("Cuantos pesos colombianos tienes? ")
#     pesos = float (pesos)
#     valor_dolar = 3875
#     dolares = pesos / valor_dolar
#     dolares = round(dolares, 2)
#     dolares = str(dolares)
#     print("Tienes $" + dolares + " dolares")
# elif (opcion == 3):
#     pesos = input("Cuantos pesos argentinos tienes? ")
#     pesos = float (pesos)
#     valor_dolar = 65
#     dolares = pesos / valor_dolar
#     dolares = round(dolares, 2)
#     dolares = str(dolares)
#     print("Tienes $" + dolares + " dolares")
# else:
#     print("Ingresa una opcion correcta por favor")

# 
# Conversor de monedas con funciones
# 
def conversor(tipo_pesos, valor_dolar):
    pesos = input("Cuantos pesos "+ tipo_pesos +" tienes? ")
    pesos = float (pesos)
    dolares = pesos / valor_dolar
    dolares = round(dolares, 2)
    dolares = str(dolares)
    print("Tienes $" + dolares + " dolares")


menu = """
Bienvenido al conversor de monedas 

1.- Pesos Mexicanos
2.- Pesos Colombianos
3.- Pesos Argentinos

Elige una opcion: """

opcion = int(input(menu))

if (opcion == 1):
    conversor("mexicanos", 21.2)
elif (opcion == 2):
    conversor("colombianos", 3875)
elif (opcion == 3):
    conversor("argentinos", 65)
else:
    print("Ingresa una opcion correcta por favor")