/*
	Crear base de datos, pero no se muestra hasta que esta tenga información.
*/
use registro

/*Crer collections*/
db.createCollection("personas")
db.createCollection("materias")

/*Agregar registros */
db.personas.insert({
	tipoDocumento:"CC",
	documento:"1079",
	nombre:"Jesús Ariel",
	apellido:"González Bonilla"
})

db.personas.insert({
	tipoDocumento:"CC",
	documento:"1080",
	nombre:"María Sofia",
	apellido:"Peréz"
})

db.personas.insert({	
	documento:"1080",
	nombreCompleto:"Andrés Mauricio Goméz",
	tefono:"3432143432"
})

db.personas.insert({	
	documento:"20243",
	nombreCompleto:"Viviana González",
	tefono:"43432",
	estado:true,
	capital: 2935.25
})

/*Tenere en cuenta*/
db.persona.insert({	
	Documento:"98432423",
	NombreCompleto:"Diana Patricia",
	teléfono:"43432",
	estados:true,
	capital: 234324.25
})


/*Agregar document masivos */
db.materias.insert(
	[
		{
		"codigo":"C25",
		"descripcion":"Base de datos",
		"credito":4,
		"motor":{
					"tipo1":{
						"descripcion":"Relacional",
						"lenguaje":{
							"Lengiuaje":"QUERY - Lengiuaje estructurado de consulta",
							"definicion":"DDL - Lengiuaje de definición de datos",
							"manipulacion":"DML - Lengiuaje de manipulación de datos"
						}
					},
					"tipo2":{
						"descripcion":"No Relacional",
						"lenguaje":"json"
					}
				}
		},
		{
			"codigo":"C23",
			"descripcion":"Java Script",
			"credito":2
		}
	]
)

/*Mostrar los document de la base de datos*/
db.personas.find()

db.personas.find().pretty()


