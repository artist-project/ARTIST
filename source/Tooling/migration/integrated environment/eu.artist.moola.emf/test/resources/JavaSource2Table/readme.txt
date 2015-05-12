Metamodel files
---------------
 * JavaSource.ecore
 * JavaSource.km3
 * Table.ecore
 * Table.km3

Example files
-------------
 * FirstClass.java, SecondClass.java: Java test files
 * example.xml: input XML file (corresponding to the injection of the previous Java files)
 * javasource-example.ecore: corresponding JavaSource model
 * table-example.ecore: transformed Table model
 * example.html: corresponding table in HTML format

Transformation files
--------------------
 * JavaSource2Table.atl

"JavaSource.ecore" and "Table.ecore" are the metamodels for JavaSource and Table models.
Km3 files provide readable versions of these metamodels in the km3 format.

The JavaSource2Table transformation ("JavaSource2Table.atl") can be tested with the JavaSource model ("javasource-example.ecore") as input.
It returns a Table model ("table-example.ecore").

"example.xml" provides a readable version of the Java source example.
This file corresponds to the injection of the 2 Java files ("FirstClass.java" and "SecondClass.java") to XML.
Before executing the JavaSource2Table transformation, the XML file has to be transformed from the XML to the JavaSource metamodel.
This preliminary transformation is not detailled in this example.

"example.html" provides an HTML version of the obtained table result.
This file is the result of two successives operations on the Table model produced by JavaSource2Table:
  1. A transformation from the Table to the XML model
  2. An extraction from the XML model to text
These steps are not detailled in this example.
