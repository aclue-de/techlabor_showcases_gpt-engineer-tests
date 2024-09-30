# GPT-engineer tests

Ein kleiner Test des Tools [gpt-engineer](https://github.com/gpt-engineer-org/gpt-engineer), um den Entwicklerworkflow zu verbessern/beschleunigen.

#### Commands

CLI Editor to select files for the context (to improve existing code)
``` CLI Editor to select files for the context (to improve existing code)
export EDITOR="nano"
```

Create new code
``` Create new code
gpte <project_dir>
```

Improve existing code
``` Improve existing code
gpte <project_dir> -i
```

Man muss eine Datei mit Namen 'prompt' in das project_dir legen und darin den prompt schreiben. In einem Verzeichnis images können auch Bilder für die Verarbeitung übergeben werden.

Die Projecte sind oftmals nicht ohne kleinere Anpassung lauffähig.
