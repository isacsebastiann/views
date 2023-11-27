CREATE VIEW IF NOT EXISTS invoice_view AS
SELECT i.*, c.fullname FROM invoice i JOIN client c ON c.id = i.client_id;