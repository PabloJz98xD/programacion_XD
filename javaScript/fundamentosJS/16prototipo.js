function persona(nombre, apellido, altura){
	this.nombre = nombre
	this.apellido = apellido
	this.altura = altura
}
persona.prototype.soyAlto = function (){
	this.altura > 1.7 ? console.log(`${this.nombre} es alto`) : console.log(`${this.nombre} es bajo`)
} 

var pablo = new persona('Pablo', 'Zuniga', 1.70)
var areli = new persona ('Areli', 'Morales', 1.52)
pablo.soyAlto()
areli.soyAlto()