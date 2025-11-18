# NavigationDrawerDemo

Application Android simple démontrant :

* L'utilisation d'un **Navigation Drawer** (menu latéral)
* La gestion de plusieurs **Fragments** dans une seule activité
* L'affichage d'un **ListFragment**
* Le remplacement dynamique de fragments dans un conteneur

---

##  Fonctionnalités

###  Fragment 1 (fond rose)

* Affiche un écran rose avec un texte "Fragment 1"

###  Fragment 2 (fond bleu)

* Affiche un écran bleu avec un texte "Fragment 2"

### ✔️ Fragment List

* Affiche une liste simple de 10 éléments : Item 1 → Item 10

###  Navigation Drawer

* Menu latéral permettant de sélectionner :

  * Fragment 1
  * Fragment 2
  * Fragment List

---

##  Technologies utilisées

* **Android Studio** (Java)
* **Navigation Drawer Activity Template**
* **Fragments**
* **ListFragment**
* **Vector Assets (icônes)**

---

##  Structure du projet

```
app/
 └── java/com.example.navigationdrawerdemo/
       ├── MainActivity.java
       ├── BlankFragment.java
       ├── BlankFragment2.java
       └── FragmentList.java

 └── res/
       ├── layout/
       │     ├── activity_main.xml
       │     ├── content_main.xml
       │     ├── fragment_blank.xml
       │     └── fragment_blank2.xml
       ├── menu/
       │     └── activity_main_drawer.xml
       └── drawable/
             ├── ic_home.xml
             ├── ic_dashboard.xml
             └── ic_list.xml
```

---

##  Installation & Exécution

### 1. Ouvrir le projet dans Android Studio

```
File > Open > NavigationDrawerDemo
```

### 2. Compiler le projet

* Cliquez sur **Run **
* Choisissez un **émulateur Android** ou un **téléphone connecté**

### 3. Utilisation

* Ouvrez le menu latéral (icône hamburger "☰")
* Sélectionnez :

  * **Fragment 1** → fond rose
  * **Fragment 2** → fond bleu
  * **Fragment List** → liste de 10 items

---

##  Fichiers importants

### MainActivity.java

Gère la sélection du menu et le remplacement des fragments avec :

```
getSupportFragmentManager().beginTransaction()
    .replace(R.id.contenu, new BlankFragment())
    .commit();
```

### activity_main_drawer.xml

Définit les items du menu Navigation Drawer.

### fragment_blank.xml & fragment_blank2.xml

Définissent l'interface visuelle des deux fragments simples.

### FragmentList.java

Affiche une liste avec un `ArrayAdapter`.

---

##  Auteur

Projet réalisé dans le cadre d'un exercice pratique pour apprendre :

* La navigation multi-fragments
* Le Navigation Drawer
* La gestion d'UI modulaires sous Android

---

##  Licence

Usage libre pour l'apprentissage et la formation Android.



## Description Vidéo





https://github.com/user-attachments/assets/503b82de-5e4f-412a-8acf-525de379b810



