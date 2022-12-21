into clients (company_name, first_name, last_name, email, phone, address, zip_code, city, country, state) values ('Capgemini','Fabrice','Martin','martin@mail.com','0656858433','abc','xyz','Nantes','France',0);
insert into clients (company_name, first_name, last_name, email, phone, address, zip_code, city, country, state) values ('M2I Formation','Julien','Lamard','lamard@mail.com','0611223344','abc','xyz','Paris','France',1);
insert into clients (company_name, first_name, last_name, email, phone, address, zip_code, city, country, state) values ('ATOS','Lydia','Caufeild','lcaufeild@atos.com','0653422423','abc','xyz','Metz','France',1);
insert into clients (company_name, first_name, last_name, email, phone, address, zip_code, city, country, state) values ('SOPRA STERIA','Abdelali','AKHYAT','a.akhyat@sopra-steria.com','0753819231','abc','xyz','Paris','France',0);

insert into orders (type_presta, designation, client_id, nb_days, unitPrice, state) values ('Formation','Angular init',2,3,1200,0);
insert into orders (type_presta, designation, client_id, nb_days, unitPrice, state) values ('Formation','React avancé',2,3,1000,2);
insert into orders (type_presta, designation, client_id, nb_days, unitPrice, state) values ('Coaching','React Techlead',1,20,900,2);
insert into orders (type_presta, designation, client_id, nb_days, unitPrice, state) values ('Coaching','Nest.js Techlead',1,50,800,1);
insert into orders (type_presta, designation, client_id) values ('Coaching','React Teachead',3);
insert into orders (type_presta, designation, client_id) values ('Coaching','Jakarta EE',3);
insert into orders (type_presta, designation, client_id) values ('Coaching','Angular Techlead',4);
insert into orders (type_presta, designation, client_id) values ('Coaching','Vue.js',4);
insert into orders (type_presta, designation, client_id) values('Formation','JavaScript',2);
insert into orders (type_presta, designation, client_id) values('Formation','HTML/CSS',1);