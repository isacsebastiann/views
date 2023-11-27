<<<<<<< HEAD
/*CREATE VIEW IF NOT EXISTS invoice_view AS
SELECT i.*, c.fullname FROM invoice i JOIN client c ON c.id = i.client_id;

-- db/migration/V2__views.sql
CREATE OR REPLACE VIEW invoice_view AS
SELECT i.*, c.fullname
FROM invoice i
         JOIN client c ON c.id = i.client_id;*/
=======
CREATE VIEW IF NOT EXISTS invoice_view AS
SELECT i.*, c.fullname FROM invoice i JOIN client c ON c.id = i.client_id;
>>>>>>> a421182686aabb4bf853d2ae234824ae90c36c45
