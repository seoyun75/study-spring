#Spring Study

-----
java 언어를 사용하여 DB를 연동하지 않은 기본적인 spring 기초 공부

###ch.1 Rest API
GET, POST, PUT, DELETE 및 Response 기초



```mermaid
@startuml
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Container.puml

C4Container
title System Context diagram for Internet Banking System

HIDE_STEREOTYPE()

Person(customerA, "Banking Customer A", "A customer of the bank, with personal bank accounts.")
System(SystemAA, "Internet Banking System", "Allows customers to view information about their bank accounts, and make payments.")


Enterprise_Boundary(B1, "Application") {
  
  System_Boundary(b1,"API"){
   SystemDb_Ext(SystemE, "Mainframe Banking System", "Stores all of the core banking information about customers, accounts, transactions, etc.")

  }

  System_Boundary(b2, "Service") {
    System(SystemA, "Banking System A")
    System(SystemB, "Banking System B", "A system of the bank, with personal bank accounts.")
  }


  Boundary(b3, "Domain", "boundary") {
    SystemQueue(SystemF, "Banking System F Queue", "A system of the bank, with personal bank accounts.")
    SystemQueue_Ext(SystemG, "Banking System G Queue", "A system of the bank, with personal bank accounts.")
  }
}

Enterprise_Boundary(db, "Database") {
   ContainerDb(SystemD, "SQLite Database", "")

}

Rel(customerA, SystemAA, "Uses")
Rel(SystemE, SystemA, "Uses")
Rel(SystemA, SystemF, "Uses")
Rel(SystemAA, SystemE, "Uses")
Rel_D(SystemF, SystemD, "Uses")


UpdateLayoutConfig($c4ShapeInRow="2", $c4BoundaryInRow="1", )

@enduml

```
