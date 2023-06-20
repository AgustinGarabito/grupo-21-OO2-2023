# Grupo-21-OO2-2023

## Instrucciones para la ejecución del proyecto

1- Crear la base de datos grupo-21-oo2-2023

2- Descargarse el proyecto y en consola, moverse hasta la carpeta donde se encuentra y ejecutar el comando "mvn clean install"

3- Configurar el archivo application.yml con el user y la contraseña de su workbench

4- Ejecutar el proyecto, una vez ejecutado darle a stop para insertar user y userRole a la BD

5- Ejecutar el script de BD que se encuentra en la branch main

6- Ahora si, ejecutar el proyecto

## Sistema de Smart City orientado al predio de la UNLa

Se espera que el TP cuente con los siguientes puntos:

1. Definir una solución de IOT por integrante. Integrantes del grupo con la solución elegida:

* Estacionamiento inteligente (Smart Parking). Sensores o cámaras que
detectan lugares libres y ocupados por autos.

* **Patricia Palmieri [Alumbrado inteligente :bulb:]:** Sensores de luz que prenden o apagan alumbrado
según sea necesario. Mi rama es PatriciaP, link: https://github.com/AgustinGarabito/grupo-21-OO2-2023/tree/PatriciaP

* **Agustín Garabito [Cuidado del espacio verde inteligente]:** Sensores de humedad que rieguen
automáticamente el pasto si la humedad ambiente es baja. Mi rama es AgustinG, link: https://github.com/AgustinGarabito/grupo-21-OO2-2023/tree/AgustinG

* Baños ocupados. Cámaras que detectan cuando un baño está siendo
higienizado para avisar que no se puede usar.

* Luces automáticas. Sensores o cámaras que indiquen si un aula está libre u
ocupada de forma que prendan la luz y/o accionan la apertura o cierre de
cortinas.

* Recolectores inteligentes. Sensores que informen cuando un contenedor está
lleno. Sensores que accionen limpiadores automáticos en zonas específicas.
Cámaras que notifiquen de uso indebido del contenedor. Etc.

2. Se puede asumir que se puede contar con el dispositivo IOT necesario para resolver
la tarea física de la solución.
3. Tener una sección de ABM (la baja debe ser lógica) donde se pueda administrar el
uso y agregado de los dispositivos de cada solución al sistema.
4. Simular con archivos Java ejecutable (main class) la obtención de datos por parte de
los dispositivos.
5. Tener una sección donde se visualicen los datos de los eventos de cada solución.
Dicha sección debe funcionar como reportes, se tiene que poder hacer filtros varios
(fecha, dispositivo, estado del dispositivo, etc). A definir por cada estudiante.
6. El sistema debe tener un usuario administrador (el cual tendrá acceso total a
plataforma). Y un usuario auditor, el cual tendrá acceso solo a los informes.


Se espera que en la plataforma como mínimo pueda:
1. Iniciar sesión como Administrador o Auditor.
2. Como Administrador

    a. Dar de alta un tipo de dispositivo.

    b. Dar de alta un dispositivo de un tipo en particular.

3. Registrar un evento de un dispositivo específico.
4. Como Auditor

    a. Ingresar en la sección de reportes y solicitar información de diferentes
    eventos en el sistema.
5. Cerrar sesión

### **Predio de la Universidad dividido por número por sectores**

![imagen_predio](https://github.com/AgustinGarabito/grupo-21-OO2-2023/blob/main/Nro_de_sectores_del_predio.jpg)



