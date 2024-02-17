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

    * getListRole [id, name, description, state is True, deletedAt id null]