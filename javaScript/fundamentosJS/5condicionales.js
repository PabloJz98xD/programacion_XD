var pablo = {
    nombre: 'Pablo',
    apellido: 'Zuniga',
    edad: 23
  }

function  imprimirSiEsMayorDeEdad(persona) {
    console.log(`${persona.nombre} es ${persona.edad >= 18 ? 'mayor' : 'menor'} de edad`) //Se esta utilizando operador ternario.
}