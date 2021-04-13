//El uso de decimales se pude manejar de la siguiente manera.
var precioXD = 20.9
var total = math.round(precioXD * 100 * 3 ) / 100
//O se puede seleccionar cuantos decimales queremos utilizar.
var total2 = total.toFixed(3)
//Para pasarlo de nuevo a float
var total3 = parseFloat(total2)