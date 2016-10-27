# Zadanie: Objednávkový systém eOrder

## Popis domény
Pre potreby objednávania tovarov, alebo služieb bližšie neurčená organizácia používa systém objednávok založený na papierovej forme. Proces objednávania sa dá popísať nasledovne:

1.	Užívateľ systému vytvorí novú objednávka na ktorú je možné pridávať jednotlivé položky
2.	Pri pridaní položky je možné zadať počet kusov
3.	Položky je možné z otvorenej objednávky aj odoberať alebo modifikovať. Ak sa objednávka uzatvorí, už nie je možná jej modifikácia
4.	Po uzatvorení objednávky je nutné ju zaplatiť 
5.	Zaplatením za objednávku sa končí proces objednania

Zákazník požaduje vytvorenie systému elektronických objednávok. Dôraz sa kladie na jednoduchosť a účelnosť riešenia.

## Požiadavky na elektronický systém objednávok eOrder
**MANDATORY** požiadavky:

* MP01: Aplikácia umožní vytvárať nové objednávky pre užívateľov
* MP02: Aplikácia umožní modifikovať existujúce objednávky
* MP03: Aplikácia automaticky počíta výslednú cenu objednávky 
* MP04: Aplikácia umožní vykonať platbu za vytvorenú objednávku
* MP05: Aplikácia umožní prístup k už realizovaným objednávkam

**OPTIONAL** požiadavky:

* OP01: Aplikácia sprístupní funkcionalitu cez web/http rozhranie 
* OP02: Aplikácia disponuje Web GUI rozhraním
* OP03: Aplikácia používa SQL databázu na perzistenciu dát
* OP04: Aplikácia podporuje platby v rôznych menách

**IMPLICIT** požiadavky:

* IP01: Aplikácia je dobre testovateľná
* IP02: Aplikácia umožňuje diagnostiku možných problémov
* IP03: Aplikácia je monitorovateľná

## Úloha
Na tejto úlohe už pracoval iný tím neskúsených vývojárov. Vašou úlohou je prevziať existujúci kód a podklady, urobiť analýzu, navrhnúť riešenie a implementovať zmeny.  Riešenie potom odprezentovať zákazníkovi. Pri prezentácii máte k dispozícii projektor a whiteboard.
## Podklady
UML diagram čo ste dostali od predchádzajúcich riešiteľov  
![Class Diagram](https://github.com/psmInterview/eOrder/blob/master/material/order_model_uncomplete.jpg)  
Zdrojový kód v Java 8  
Kód nájdete na: https://github.com/psmInterview/eOrder
## Návod na riešenie :smile:

* Zanalyzujte dané požiadavky, doplňte chýbajúce komponenty a sfinalizujte UML Class diagram na ktorom budú uvedené aj vzájomné relácie identifikovaných tried.
* Ak uznáte za vhodné môžete doplniť aj iné typy UML diagramov. Nie je to nutná podmienka.
* Naimplementujte  aplikáciu podľa požiadaviek. Použite JDK v8 a váš obľúbený IDE nástroj (Eclipse, NetBeans IntellijIDEA)
* Ak uznáte za vhodné, použite aj vhodné knižnice tretích strán. Jadro aplikácie však musí byť vaša práca.
* Pokiaľ máte skúsenosti s nejakým Java frameworkom, môžete ho použiť v riešení. Taktiež môžete použiť Java buildovací nástroj, ktorý poznáte (Maven, Gradle)
* Myslite aj na IMPLICIT požiadavky!
* Nie je nutné implementovať všetky požiadavky,	 avšak je nutné demonštrovať základnú funkcionalitu popísanú v prvej kapitole.
* Riešenie je otvorené akýmkoľvek kreatívnym nápadom a vylepšeniam, ktoré nemusia byť súčasťou zadania. 
