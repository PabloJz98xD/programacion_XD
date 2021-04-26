using System;
namespace coreEscuela.entidades{
    public class curso{
        public string uniqueId { get; private set; }
        public string nombre { get; set; }
        public tiposJornada jornada { get; set; }

        public curso()=> uniqueId = Guid.NewGuid().ToString();
    }
}