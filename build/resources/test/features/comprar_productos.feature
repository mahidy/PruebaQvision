Feature: Compra exitosa de productos desde la pagina web saucedemo

@CompraExitosa
Scenario Outline: Se desea agregar diferentes productos al carrito para ser comprados de manera exitosa
Given el usuario ingresa a la pagina web con sus credenciales correctos <usuario> y <contrasena>
When el usuario selecciona el producto a comprar <producto1> y <producto2>
And el usuario continua con el flujo de la compra ingresando los datos solicitados <nombre> <apellido> <codigoPostal> para realizar la compra
Then el usuario deberia visualizar el mensaje de la compra exitosa
Examples:
| usuario        | contrasena |  producto1           |   producto2              |nombre   |apellido  |codigoPostal|
| standard_user  |secret_sauce | Sauce Labs Backpack | Sauce Labs Fleece Jacket |Mahidy   |Casanova  |43002       |
| performance_glitch_user  |secret_sauce | Sauce Labs Bolt T-Shirt | Sauce Labs Onesie |Viviana   |Casanova  |35352       |