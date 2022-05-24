# language: es
Característica: Como administrador de Metis  deseo ingresar a la funcionalidad Block Validation

  @LoginExitoso
  Escenario: Ingresar a la a la funcionalidad Block Validation
    Dado que el usuario se encuentre en la pagina de Metis
    Cuando ingrese sus credenciales
      | usuario | contrasenia |
      | demo    | demo        |
    Y seleccione el submenu Form Validation
    Entonces visualiza el titulo Block Validation