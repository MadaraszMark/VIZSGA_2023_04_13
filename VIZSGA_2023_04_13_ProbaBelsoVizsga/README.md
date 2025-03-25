# ruander_jjb_exam_2023_04_13_01
## Java Backend Gyakorlati Vizsga 2023_04_13_01
----------------------------------------------------
> ### Feladat01 - *Java programozási nyelv alapjai*: A task_01 package-ben egy leltárszám létrehozó alkalmazást kell folytatnia a következő szempontok figyelembevételével:
> A leltárszám létrehozása a következőképp történjen: a termék neve után egy alulvonás szerepeljen, majd az aktuális dátum egyben, végül egy véletlen szám 1-1000 között!
Egy lehetséges bemenet: termekNev -> termekNev_20230101_538
 
> a. Jelenleg egyik teszteset sem fut le sikeresen, javítsa ki a megfelelő metódust vagy metódusokat!

> b. Bővítse az alkalmazást, a véletlen szám intervallumait a felhasználótól kérje be!

> c. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!

------------------------------------------------------
> ### Feladat02 - *Java objektumorientált programozás*: A task_02 package-ben egy motorkerékpár adatokat (azonosító, gyártó, model, nettó ár, gyártási év) kezelő alkalmazást kell folytatnia.
> A 2020-ban gyártott Suzuki GSX-R 1000R modell garanciális visszahívására van szükség!    

> a. A tests package-ben lévő egységteszt nem fut le sikeresen. Javítsa ki a megfelelő metódust vagy metódusokat!

> b. Osztályok és objektumok felhasználásával bővítse az alkalmazást! Kérje be a motorkerékpár adatait, majd döntse el, hogy szükséges -e visszavinni a szakszervízbe!
	Írja ki a motorkerékpár minden adatát!

> c. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!
------------------------------------------------------
> ### Feladat03 - *Java kollekciók*: A task_03 package-ben egy notebook alkatrészek adatait (azonosító, név, leltárszám, gyártó, modell, raktármennyiség, nettó ár, szállítási idő) kezelő alkalmazást kell folytatnia.
> A NotebookPart osztályon belüli getShippingDay() metódusnak 30-al kell visszatérnie, ha a raktármennyiség 0.  

> a. A tests package-ben lévő egységteszt nem fut le sikeresen. Javítsa ki a megfelelő metódust vagy metódusokat!

> b. Osztályok és objektumok felhasználásával bővítse az alkalmazást! Kérjünk be 3 darab alkatrész adatait, melyet egy lista adatszerkezetben tároljunk!
	Metódus segítségével írjuk ki az összes alkatrész minden adatát!
	
> c. Melyik a legolcsóbb alkatrész, amiből van raktáron? A válaszban jelenítsük meg az alkatrész minden adatát!

> d. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!

------------------------------------------------------
> ### Feladat04 - *Fájlkezelés Java-ban*: A task_04 package-ben egy virágbolt 2020. március havi eladási adatait láthatjuk. Az src-vel egy szinten található task_04_data mappában van a feldolgozandó, UTF-8 kódolású csv állomány, melyben az adatok a következő sorrendben helyezkednek el: azonosító (karaktereket is tartalmaz), név, kategoria id (1-es CSOKOR, 2-es VIRÁGBOX, 3-as CSEREPES), egységár (nettó), eladott darabszám).
> Az azonosító kötelezően 8 karakter. Ennek ellenőrzésére a Product osztályon belül talál egy isIdLengthValid() metódust.   

> a. A tests package-ben lévő egységteszt nem fut le sikeresen. Javítsa ki a megfelelő metódust vagy metódusokat!

> b. Osztályok és objektumok felhasználásával bővítse az alkalmazást! Olvassuk be a fájlt egy olyan adatszerkezetbe, hogy a további feladatok megoldhatóak legyenek!
	Metódus segítségével írjuk ki az összes termék minden adatát, a kategória szövegesen jelenjen meg!
	
> c. Melyik a legolcsóbb termék? A válaszban jelenítsük meg termék vagy termékek adatát!

> d. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!
------------------------------------------------------
> ### Feladat05 - *Adatbáziskezelés Java-ban*: A task_05 package-ben egy félkész ablakos(Swing) alkalmazást talál, amely lábbelik adatait listázza!
> Futassa a data package-ben található best_foot_wear_install.sql-t. A script létrehozza az adatbázist, táblákat és néhány beszúrást is tartalmaz. 
> A foot_wear_category tábla tartalmazza a kategóriákat -> cipő, csizma, szandál. 
> A foot_wear tábla tartalmazza az lábbelik adatait sorrendben -> azonosítóját, nevét, gyártóját, modelnevét, méretét,kategóriáját,nettó árát és állapotát (alapértelmezetten 1-es).    
> Az adatbáziskapcsolódáshoz szükséges mysql driver a task_05 mappában található, melyet állítson be a projekthez!  

> a. Jelenleg egyik teszteset sem fut le sikeresen, javítsa ki a megfelelő metódust vagy metódusokat!

> b. A táblázat alatt hozzon létre egy gombot, amelyre kattintva egy másik ablakban adatbázisba rögzíti az új lábbeli adatait! A logikai tipusú adatokat pipálható beviteli mező segítségével kérjük be (aktív alapértelmezetten legyen kipipálva)!  Az adattáblában kötelező mezőket a felületen is kötelező legyen megadni! Tájékoztassa a felhasználót az esetleges hibás megadásról!
  A felvitelre szolgáló ablak bezárásával az alkalmazás (főablak) fusson tovább!  

> c. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!
