using Microsoft.AspNetCore.Mvc;

namespace netmicro.Controllers;

[ApiController]
[Route("[controller]")]
public class PersonaController : ControllerBase
{
    static List<Persona> personas = new List<Persona>()
    {
        new Persona(3,"Daniel Patiño", "Loja", "115303516", "presencial")
    };

    private readonly ILogger<PersonaController> _logger;

    public PersonaController(ILogger<PersonaController> logger)
    {
        _logger = logger;
    }

    [HttpGet(Name = "GetPersona")]
    public IEnumerable<Persona> Get(){
        return personas.ToArray();
    }

    [HttpPost(Name = "CrearPersona")]
    public string Post(Persona persona){
        personas.Add(persona);
        return "OK";
    }

}