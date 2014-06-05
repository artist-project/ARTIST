CREATE TABLE users
(
  username character varying(30) NOT NULL,
  password character varying(30),
  CONSTRAINT "Users_pkey" PRIMARY KEY (username)
)
WITH (
  OIDS=FALSE
);