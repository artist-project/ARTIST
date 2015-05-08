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