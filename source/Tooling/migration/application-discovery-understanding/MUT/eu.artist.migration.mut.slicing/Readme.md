Model Slicer as part of the MUTB (Model Understanding Tool Box)
===============================================================

Purpose
------- 
The purpose of model slicing is basically to generate a sub model from a
base model to reduce the complexity of the base by withdrawing model elements
that are considered as not relevant for a certain task or scenario. The goal
is to provide a model slicing framework that deals with multiple viewpoints of UML. 
 
Functionality included in this version
--------------------------------------

- Projects / Plugins:
  eu.artist.migration.mut.slicing, eu.artist.migration.mut.slicing.sim, eu.artist.migration.mut.slicing.sim.edit,
  eu.artist.migration.mut.slicing.sim.editor 

- Slicing Intent Metamodel (SIM): It enables describing a slicing criterion,
  which captures the point of interest, and a slicing configuration. 
- Model slice of a class structure based on annotations. The intention is to
  produce a model slice for a given class structure. Model elements covered by the
  produced slice are annotated with the elements of specified slicing criterion.
- Model slice of a class structure based on objects. The intention is to produce a
  model slice for a given object structure. Model elements covered by the produced slice
  are classifiers / types of the objects specified by slicing criterion.

Functionality expected in next versions
---------------------------------------

- Dedicated transformation chains that support different slicing scenarios.  
 
Documentation
-------------

The corresponding Deliverable D8.3.2 serves as documentation of the current version of
the Model Cloudification Framework.

Known issues of this version
----------------------------

Disclaimer
----------

This software is a research prototype.

Copyright and license
---------------------

All code of the Model Cloudification Framework is published under the EPL v1.0 license. 