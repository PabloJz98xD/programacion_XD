var pablo = {
    nombre: 'Pablo',
    apellido: 'Zuniga',
    edad: 23
  }
  
  var areli = {
    nombre: 'Areli',
    apellido: 'Morales',
    edad: 17
  }
  
  function imprimirNombreEnMayusculas({ nombre }) {
    console.log(nombre.toUpperCase())
  }
  
  imprimirNombreEnMayusculas(pablo)
  imprimirNombreEnMayusculas(areli)
  // imprimirNombreEnMayusculas({ nombre: 'Pepito' })
  imprimirNombreEnMayusculas({ apellido: 'Gomez' })
  // ===============
  // ===============
  //Se pueden modificar los objetos con los siguientes ejemplos
  // ===============
  // ===============
  function imprimirNombreEnMayusculas(persona) {
    // var nombre = persona.nombre
    var { nombre } = persona
    console.log(nombre.toUpperCase())
  }
  
  imprimirNombreEnMayusculas(pablo)
  imprimirNombreEnMayusculas(areli)
  // imprimirNombreEnMayusculas({ nombre: 'Pepito' })
  // imprimirNombreEnMayusculas({ apellido: 'Gomez' })
  
  function cumpleanos(persona) {
    return {
      ...persona,
      edad: persona.edad + 1
    }
  }