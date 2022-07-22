-- dbpizzerias.tb_clients definition

CREATE TABLE `tb_client` (
  `cod_cli` int NOT NULL AUTO_INCREMENT,
  `name_cli` varchar(80) NOT NULL,
  `adress_cli` varchar(255) NOT NULL,
  `district_cli` varchar(80) NOT NULL,
  `state_cli` varchar(15) NOT NULL,
  `phone_cli` varchar(30) NOT NULL,
  `email_cli` varchar(45) NOT NULL,
  `zip_cli` varchar(45),
  `date_cad_cli` date  NOT NULL,
  PRIMARY KEY (`cod_cli`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbpizzerias.tb_employee definition

CREATE TABLE `tb_employee` (
  `cod_emp` int NOT NULL AUTO_INCREMENT,
  `name_emp` varchar(80) NOT NULL,
  `occupation_emp` varchar(80) NOT NULL,  
  `date_cad_emp` date  NOT NULL,
  PRIMARY KEY (`cod_emp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- dbpizzerias.tb_deliveryman definition

CREATE TABLE `tb_deliveryman` (
  `cod_del` int NOT NULL AUTO_INCREMENT,
  `name_del` varchar(80) NOT NULL,
  `status_del` varchar(80) NOT NULL,
  `date_cad_del` date  NOT NULL,
  PRIMARY KEY (`cod_del`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbpizzerias.tb_menu definition

CREATE TABLE `tb_menu` (
  `cod_men` int NOT NULL AUTO_INCREMENT,
  `description_men` varchar(80) NOT NULL,
  `type_men` varchar(80) NOT NULL,
  `price_men` decimal(10,2) NOT NULL,
  `date_cad_men` date  NOT NULL,
  PRIMARY KEY (`cod_men`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbpizzerias.tb_request definition

CREATE TABLE `tb_request` (
  `cod_req` int NOT NULL AUTO_INCREMENT,
  `cod_cli_req` int NOT NULL,
  `date_cad_req` date  NOT NULL,
  `total_req` decimal(10,2) NOT NULL,
  `cod_emp_req` int NOT NULL,
  `cod_del_req` int NOT NULL,
  `status_req`  varchar(50) NOT NULL,
  `time_cad_req` time  NOT NULL,
  PRIMARY KEY (`cod_req`,`cod_cli_req`,`cod_emp_req`,`cod_del_req`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbpizzerias.tb_item definition

--
-- Estrutura da tabela `item`
--

CREATE TABLE `tb_item` (
  `cod_ite` int(11) NOT NULL,
  `cod_del_ite` int(11) NOT NULL,
  `cod_emp_ite` int(11) NOT NULL,
  `cod_cli_ite` int(11) NOT NULL,
  `cod_req_ite` int(11) NOT NULL,
  `cod_men_ite` int(11) NOT NULL,
  `quantit_ite` int(11) NOT NULL
) 


ALTER TABLE `tb_item`
  ADD PRIMARY KEY (`cod_ite`);
 
ALTER TABLE `tb_item`
  ADD PRIMARY KEY (`cod_del_ite`),
  ADD KEY `RequestItem` (`cod_del_ite`),
  ADD KEY `DeliverymanItem` (`cod_del_ite`);  
 
  
--
-- Indexes for table `item`
--
ALTER TABLE `tb_item`
  ADD PRIMARY KEY (`cod_ite`,`cod_del_ite`,`cod_emp_ite`,`cod_cli_ite`,`cod_req_ite`,`cod_men_ite`,`quantit_ite`),
  ADD KEY `RequestItem` (`cod_req_ite`,`cod_cli_ite`,`cod_emp_ite`,`cod_del_ite`),
  ADD KEY `MenuItem` (`cod_men_ite`),
  ADD KEY `DeliverymanItem` (`cod_del_ite`),
  ADD KEY `EmployeeItem` (`cod_emp_ite`),
  ADD KEY `ClientItem` (`cod_cli_ite`);
 
--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `tb_item`
  MODIFY `cod_ite` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- Constraints for dumped tables 

--
-- Limitadores para a tabela `item`
--
ALTER TABLE `tb_item`
  ADD CONSTRAINT `FK_MenuItem` FOREIGN KEY (`cod_men_ite`) REFERENCES `tb_menu` (`cod_men`),
  ADD CONSTRAINT `FK_ClientItem` FOREIGN KEY (`cod_cli_ite`) REFERENCES `tb_client` (`cod_cli`),
  ADD CONSTRAINT `FK_DeliverymanItem` FOREIGN KEY (`cod_del_ite`) REFERENCES `tb_deliveryman` (`cod_del`),
  ADD CONSTRAINT `FK_EmployeeItem` FOREIGN KEY (`cod_emp_ite`) REFERENCES `tb_employee` (`cod_emp`),
  ADD CONSTRAINT `FK_equestItem` FOREIGN KEY (`cod_req_ite`) REFERENCES `tb_request` (`cod_req`);
 
 
 

ALTER TABLE dbpizzerias.tb_request ADD CONSTRAINT FK_requestClient FOREIGN KEY (cod_cli_req) REFERENCES dbpizzerias.tb_client(cod_cli);
ALTER TABLE dbpizzerias.tb_request ADD CONSTRAINT FK_requestEmploy FOREIGN KEY (cod_emp_req) REFERENCES dbpizzerias.tb_employee(cod_emp);
ALTER TABLE dbpizzerias.tb_request ADD CONSTRAINT FK_requestDelive FOREIGN KEY (cod_del_req) REFERENCES dbpizzerias.tb_deliveryman(cod_del);

ALTER TABLE dbpizzerias.tb_item ADD CONSTRAINT FK_itemtDeliveryman FOREIGN KEY (cod_del_ite) REFERENCES dbpizzerias.tb_deliveryman(cod_del);
ALTER TABLE dbpizzerias.tb_item ADD CONSTRAINT FK_itemEmployee 	   FOREIGN KEY (cod_emp_ite) REFERENCES dbpizzerias.tb_employee(cod_emp);
ALTER TABLE dbpizzerias.tb_item ADD CONSTRAINT FK_itemClient	   FOREIGN KEY (cod_cli_ite) REFERENCES dbpizzerias.tb_client(cod_cli);
ALTER TABLE dbpizzerias.tb_item ADD CONSTRAINT FK_itemRequest	   FOREIGN KEY (cod_req_ite) REFERENCES dbpizzerias.tb_request(cod_req);
ALTER TABLE dbpizzerias.tb_item ADD CONSTRAINT FK_itemMenu 		   FOREIGN KEY (cod_men_ite) REFERENCES dbpizzerias.tb_menu(cod_men);

ALTER TABLE tb_request 
ADD status_req varchar(50);

ALTER TABLE tb_request 
ADD time_cad_req time;


select * from tb_request;
select * from tb_item;
select * from tb_deliveryman;
select * from tb_employee;

delete from tb_request; 


ALTER TABLE tb_request 
ADD time_cad_req` time;
