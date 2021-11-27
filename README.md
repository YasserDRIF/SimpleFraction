# TD 1 : SimpleFraction

# DRIF Yasser El Habib - 22107524
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > En cochant une ou toutes les cases de *Initialize this repository with*, on constate que le git crée un commit appelé "inital commit" et si on n'en coche aucune, le repository créé est vide (aucun commit).

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    # git config --global user.name YasserDrif
    # git config --global user.email gy_drif@esi.dz

    ```
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    # git init
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    # git add . 
    # git commit -m "first commit of class Fraction"
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    // Code pour tester toString
	public String toString() {
	
		return Integer.toString(numerateur) + "/" + Integer.toString(this.denominateur);
		
	}
Et pour tester la méthode dans Main : 
	Fraction fraction = new Fraction(2,3);
	System.out.println("La fraction en String "+fraction.toString());
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # git add .
    # git commit -m "commit toString"
    # git remote add origin https://github.com/YasserDRIF/SimpleFraction.git
    # git push -u origin main
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > La syntaxe utilisée est Markdown. C'est une syntaxe simple pour fournir des informations sémantiques et représenter une mise en forme courante en texte brut. 
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    # git pull origin main
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    # Copier ici le contenu de `.gitignore`
Les fichiers de compilation (Fraction.class et Main.class) se trouvent au dossier bin et donc le contenu de `.gitignore` est bin
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    # Les fichiers de configuration de Eclipse dans un projet java se trouvent dans le répertoire ".settings" 
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`

    bin
    .settings
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la procédure de façon synthétique

Pour configurer l'accès par clé publique et privée à la forge, il faut suivre les étapes suivantes:
* Générer une clé privée et une clé publique en local à travers la commande : ssh-keygen -t rsa
Par défault la clé publique et privée sont enregistrées dans le répertoire ~/.ssh :
~/.ssh/id_rsa: clé privée
~/.ssh/id_rsa.pub: clé publique

(On peut nommer différemment la clé et choisir un passphrase pour encrypter la clé).

*Ensuite, on rajoute la clé publique "~/.ssh/id_rsa.pub" dans le fichier "~/.ssh/authorized_keys" dans settings de github (SSH and GPG keys). Cela nous authorisera de se connecter au serveur (github).


## Partie II (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > Linux | Bash
1. Quelle commande permet d'obtenir de l'aide ?
help
    ```bash
    # ls -help
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # ls -laSh répertoire
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # wc -l fichier
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        # grep 'uneVariable' Main.java
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        # grep -rn --include *.java 'uneVariable'
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # find . -name 'README.md' -type f 
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        # diff -y fichier1 fichier2
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        >  La commande ssh fournit une connexion cryptée sécurisée entre deux hôtes sur un réseau non sécurisé, en utilisant une paire de clés privée et publique. Un développeur l'utilise généralement pour se connecter à un serveur distant depuis sa machine pour le transfert de fichiers.
    * `screen`/`tmux`
        > les deux commandes sont des multiplexeur de terminaux; i.e ils permettent d'avoir plusieurs fenêtres dans une seule fenêtre de terminal, et de basculer entre ces derniers. c'est utile par example pour gérez une multitude d'écrans, d'affichages fractionnés et de tableaux de bord en même temps,
    * `curl`/[HTTPie](https://httpie.org/)
        > transférer des données vers ou depuis un serveur, généralemnt en utilisant une URL. Un développeur l'utilise généralement pour tester les endpoints de son API. 
    * [jq](https://stedolan.github.io/jq/)
        > Cette commande est utilisée pour transformer les formats de données. Il rend lisible pour un humain un JSON écrit pour une machine puisqu'il fait de la coloration syntaxique. Un développeur l'utilise généralement pour l'affichage et la manipulation des données JSON (lors des tests de l'API par example). 

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > Eclipse IDE

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Click droit sur le projet > Properties > text file encoding > other > choisir UTF-8
1. Comment choisir le JDK à utiliser dans un projet ?
    > Window > Preferences > Java Compiler > JDK Compliance > choisir la version souhaitée de JDK. 
1. Comment préciser la version Java des sources dans un projet ?
    > La version de Java à utiliser dans un projet peut être précisée lors de la création d'un projet. Il suffit de cocher « Utiliser une compatibilité propre au projet » et de sélectionner la version à utiliser dans la liste déroulante.
      Il est possible de modifier la version du JDK à utiliser dans les préférences du projet (question précédente).
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Click droit sur le projet > Build Path > Configure Build Path > dans la tab "Libraries" > à droite cliquer sur "Add external JARs"
1. Comment reformater un fichier source Java ?
    > Click droit sur le fichier > Source > Format
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Pour trouver la déclaration, il faut séléctionner cette variable (ou la méthode) et cliquer sur F3 ou faire un click droit > open declaration 
Pour voir l'ensemble des variables et méthodes déclarées dans une classe, on peut les voir en cliquant sur Window > Show > View Outline
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Pour ajouter des extraits de code/modèles à notre programme dans Eclipse IDE en tapant le mot-clé de l'extrait et en appuyant sur les touches Ctrl + Espace (comme l'affichage on saisit le mot clé sysout ensuite Ctrl + Espace et on ajoute la fonction System.out.println)
    Sinon, pour ajouter des méthodes prédéfinies et existantes (comme les getters/setters et toString()), click droit > Source > Generate... (la méthode souhaitée).     

1. Comment renommer une classe dans l'ensemble du projet ?
    > Click droit sur la classe > Refactor > Rename > Saisir le nouveau nom
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > On peut le faire en passant des arguments à la méthode "main" à travers le paramètre "arg".
Exemple : 

public class TestPassageArgument {
    public static void main(String[] listeArguments) {
	System.out.println(listeArguments[0]);
    }
}

*Ensuite, pour la commande :
java TestPassageArgument Test

*on obtient : Test

1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Dans Eclipse, il y a une perspective dédiée : "Débogage".
    Celle ci est automatiquement affichée lorsqu'une application est lancée sous le contrôle du débogueur cliquant sur Run (en haut ou click droit)> Debug As ou cliquer sur le bouton (qui est à coté de Run) de la barre d'outils. 
    Par défaut, la perspective "Débogage" affiche quelques vues aussi présentes dans la perspective Java (les vues "Structure" et "Console") et contenu des "Variables", Points d'arrêts...
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > *C'est un langage simple opensource et facile à apprendre et manipuler.
      *Idéal pour apprendre la programmation Orientée Objets. Beaucoup de bibliothèques et méthodes prédéfinies sont à la disposition du programmeur.
      *Java est un langage fortement typé qui décèle beaucoup d’erreurs de débutants. Ce langage convient aussi dans une moindre mesure pour la dactylographie statique. On n'a pas besoin de définir des typages qui rendent l’apprentissage plus difficile.
      *Java est livré avec un ramasse-miettes intégré, ce qui est un grand plus pour un débutant. La gestion de la mémoire est un élément important au début de l’apprentissage de la programmation.
      *la JVM optimise notre code à l’exécution pour nos cas d’utilisation réels en production.
      *Il y a assez de documentations sur le langage.
      *Outils de build et gestion des dépendances : JAR, Maven, Gradle, etc. 
