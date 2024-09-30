## Vorgehen mit den bereits bekannten Tests aus Showcase - AI Junior Developer V1

#### Aufgaben

In Aufgabe 1 wird Code erstellt, dieser wird dann immer weiter in die nächste Übung kopiert, um diesen Code dann in den folgenden Übungen anzupassen.

1. Erstelle eine vorgegebene Dateistruktur
    - Ausführen des Anforderungstextes in [test1-createFolders](test1-createFolders)
    - Erstellter Code funktioniert
    - Project wird bereits mit funktionierenden Klassen erstellt. (quasi 'Hello-World' Rest-Endpunkt)
    - Das run.sh Script kann grundsätzlich nicht funktionieren, da immer auf mvnw oder gradlew zurückgegriffen werden soll. Diese und weitere Dateien werden allerdings nie erstellt.
2. Füge eine Spring RunApplication hinzu
    - es gibt bereits eine existierende Application.java Klasse mit den "Startparametern", welche in diesem Step gefordert werden
    - die Application.java interessiert den **gpte** bei seiner Arbeit nicht. Sie wird einfach ignoriert und nicht gelöscht. (muss von Hand gelöscht werden, damit der Code funktioniert)
3. Füge einen Rest-Endpunkt mit Model hinzu
    - Die Anforderungen der einzelnen Steps werden richtig ausgeführt.
    - Es wird allerdings ebenfalls **nicht das "Update"** in dem einleitenden Satz beachtet.
    - Es wird eine UUID im Rest verwendet. Daher kann kein einfacher String im Rest call verwendet werden. Es muss ein **UUID konformer String übergeben** werden
4. Model mit Forderung nach Lombok hinzufügen
    - Es wird der richtige Code in die [pom.xml](test4-newModelWithLombok/pom.xml) eingefügt. Der Code ist um eine Zeile verrutscht oder es fehlt ein schliessendes/öffnendes Tag..
5. Model hinzufügen (in der Hoffnung das Lombok benutzt wird)
    - funktioniert
6. Mehrere Aufgaben ausführen
    - Sobald es zum entfernen von Dateien kommt, scheint das Tool fehlerhaft zu arbeiten. Dieses Verhalten beeinflusst auch die Aufgaben, welche nichts mit dem löschen zu tun haben.
