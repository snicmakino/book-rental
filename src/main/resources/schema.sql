DROP SCHEMA IF EXISTS rental;
CREATE SCHEMA rental;

DROP TABLE IF EXISTS rental.books;
CREATE TABLE rental.books (
  title VARCHAR(40) NOT NULL,
);

COMMENT ON TABLE rental.books IS '本';
COMMENT ON COLUMN rental.books.title IS 'タイトル';
