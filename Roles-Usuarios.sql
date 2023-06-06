USE `grupo-21-oo2-2023`;
INSERT INTO `grupo-21-oo2-2023`.`user` (`id`, `createdat`, `enabled`, `password`, `updatedat`, `username`) VALUES ('1', CAST('2023-06-06 17:32:06.427' AS DateTime), b'1', '$2a$10$CnEauIvejmdJtnu5Qvkxl.8VJRjL.DmvYRvEQttyycw4mrWFtkIt.', CAST('2023-06-06 17:32:06.427' AS DateTime), 'auditor');
INSERT INTO `grupo-21-oo2-2023`.`user` (`id`, `createdat`, `enabled`, `password`, `updatedat`, `username`) VALUES ('2', CAST('2023-06-06 17:32:06.427' AS DateTime), b'1', '$2a$10$Qgw1DfmS59g84/z3WfSxjeTUNJ3TZphBz4QyMlhHO0cHA1UXyG.ES', CAST('2023-06-06 17:32:06.427' AS DateTime), 'admin');


INSERT INTO `grupo-21-oo2-2023`.`user_role` (`id`, `createdat`, `role`, `updatedat`, `user_id`) VALUES ('2', CAST('2023-06-06 17:32:06.427' AS DateTime), 'ROLE_AUDITOR', CAST('2023-06-06 17:32:06.427' AS DateTime), '1');
INSERT INTO `grupo-21-oo2-2023`.`user_role` (`id`, `createdat`, `role`, `updatedat`, `user_id`) VALUES ('1', CAST('2023-06-06 17:32:06.427' AS DateTime), 'ROLE_ADMIN', CAST('2023-06-06 17:32:06.427' AS DateTime), '2');
