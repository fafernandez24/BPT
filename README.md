# Break Point Tamanaco - BPT🎾
_El proyecto es una aplicación de escritorio que ayuda a la creación, organización y visualización de torneos amateur de tenis en Caracas, Venezuela_

_Este además, permite (de parte de los juagdores) llevar un registro de como se van desarrollando los torneos donde participan ver tanto sus estadísticas como las de otros jugadores_

_Por último, tiene un  apartado para llevar al día los pagos de cada jugador y generar un reporte de estos mismos_

## Comencemos 🚀
### Pre-requisitos 📋
_1. Tener descargado la aplicación "NetBeans":_
*[Cómo instalar NetBeans IDE 26 + Java JDK 24 Windows 11 (64 bit) [Actualización 2025] Programación...](https://www.youtube.com/watch?v=3X9_lXetIHQ) -Tuturial de cómo instalar NetBeans
  
_2. Descargar el tipo de letra "Bebas Neue":_
  *[Google Fonts](https://fonts.google.com/specimen/Bebas+Neue) - Instalador del tipo de letra
  
    2.1. Cuando se termine de descargar el tipo de letra tendrá que dirigirse a sus descargas
    2.2. Descomprimir el archivo "Bebas_Neue.zip"
    2.3. Abrir el archivo "BebasNeue-Regular"
    2.4. Darle al botón ""Install"

_3. Añandir la librería del CalendarW_
_- En NetBeans, con el proyecto abierto deberá:_

    3.1. Darle a "Tools"
    3.2. Buscar la opción "Pallete"
    3.3. Seleccionar "Swing/AWT Components"
    3.4. Seleccionar "New Category"
    3.5. Darle de nombre "CalendarW"
    3.6. Marcarlo y Seleccionar "Add from JAR..."
    3.7. Buscar el JAR de "CalendarW"
    3.8. Colocar las componentes a "CalendarW"

_4. Añadir la librería del Gson_
_-En NetBeans, con el proyecto abierto deberá:_

    4.1 Abrirás carpeta "Dependencies"
    4.2 Tendrás que darle click derecho al archivo "gson-2.13.1.jar"
    4.3 Seleccionar la opción "Mannualy Install artifact"
    4.4 Tendrás que dar click  en el botón "Browser"
    4.5 Buscar la carpeta en donde tienes alojado el proyecto
    4.6 Al abrir la carpeta del proyecto encontrarás un archivo llamado "gson-2.13.1"
    4.7 Hazle click y luego oprime el botón "Select"
    4.8 Por último, darle al botón "Install Locally" y esperar a que la librería se descargue


### Pequeños detalles 🤖 
_Para poder disfrutar de la variedad de interfaces que utiliza nuestro programa primero deberás iniciar sesión_

_Solo hay un pequeño detalle, cada interfaz tiene diferentes usuarios que permiten el uso exclusivo de ciertas funciones_

_Para poder probar todos tendrás que iniciar sesión con distintos usuarios_

**1. Organizador**

    - ID: 31703150 | Password: 0406
    - ID: 11032757 | PASSWORD: 11032757
    - ID: 31307188 | PASSWORD: carlospinto2005
    - ID: 31101453 | PASSWORD: Messi48

**2. Jugador**

    -ID: 31703150 | Password: 0406
    -ID: 11032757 | Password: 11032757
    -ID: 31307188 | Password: carlospinto2005
    -ID: 31101453 | Password: Messi48
    -ID: 8242036  | Password: 8242036
    -ID: 12554429 | Password: 12554429
    -ID: 24723196 | Password: 24723196
    -ID: 19736423 | Password: 19736423
    -ID: 16563208 | Password: 16563208
    -ID: 13311058 | Password: 13311058
    -ID: 20413158 | Password: 20413158
    -ID: 20413159 | Password: 20413159
    -ID: 15250012 | Password: 15250012
    -ID: 11759846 | Password: 11759846
    -ID: 15715862 | Password: 15715862
    -ID: 17058404 | Password: 17058404
    -ID: 17175404 | Password: 17175404
    -ID: 17125640 | Password: 17125640
    -ID: 8250654  | Password: 8250654
    -ID: 12450654 | Password: 12450654
    -ID: 13609199 | Password: 13609199
    -ID: 12160199 | Password: 12160199
    -ID: 15394189 | Password: 15394189
    -ID: 30674116 | Password: 30674116
    -ID: 15715865 | Password: 15715865

**3. Administrador**

    - ID: 31703150 | Password: 0406
    - ID: 11032757 | PASSWORD: 11032757
    - ID: 31307188 | PASSWORD: carlospinto2005
    - ID: 31101453 | PASSWORD: Messi48

### Uso del programa 🔥
_A la hora de abrir el programa te encontrarás con una hermosa pantalla de inicio de sesión! Donde podrás ingresar desde tres distintas maneras..._

_Como Organizador, como Jugador o como Administrador_

_Acá utilizarás alguno de los usuarios que se mencionaron con anterioridad..._

_Ahora te daré un pequeño recorrido por cada una de las interfaces y como trabajar en ellas!!_

#### Organizador 💼

* Como organizador tendrás un sin fin de funcionalidades y métodos para trabajar!
* Para empezar a trabajar primero tendrás que crear un torneo según  la categoría que desees (singles, dobles o en equipo), ingresando datos como el nombre del torneo, el costo, la categoría, entro otros...
* Luego podrás agregar jugadores a tu torneo, o en caso de que ya estén en la base de datos, podrás agregarlo de una manera más rápida, ingresando simplemente su cédula, y el resto de los campos se llenarán automaticamente
* Después tendrás que elegir el formato que desees que se desempeñe el torneo (si es con Formato Liga, Fase de Grupos o un torneo con Muerte Súbita)
* Al final, podrás visualizar el torneo que hayas creado en la pestaña "Ver torneos en curso" (En esta pestaña podrás: modificar el torneo que estás viendo para agregar, eliminar o modificar jugadores, y agregar los partidos correspondientes al torneo)
* También existen otras funcionalidades como el buscar algún jugador que exista en la base de datos y visualizar los partidos próximos junto a un calendario para poder ubicarte mejor
  
#### Jugador 🏃

* Como Jugador podrás visualizar varias estadísticas para estar al tanto de como va todo!
* Podrás ver los torneos en los que te encuentres inscrito, facilitandote el ponerte al pendiente de la situación de los torneos
* Además podrás revisar tanto tus estadísticas como las de otros jugadores en la parte de "Buscar jugador"
* Por último, también dispones de una tabla con los próximos partidos junto a un calendario para verificar la fecha de los mismos

#### Administrador 📈

* Como Administrador estás en la capacidad de llevar a mano todos aquellos procesos internos del torneo!
* Esta interfaz te permite visualizar el estado financiero del torneo, y además observar si todos los jugadores inscritos han pagado la cuota correspondiente a su torneo
* Como funcionalidad extra tenemos la capacidad de observar unos reportes con un par de estadísticas, como el torneo con más jugadores, el jugador con mayor desempeño, entre otros...


_Ya te dimos un pequeño repaso por cada espacio de nuestro programa, espero que logres sacarle el mayor provecho y que tengas una experiencia amena!!_

## Autores ✒️

* Freddy Fernandez
* Carlos Hernandez
* Carlos Pinto
