
/**
 * Die Klasse Ausstellungsverwaltung Die Klasse „Ausstellungsverwaltung“ stellt die Kernaufgabe des Systems dar. 
 * Sie dient dazu aus den Gegebenheiten der Raum- und Kunstwerksverwaltung die optimale Ausstel-lungskombination zu ermitteln. 
 * Diese Klasse beinhaltet somit den größten Anteil der Pro-zessabwicklung. 
 * Durch die Klasse „Ausstellungsverwaltung“ werden Objekte der Klasse „Ausstellung“ erzeugt. 
 * Über die Klassen „Raumverwaltung“ und „Kunstwerksverwaltung“ werden Input-Daten der Räume und verfügbaren Kunstwerke geliefert.
 * 
 * 
 * 
 * @author Marcell Wach, Laura Perlbach, Johannes Riedmeier, Darya Bialova
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ausstellungsverwaltung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    Ausstellung a;
    Kunstwerkverwaltung kwv;
    Raumverwaltung rvw;
    Optimierungsalgorithmus y;
    /**
     * Konstruktor für Objekte der Klasse Museumsverwaltung
     */
    public Ausstellungsverwaltung()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * die Main-Methode beschreibt den zentralen Logik-Ablauf der Museumsverwaltung und steuert 
     * damit den Ablauf und Aufruf der verschiedenen Klassen von der Eingabe der Eingabe-Dateien bis hin zur Ausgabe der Augabedateien
     * 
     * 
     * 
     */
    public static void main(String args[])
    {
        // Abfragen der Eingabedateien
            //Datei.verarbeiteRaumDatei(String Dateipfad) --> raume.csv
            //Datei.verarbeiteKunstwerkeDatei(String Dateipfad) --> kunstwerke.csv
        
        // dadurch Erstellung der Raüme und Kunstwerke
        
        // Eingabe des Wunschthemas für die Ausstellung (und Kostenobergrenze)
        
        // Starten des Optimierungsalgorithmus (mit Eingabe der Liste der Kunstwerke, der Liste der Räume und der Themenwahl)
        
        // dadurch Erzeugung der Ausstellung (Zuordnung Raum und Kunstwerke)
        
        // Ausstellung erzeugt Ausgabedateien
    
    }
}



