def coversaciones(mensaje):
    print('Hola')
    print('Como estas')
    print(mensaje)
    print('Adios')

opcion= int(input('Elige una opcion: '))
if opcion == 1:
    coversaciones('Elegiste la opcion 1')
elif opcion == 2:
    coversaciones('Elegiste la opcion 2')
elif opcion == 3:
    coversaciones('Elegiste la opcion 3')
else:
    print('Escribe la opcion correcta')