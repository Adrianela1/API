ALTER TABLE medicos add activo TINYINT;
UPDATE medicos SET activo = 1;