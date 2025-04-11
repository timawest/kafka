--liquibase formatted sql
--changeset rbulatov:2025-04-13-create-table-source

CREATE TABLE source(
   id serial PRIMARY KEY,
   create_date timestamp,
   first_name text,
   last_name text,
   middle_name text,
   system_date_time timestamp
);