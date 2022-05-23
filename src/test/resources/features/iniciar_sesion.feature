# language: es
Característica: Como administrador de Metis  deseo iniciar sesión en el aplicativo

@LoginExitoso
Escenario: Iniciar sesion exitoso
Dado que el usuario se encuentre en la pagina de Metis
Cuando ingrese sus credenciales
| usuario | contrasenia |
| demo    | demo        |
Entonces visualiza el texto de MENU