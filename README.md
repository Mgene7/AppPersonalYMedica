# App Personal y Médica

## Resumen del Proyecto
Aplicación móvil de asistencia médica diseñada para facilitar el acceso rápido al historial de salud, tratamientos preventivos y contactos de emergencia del usuario (creada para el caso clínico de Isabel Bobadilla). El proyecto está construido bajo la arquitectura nativa de Android (Patrón MVC / Event-Driven).

**Versiones técnicas:**
* **Lenguaje:** Java y XML
* **Versión de Android:** API 24 (Android 7.0 Nougat) o superior
* **Versión de AGP (Android Gradle Plugin):** 9.0.1

## Características Principales
* **Splash Screen:** Pantalla de carga inicial implementada con `Thread`.
* **Intents Implícitos (5):**
  - Ubicación del hospital (Mapa).
  - Búsqueda de farmacias en línea (Web).
  - Llamada rápida a familiar de contacto (Teléfono).
  - Aviso al médico personal sobre una convulsión (Correo).
  - Alerta S.O.S de emergencia (SMS).
    
* **Intents Explícitos (3):**
  - Navegación a las secciones internas de Patologías Previas, Medicamentos y Primeros Auxilios.

## Control de Versiones
El proyecto cuenta con la rama principal y la rama secundaria `feature/intents` requerida para la integración de nuevas funcionalidades.

## Equipo de Desarrollo
* Mgene7: Diseño base, Splash Screen y 5 Intents Implícitos.
* @JhomiraP: Integración de 3 pantallas e Intents Explícitos.

## Capturas de Pantalla

<img width="250" alt="WhatsApp Image 2026-10-07 at 05 51 27 (1)" src="https://github.com/user-attachments/assets/e60a1db1-437a-483c-834a-cdd46ca968d8" />

<img width="250" alt="WhatsApp Image 2026-10-07 at 05 52 42" src="https://github.com/user-attachments/assets/b9d4747b-eabb-42ed-a325-7a8aac902d01" />

<img width="250" alt="WhatsApp Image 2026-10-07 at 05 55 25" src="https://github.com/user-attachments/assets/c4c4131f-6491-4d31-b821-4879d2db67c9" />

<img width="250" alt="WhatsApp Image 2026-10-07 at 05 55 26" src="https://github.com/user-attachments/assets/50b6b8c7-9b43-4a82-9dd2-87868e2aee82" />

<img width="720" height="1560" alt="WhatsApp Image 2026-10-07 at 05 55 26 (1)" src="https://github.com/user-attachments/assets/535b0bbe-4515-49d5-8fb6-454bc84b3f88" />

## Generación y Prueba del APK (Debug)
El archivo ejecutable (APK) necesario para evaluar esta aplicación se encuentra en la ruta estándar del proyecto:
`app/build/outputs/apk/debug/app-debug.apk`
