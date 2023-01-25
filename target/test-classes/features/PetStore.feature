#language: es
  @PruebasWeb

Característica: Navegar en la web Demoblaze

  Como usuario de demoblaze
  Quiero acceder a la web
  Para realizar compras de laptops


  @Test_01
  Escenario: Dar de alta a un usuario
    Dado el usuario ingresa a la web

      | url                                  |
      | https://www.demoblaze.com/index.html |

    Cuando realice una alta nueva

      | usuario | clave      |
      | test_qa000001 | qa.testing01 |

    Entonces se creara correctamente el usuario

  @Test_02
  Escenario: Login y logout con el usuario dado de alta
    Dado el usuario ingresa a la web

      | url                                  |
      | https://www.demoblaze.com/index.html |

    Cuando complete el registro

      | usuario | clave      |
      | test_qa001 | qa.testing01 |

    Y desee cerrar sesión

  @Test_03
  Escenario: Agregar una laptop al carrito
    Dado el usuario ingresa a la web

      | url                                  |
      | https://www.demoblaze.com/index.html |

    Cuando complete el registro

      | usuario | clave      |
      | test_qa001 | qa.testing01 |

    Y agregue una laptop al carrito


  @Test_04
  Escenario: Comprobar la laptop en el carrito
    Dado el usuario ingresa a la web

      | url                                  |
      | https://www.demoblaze.com/index.html |

    Cuando complete el registro

      | usuario | clave      |
      | test_qa001 | qa.testing01 |

    Y agregue una laptop al carrito

    Entonces se comprueba que se agregó al carrito


