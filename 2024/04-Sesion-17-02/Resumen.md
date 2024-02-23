1. Para el métoido POST, siempre se quita `id`, y auditoría, a excepción de `state`.
2. Siempre de las llaves foranea, se debe dejar el nombre de la entidad a relacionar y la llave primaría de la entidad foranea. 
    * Ejemplo: 
    - Entidad `Persona` tiene la llave pk `id` 
    - Entidad `Usuario` tiene la llave pk `id`, y tiene la llave foranea `persona_id`
    - Por lo tanto, el json, debe ser, todos los atributos que desee enviar, más el foraneo: 
    ```json
        {
            "user":"...",
            "person":{
                "id":2
            }
        }
    ``` 

    # Actividad: 

    * getList [id, name, description, state is True, deletedAt id null]
    * getList [id, person(nombre completo), numero documento]=> personas
    * getList [id, username, person(nombre completo), state] = usuarios

    SELECT 
id,
		concat(first_name,'  ',last_name) as person
	FROM 
		person
	WHERE 
        deleted_at IS NULL