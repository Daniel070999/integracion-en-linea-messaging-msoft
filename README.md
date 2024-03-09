# Integración en línea MSOFT - Patrones de Integración Empresarial

Este proyecto se centra en la integración en línea utilizando patrones de integración empresarial. A continuación, se describen los pasos para ejecutar el proyecto:

1. **netmicro**:
   - Dirígete a la carpeta llamada `netmicro`.
   - Ejecuta el siguiente comando:
     ```
     dotnet build
     dotnet run
     ```
   - Verifica en: [http://localhost:5030/Persona](http://localhost:5030/Persona)

2. **pymicro**:
   - Una vez que el primer proyecto esté en funcionamiento, ve a la carpeta llamada `pymicro`.
   - Ejecuta el siguiente comando:
     ```
     py main.py
     ```
   - Verifica en: [http://127.0.0.1:5000/persons](http://127.0.0.1:5000/persons)

3. **spring-caemel-integration**:
   - Por último, dirígete a la carpeta llamada `spring-caemel-integration`.
   - Ejecuta los siguientes comandos:
     ```
     mvn clean package -DskipTests
     java -jar target\spring-camel-integration-1.0.0-SNAPSHOT.jar
     ```
   - Verifica en: [http://localhost:8080/createperson](http://localhost:8080/createperson)

Para crear el proyecto desde cero, puedes seguir los pasos detallados [**aquí**](https://drive.google.com/file/d/1rhPfOcEsUt3DlXToJqfpEkC-aGhI_1HC/view?usp=sharing). 📄
