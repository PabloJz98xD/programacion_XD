
var pablo = {
    nombre: 'Pablo',
    apellido: 'Zuniga',
    edad: 23
  }

  const MAYORIA_DE_EDAD = 18

// const esMayorDeEdad = function (persona) {
//   return persona.edad >= MAYORIA_DE_EDAD
// }
const esMayorDeEdad = ({ edad }) => edad >= MAYORIA_DE_EDAD

function imprimirSiEsMayorDeEdad(persona) {
  if (esMayorDeEdad(persona)) {
    console.log(`${persona.nombre} es mayor de edad`)
  } else {
    console.log(`${persona.nombre} es menor de edad`)
  }
}

// ==== Ejemplo2 ======
function permitirAcceso(persona) {
  if (!esMayorDeEdad(persona)) {
    console.log('ACCESO DENEGADO')
  }
}
//===== Ejemplo2 con ArrowFunction =======
// Utilizando de nuevo el operador ternario
const permitirAcceso2 = ({edad}) => !esMayorDeEdad({edad}) ? console.log('Acceso denagado') : console.log('Adelante')
