@rem ***************************************************************************
@rem Copyright (c) 2014 Vienna University of Technology.
@rem All rights reserved. This program and the accompanying materials
@rem are made available under the terms of the Eclipse Public License v1.0
@rem which accompanies this distribution, and is available at
@rem http://www.eclipse.org/legal/epl-v10.html
@rem
@rem Contributors:
@rem Patrick Neubauer (Vienna University of Technology) - initial API and implementation
@rem
@rem Initially developed in the context of ARTIST EU project www.artist-project.eu
@rem ***************************************************************************
set class=eu.artist.webservices.WebservicesDemo
set clpth=./target/classes
set resourcedir=./src
set outsourcedir=./src
set outdir=./target/classes
wsgen -cp "%clpth%" -wsdl -keep -r "%resourcedir%" -d "%outdir%" -s "%outsourcedir%" %class%