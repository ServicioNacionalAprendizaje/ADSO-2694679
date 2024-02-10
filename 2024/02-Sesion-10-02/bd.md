Person:
- id
- firstName
- lastName
- email
- phone
- dateOfBirth
- gender
- address

User:
- id
- username
- password
- personId (foreign key referencing Person)

UserRole:
- id
- userId (foreign key referencing User)
- roleId (foreign key referencing Role)

Role:
- id
- name
- description

ModuleRole:
- id
- moduleId (foreign key referencing Module)
- roleId (foreign key referencing Role)

Module:
- id
- name
- description
- route

ModuleView:
- id
- moduleId (foreign key referencing Module)
- viewId (foreign key referencing View)

View:
- id
- name
- description
- route