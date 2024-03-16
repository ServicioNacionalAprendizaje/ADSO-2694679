# DTO

1. Entity
    AClass
    Class
2. IRepository
    Class [interface]
3. IService
    Class [interface]
4. Service
    AClass
    Class
5. Controller
    AClass
    Class
6. DTO
    AClass
    Class
    Class [interface]


# DTO: 

DTO, o "Data Transfer Object" (Objeto de Transferencia de Datos), es un patrón de diseño utilizado en el desarrollo de software para encapsular y transferir datos entre distintas capas de una aplicación. Estos objetos son utilizados principalmente para transportar datos entre el backend y el frontend, o entre diferentes componentes de un sistema distribuido. Los DTOs suelen contener únicamente los datos necesarios para una operación específica, evitando la sobrecarga de información y facilitando la comunicación eficiente entre los distintos componentes del sistema. Su uso promueve la cohesión, la modularidad y la claridad en el diseño de software.


```java
    @Entity
    @Table(name = "module")
    public class Module  extends ABaseEntity { 
        @Column(name = "name", length = 50, nullable = false)
        private String name;
        
        @Column(name = "route", length = 50, nullable = false)
        private String route;
        
        @Column(name = "description", length = 50, nullable = false, unique = true)
        private String description;

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}

        public String getRoute() {return route;}

        public void setRoute(String route) {this.route = route;}

        public String getDescription() {return description;}

        public void setDescription(String description) {this.description = description;}        
    }
```

Si sebe que el anterior código representa una entidad. Se puede decir que `name`, `route` y `descrition` son opcionales para ser dadas como respuesta a una petición. 

Lo anterior indica que el usuario podría regresar los datos `name`, `route` y `description` de manera personalizada, si quisiera, podría regresar uno, dos, o los tres, o en su defecto, otro valor personalizado, ejemplo, `code` ,el cual corresponde a `user_id + name` y `descripcion, que se compone de name + descripcion`

De acuerdo con lo anterior, el DTO se plantería de la siguiente manera. 

```java
    public interface IModuleDto {
        String getName();
        String getRoute();
        String getDescription();
    }
```

El objetivo de generar esos métodos que definen que hacer, pero no concen el como, en otras palabras, significa, que ese IModuleDto va a servir como contrato.

El contrato de este DTO el llenado con la capa responsable de manejar los datos, es decir, `IRepository`

```java
    @Query(value = " SELECT "
                + "	id,"
                + "	name as module,"
                + " route, "
                + " description, "
                + " state "
                + "	FROM "
                + "	module "
                + "	WHERE "
                + " deleted_at IS NULL", nativeQuery = true)
	List<IModuleDto> getList();
```

De acuerdo con lo anterior, el DTO `IModuleDto` esta disponible para llenar  los métodos `String getName(); String getRoute();  String getDescription();`, por lo tanto, estos encapsulamientos, pueden ser llenados únicamente si la consulta estan con los nombres explicitos. Cabe resaltar que todo método de encapsulamiento inicia por `get` y son escritos en `calmelCase`, es decir, para los anteriores métodos, los atributos correspondientes sin `name, route y description`.

Si se revisa la anterior consulta, esta devuelve `id, module, route, description y state`, por tanto, dicho DTO no esta en capacidad de regresar todos los datos, es decir, `id, module y state` se perderán.