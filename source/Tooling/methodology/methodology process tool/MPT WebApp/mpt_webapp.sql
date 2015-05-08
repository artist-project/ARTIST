--/*******************************************************************************
-- *  Copyright (c) 2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
-- *
-- *  Licensed under the MIT license:
-- *
-- *  Permission is hereby granted, free of charge, to any person obtaining a copy
-- *  of this software and associated documentation files (the "Software"), to deal
-- *  in the Software without restriction, including without limitation the rights
-- *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
-- *  copies of the Software, and to permit persons to whom the Software is
-- *  furnished to do so, subject to the following conditions:
-- *
-- *  The above copyright notice and this permission notice shall be included in
-- *  all copies or substantial portions of the Software.
-- *
-- *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
-- *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
-- *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
-- *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
-- *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
-- *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
-- *  THE SOFTWARE.
-- *
-- * Contributors: Kleopatra Konstanteli
-- * 		   Liagouras Georgios Andreas
-- * Initially developed in the context of ARTIST EU project www.artist-project.eu
-- *******************************************************************************/
-- Table: users

-- DROP TABLE users;

CREATE TABLE users
(
  username character varying(30) NOT NULL,
  password character varying(30),
  role character varying(30),
  CONSTRAINT "Users_pkey" PRIMARY KEY (username)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE users
  OWNER TO postgres;



-- Table: projectmembers

-- DROP TABLE projectmembers;

CREATE TABLE projectmembers
(
  projectname character varying(30) NOT NULL,
  membername character varying(30) NOT NULL,
  CONSTRAINT "projectMembers_pkey" PRIMARY KEY (projectname, membername)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE projectmembers
  OWNER TO postgres;