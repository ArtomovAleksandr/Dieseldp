use dieseldp;

insert into `current` (id,name,shortname,rate) values (1,'Гривня','грн.',1.00),(2,'Доллар','usd',28.50),(3,'Евро','eur',32.00);
INSERT INTO factory(id,name) VALUES (1,'BCD'),(3,'Bosch'),(4,'Brisk'),(12,'Crosland'),(13,'DOOWON'),(14,'Dayco'),(15,'Delphi'),(16,'Denso'),(17,'Febi'),(18,'Filtron'),(19,'Firrad'),(20,'Flag'),(21,'Flennor'),(24,'Glaser'),(71,'JC'),(28,'Luqui Moly'),(29,'ADL'),(30,'MonarkDiesel'),(70,'Eberspacher'),(32,'Motorpal'),(33,'NGK'),(68,'Чугуев'),(35,'Perfect Circle'),(36,'Polo'),(67,'Ярославский завод'),(69,'Gates'),(41,'Stanadyne'),(42,'SVN'),(43,'Shell'),(44,'Spaco'),(45,'Super Diesel'),(46,'TOYA'),(66,'OMS'),(65,'Beru'),(64,'не оригинал'),(50,'UNION'),(63,'Wusetem'),(52,'Zexel'),(62,'Okm'),(61,'SNR'),(60,'ORS'),(59,'Mercedes'),(72,'Hengst'),(73,'Mann'),(74,'Mitsuboshi'),(75,'Superpar'),(76,'DTP'),(77,'KIA-MOTORS'),(78,'HKT'),(79,'COMMA'),(80,'SEVEN'),(81,'BoRG'),(82,'Elring'),(83,'Glyco'),(84,'Mahle'),(85,'Goetze'),(86,'TETIK'),(87,'MOPISAN'),(88,'SM'),(89,'ELW'),(90,'AJUSA'),(91,'Herzog'),(92,'Nural'),(93,'Higt Tech'),(94,'Redat'),(95,'Tecnocar'),(96,'Star'),(97,'ZIMMER'),(98,'CNR'),(99,'Iskra'),(100,'Siemens'),(101,'Mefin'),(102,'Osram'),(103,'Cargo');
INSERT INTO uzel(id,name) VALUES (1,'A'),(2,'B'),(3,'DPA'),(4,'DPC'),(5,'DPS'),(6,'EPIC'),(7,'M'),(8,'Топл. ап.'),(9,'VE - ТИП'),(10,'MW'),(11,'Регуляторы'),(12,'Р'),(13,'Разное'),(14,'THHД'),(15,'CR-система');
INSERT INTO `groups`(id,name) VALUES (1,'АОВ'),(2,'Шайба медная'),(3,'Шайба алюминиевая'),(4,'Валы'),(5,'Шланг'),(6,'Шайба стальная'),(7,'Сальник'),(8,'Втулки'),(9,'Уплотнение резиновое'),(10,'ТННД'),(11,'Ролики'),(12,'Кулачковые шайбы'),(13,'Метизы'),(14,'Гидравлич.головки и плунжерные пары'),(15,'Мембраны'),(16,'Электроклапана'),(17,'Гидроклапана'),(18,'Клапана'),(19,'Подшипники'),(20,'Ремкомплекты'),(21,'Масляный фильтр'),(22,'Топливный фильтр'),(23,'Воздушный фильтр'),(24,'Распылители'),(25,'Свечи накала'),(26,'Регуляторы и элементы регуляторов'),(27,'Уплотнения паронитовые'),(28,'Дозирующие элементы'),(29,'Подкачивающий насос'),(30,'Запчасти форсунок'),(31,'Ремни'),(32,'Пружины'),(33,'Прокладки'),(34,'Запчасти Двигателя');
INSERT INTO category(id,visible,metric,name) VALUES (1,0,0,'Нет категории'),(2,0,2,'Тепловые экраны под распылитель'),(4,0,1,'Тепловые экраны под форсунку'),(5,0,3,'Шайба уплотнительная медная'),(6,0,4,'Шайба уплотнительная алюминиевая'),(7,1,30,'Запчасти к ТНВД тип VE'),(8,0,18,'Дизельные распылители  MOTORPAL'),(9,1,19,'Дизельные распылители FIRAD'),(10,1,9,'Дизельные распылители Denso'),(11,1,5,'Дизельные распылители Bosch'),(12,1,7,'Дизельные распылители Zexel'),(13,1,11,'Дизельные распылители Delphi'),(14,1,22,'Запчасти к рядным ТНВД'),(15,1,35,'Запчасти к ТНВД тип DPC'),(16,0,5,'Дизельные распылители Herzog'),(17,0,100,'Свеча накала SD'),(18,0,110,'Свеча накала Bosch, Beru'),(30,1,50,'Запчасти к CR-системе'),(29,0,140,'Сопутствующий товар'),(22,0,20,'Свеча накала NGK'),(23,0,120,'Электрофакельные свечи'),(24,0,14,'Дизельные распылители ADL'),(25,1,20,'Запчасти форсунок'),(26,0,24,'Запчасти к подкачивающим насосам'),(27,1,40,'Запчасти к ТНВД тип DPS'),(28,1,45,'Запчасти к ТНВД тип DPA'),(31,0,23,'Запчасти регуляторов'),(32,1,141,'Форсунки Stanadyne'),(33,0,51,'Фильтра'),(34,0,21,'Свеча накала HKT'),(35,1,12,'Дизельные распылители Wusetem'),(36,0,52,'Запчасти Двигателя');
INSERT INTO unit (id,name)values(1,"шт."),(2,"к-т"),(3,"см.");