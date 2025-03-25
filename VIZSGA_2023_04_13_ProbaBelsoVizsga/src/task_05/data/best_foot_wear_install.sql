CREATE SCHEMA `best_foot_wear` DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci ;

use `best_foot_wear`;

CREATE TABLE `best_foot_wear`.`foot_wear_category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `best_foot_wear`.`foot_wear_category` (`name`) VALUES ('cipő');
INSERT INTO `best_foot_wear`.`foot_wear_category` (`name`) VALUES ('csizma');
INSERT INTO `best_foot_wear`.`foot_wear_category` (`name`) VALUES ('szandál');

CREATE TABLE `best_foot_wear`.`foot_wear` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `manufacturer` VARCHAR(150) NULL,
  `model` VARCHAR(150) NULL,
  `size` FLOAT NULL,
  `category_id` INT NULL,
  `status` TINYINT(1) NULL DEFAULT 1,
  PRIMARY KEY (`id`));

INSERT INTO `best_foot_wear`.`foot_wear` (`name`, `manufacturer`, `model`, `size`, `category_id`, `status`) VALUES ('NIKE utcai cipő', 'NIKE', 'ETER-231', '43', '1', '1');
INSERT INTO `best_foot_wear`.`foot_wear` (`name`, `manufacturer`, `model`, `size`, `category_id`, `status`) VALUES ('NIKE sportcipő', 'NIKE', 'TJG-111', '44', '1', '0');
INSERT INTO `best_foot_wear`.`foot_wear` (`name`, `manufacturer`, `model`, `size`, `category_id`, `status`) VALUES ('ADIDAS szandál', 'ADIDAS', 'TIK-124', '41', '3', '1');

ALTER TABLE `best_foot_wear`.`foot_wear` 
ADD COLUMN `net_price` INT NULL AFTER `category_id`;

UPDATE `best_foot_wear`.`foot_wear` SET `net_price` = '25000' WHERE (`id` = '1');
UPDATE `best_foot_wear`.`foot_wear` SET `net_price` = '18600' WHERE (`id` = '2');
UPDATE `best_foot_wear`.`foot_wear` SET `net_price` = '9800' WHERE (`id` = '3');

