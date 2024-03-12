
# Qüestionari d’autoavaluació

## Què és un objecte?
Una instància d’una classe que està en execució.

## Què és una classe?
El disseny de com són els objectes de la classe (estat i comportament).

## Com es representa l’estat? Com es representa el comportament?
- Estat: camps (atributs, propietats).
- Comportament: mètodes.


## Què és un constructor?
Un constructor és un mètode especial que s'utilitza per inicialitzar objectes.


## Es pot instanciar un objecte de la classe Pilota si no té dissenyat cap constructor a la classe?
Sí, es pot instanciar sense un constructor definit. En cas afirmatiu, mostra la sentència per fer-ho:
```java
Pilota p = new Pilota();
```


## Declara un constructor per a una classe Pilota que tingui un paràmetre: radi.
```java
public Pilota(int radi)
```


## Instanciar un objeto de la clase Pilota con el constructor anterior.
```java
Pilota p = new Pilota(10);
```

## Sobrecarrega el constructor de la classe Pilota afegint el paràmetre color.
```java
public Pilota(int radi, Color color)
```

## Exemple de l’ús de this(...) amb els constructors anteriors.
```java
public Pilota(int radi){
   this(radi, Color.RED);
}
```

## Sobreescriu el mètode toString.
```java
@Override
public String toString(){
    return “Pilota(radi=” + radi +”)” +....;
}
```

## Quina és la diferència entre sobrecarregar i sobreescriure?
Sobrecarregar: Mateix nom, diferent signatura (paràmetres) en una mateixa classe.
Sobreescriure: Mateix nom i signatura que un mètode heretat.
## Què vol dir que un atribut sigui estàtic (static)? Posa dos exemples.
És un camp de la classe. Un únic camp per tots els objectes. Exemple: Comptar quants objectes hi ha d’una classe.

## En System.out.println(“Hola mon”);
### què és System?
Una classe.

### Què és out?
Un camp estàtic que fa referència a un objecte de la classe PrintStream.

### Què és println?
Un mètode.

## Exemple d’utilització de this (sense parèntesis).
```java
public Pilota(int radi){
   this.radi = radi;
}
```

## Quina diferència hi ha entre una propietat pública i privada (public i private)?
* Publica: Visible des de qualsevol classe.
- Privada: Visible només des de la pròpia classe.

## Què són els getters i setters? Quins avantatges tenen?
- Getters: Mètodes per accedir als valors d’un camp.
- Setters: Mètodes per modificar un camp. Permeten encapsular la informació.

## En System.out.println(“Hola mon”);
### out és estàtic o no estàtic?
Estàtic.

### Podria ser System un objecte? Per què?
Només si ho ha fet un programador molt inexpert!!!

### Pot ser out privat?
No, ja que hi accedim directament (no mitjançant getter).

### Suposant que out fos final, quines conseqüències tindria?
No el podríem modificar.
________________________________________________________________

## Què vol dir que un mètode sigui estàtic?
Que és de la classe. No té this (no és de cap objecte) i no pot accedir a cap camp no estàtic.

## En un mètode estàtic, podem fer servir this? Per què?
No.

## En un mètode estàtic, es pot accedir a una variable de classe? Per què?
Sí.

## En un mètode estàtic, es pot accedir a una variable d’instància? Per què?
No.

## En un mètode d’instància, es pot accedir a una variable de classe? Per què?
Sí.

## Accedeix al mètode static nPilotes() de la classe Pilota amb les instàncies p1 i p2.
```java
Pilota.nPilotes();
```

## Declara la classe Figura com a abstracta i expliqueu quin efecte té.
```java
abstract class Figura 
```
No podem instanciar figures.

## uposant que la classe Figura és abstracta, declareu el mètode socAbstracte a Figura. Quin efecte té a les subclasses de Figura?
```java
abstract public void socAbstracte();
```
Les subclasses hauran d’implementar el seu propi mètode socAbstracte.

## Quina finalitat té cadascuna de les maneres de fer comentaris en Java:
```java
/** ... */: Javadoc.
/* … */: Multilínia.
//: Línia.
```

## Com funciona el Javadoc? Tres exemples d’etiquetes i com s’indiquen, com es genera i com s’hi accedeix.
Exemples d'etiquetes:
```java
/**
 * @param
 * @return
 * @author
 */
```
Generació i accés: Utilitzant la comanda javadoc i accedint als arxius HTML generats.

## Dóna nom a la propietat “color contorn finestra” en camelcase notation.
```java
colorContornFinestra
```
## Què és MISSATGE_SECRET_CURT?
```java
Constant (final).
```






