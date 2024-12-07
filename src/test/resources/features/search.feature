Feature: Search by keyword

Background:
  Given USER ingresa a la pagina

  Scenario: Successfully searching and adding products to the cart
    When he ingresa el usuario "standard_user" y constraseña "secret_sauce"
    And he selecciona el boton de ingresar
    And he selecciona el primer producto "Sauce Labs Backpack" y el segundo producto "Sauce Labs Bike Light"
    Then he selecciona el carrito
    And he completa el formulario de compra "John" "Doe" "12345"
    And he finaliza compra
    Then he valida mensaje de compra exitosa "Thank you for your order!"



