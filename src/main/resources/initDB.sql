DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE users
(
  userid         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  firstname      VARCHAR NOT NULL,
  lastname       VARCHAR NOT NULL,
  dob            DATE DEFAULT NULL,
  email          VARCHAR NOT NULL
);

