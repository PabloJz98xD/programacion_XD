var pablo = {
    nombre: 'Pablo',
    apellido: 'Zuniga',
    edad: 23,
    peso: 70 
  }

  console.log(`Al inicio del ano ${pablo.nombre} pesa ${pablo.peso}kg`)
  
//   Ejemplo de Funcion sin Arrorw (=>)
//   funcion aumentarDePeso (persona) {
//       return persona.peso += 200
//   }

const   INCREMENTO_PESO = 0.2
const DIAS_DEL_ANO = 365

const aumentarDePeso = persona => persona.peso += INCREMENTO_PESO
const adelgazar = persona => persona.peso -= INCREMENTO_PESO

for (var i = 1; i <=DIAS_DEL_ANO; i++){
    var random = Math.random()

    if (random < 0.25) {
        aumentarDePeso(pablo)
    } else if (random < 0.5){
        adelgazar(pablo)
    }
}
console.log(`Al final del ano ${pablo.nombre} pesa ${pablo.peso.toFixed(1)}kg`)