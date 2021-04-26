namespace coreEscuela.entidades 
{
    class escuela{
        string nombre;
        public string Nombre{
            get {return "Copia: " + nombre;}
            set {nombre = value.ToUpper();} //Creacion rapida con propfull
        }
        public int AnoDeCreacion {
            get; set;
        }
        public string Pais { get; set; }//Comando prop te crea el get y set de manera automatica
        public string Ciudad { get; set; }
        public tipoEscuela tipoEscuela { get; set; }
        
        // public escuela(string nombre, int ano)
        // {
        //     this.nombre=nombre;
        //     AnoDeCreacion=ano;
        // }

        public escuela(string nombre, int ano) => (Nombre,AnoDeCreacion) = (nombre,ano); //Igualacion por tuplas


        public escuela(string nombre, int ano,
                        tipoEscuela tipo,
                        string pais ="", string ciudad =""){
                            (Nombre,AnoDeCreacion) = (nombre,ano);
                            Pais = pais;
                            Ciudad = ciudad;
                        }
string line = System.Environment.NewLine;
        public override string ToString()
        {
            return $"Nombre:\"{Nombre}\", Tipo: {tipoEscuela}, {line}Pais: {Pais}, Ciudad {Ciudad}";
        }               //En lugar de usar \n => Se puede utilizar {system.Enviroment.NewLine}
    }
}