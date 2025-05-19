
# SimpleLoginApp
Einfache Android-App mit Login- und Registrierungsfunktion: Nutzer können sich registrieren, einloggen und werden nach erfolgreichem Login auf eine Willkommensseite weitergeleitet. Die Zugangsdaten werden lokal mit SharedPreferences gespeichert.


## Funktionen

* **Registrierung:** Ermöglicht die erstmalige Speicherung von Benutzername und Passwort.
* **Login:** Überprüft eingegebene Anmeldedaten gegen gespeicherte Daten.
* **Navigation:** Ermöglicht den Übergang zu einer zweiten Ansicht nach erfolgreichem Login oder direkt.
* **Anzeige:** Zeigt eine personalisierte oder allgemeine Willkommensnachricht an.
* **Benachrichtigungen:** Gibt kurze Rückmeldungen an den Benutzer.

## Verwendete Android-Komponenten und Technologien

* **EditText:** Für die Eingabe von Benutzername und Passwort.
* **Button:** Löst Aktionen zum Speichern/Einloggen und zur Navigation aus.
* **Intent:** Ermöglicht die Navigation zwischen verschiedenen Bildschirmen (Activities).
* **TextView:** Zur Anzeige von Text, wie der Willkommensnachricht.
* **Toast:** Zeigt kurze Benachrichtigungen für den Benutzer an.
* **SharedPreferences:** Zur lokalen Speicherung von Benutzerdaten.
* **Java:** Die primäre Programmiersprache für die Android-Entwicklung.
* **Android SDK:** Das Software Development Kit für die Android-Plattform.
* **AndroidX AppCompat Library:** Eine Bibliothek, die Abwärtskompatibilität für neuere Android-Funktionen bietet.

## Setup-Anleitung

1.  **Repository klonen:**
    ```bash
    git clone https://github.com/NiiKez/SimpleLoginApp.git
    ```
2.  **In Android Studio öffnen:** Öffnen Sie das geklonte Projekt in Android Studio.
3.  **Erstellen und ausführen:** Erstellen Sie die Anwendung und führen Sie sie auf einem Android-Emulator oder einem physischen Android-Gerät aus.

## Anwendungshinweise

1.  **Erster Start:** Geben Sie Benutzername und Passwort ein und betätigen Sie die Speicher-/Login-Schaltfläche.
2.  **Nachfolgende Starts:** Geben Sie die Anmeldedaten ein und betätigen Sie die Login-Schaltfläche.
3.  **Direkte Navigation:** Betätigen Sie die "Weiter"-Schaltfläche, um zur nächsten Ansicht zu gelangen.


## Mögliche Verbesserungen

* Sicherere Passwortspeicherung.
* Erweiterte Eingabevalidierung.
* Verbesserte Benutzeroberfläche.
* Detailliertere Fehlerbehandlung.
* Strukturiertere Trennung von Registrierung und Login.
