--liquibase formatted sql
--changeset rbulatov:2025-04-12-create-table-atemption

CREATE TABLE atemption(
   id UUID PRIMARY KEY,
   start timestamp,
   finish timestamp,
   description text
);