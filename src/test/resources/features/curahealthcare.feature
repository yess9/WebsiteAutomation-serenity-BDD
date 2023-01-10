#Autor: Yessica Huillca Lloclle

Feature: Funcionalidad Appointment Cura Healthcare
  Rule: Como usuario quiero realizar un reserva de cita medica de forma exitosa con mis datos ingresados
    Background: Ingresar a la web
      Given que el usuario ingrese a la web

    @flow-success
    Scenario Outline: Validar que la reserva de la cita medica fue exitosa
      When ingreso <userName> y <password>
      And doy clic en el boton Login que dirige a realizar la reserva de cita medica
      And selecciona <facility>,hago check <apply> y selecciono <healthcareProgram>,<visitDate> e ingresar <comentario>
      Then verifica la reserva de cita medica
      Examples:
        | userName | password           | facility                     | apply | healthcareProgram | visitDate  | comentario     |
        | John Doe | ThisIsNotAPassword | Seoul CURA Healthcare Center | Yes   | Medicaid          | 09/01/2023 | Sin comentario |



