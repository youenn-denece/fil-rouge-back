DROP DATABASE it-training;
CREATE DATABASE it-training;
USE it-training;


=> Lancer le projet spring

=> Effectuer les INSERT ci-dessous



***** Table Category *****

INSERT INTO category (name) VALUES("Langages");
INSERT INTO category (name) VALUES("Technologies du Web");
INSERT INTO category (name) VALUES("Bases de données");
INSERT INTO category (name) VALUES("Sécurité");
INSERT INTO category (name) VALUES("Réseaux");

***** Table Course *****

INSERT INTO course(name,description,category_id) VALUES("Java","Java est un langage de programmation orienté objet créé par James Gosling et Patrick Naughton, employés de Sun Microsystems, avec le soutien de Bill Joy, présenté officiellement le 23 mai 1995 au .SunWorld La société Sun a été ensuite rachetée en 2009 par la société Oracle qui détient et maintient désormais Java.", 1);
INSERT INTO course(name,description,category_id) VALUES("R","R est un langage de programmation et un logiciel libre destiné aux statistiques et à la science des données soutenu par la R Foundation for Statistical Computing. Il fait partie de la liste des paquets GNU et est écrit en C, Fortran et R. GNU R est un logiciel libre distribué selon les termes de la licence GNU GPL.", 1);
INSERT INTO course(name,description,category_id) VALUES("Angular","Angular est un framework pour clients, open source, basé sur TypeScript et codirigé par l'équipe du projet « Angular » chez Google ainsi que par une communauté de particuliers et de sociétés. Angular est une réécriture complète d'AngularJS, cadriciel construit par la même équipe. ", 2);
INSERT INTO course(name,description,category_id) VALUES("Python","Python est un langage de programmation interprété, multiparadigme et multiplateformes. Il favorise la programmation impérative structurée, fonctionnelle et orientée objet.", 1);
INSERT INTO course(name,description,category_id) VALUES("HTML/CSS","HTML, c'est : Hyper Text Markup Language ou langage de balise pour l'hypertexte. CSS, c'est : Cascading Style Sheets ou feuilles de style en cascade.", 1);
INSERT INTO course(name,description,category_id) VALUES("PHP","PHP: Hypertext Preprocessor, plus connu sous son sigle PHP, est un langage de programmation libre, principalement utilisé pour produire des pages Web dynamiques via un serveur HTTP, mais pouvant également fonctionner comme n'importe quel langage interprété de façon locale. PHP est un langage impératif orienté objet.", 1);
INSERT INTO course(name,description,category_id) VALUES("Cobol","Cobol est un langage de programmation créé en 1959. Son nom est l’acronyme de COmmon Business Oriented Language qui révèle sa vocation originelle : être un langage commun pour la programmation d'applications de gestion.", 1);
INSERT INTO course(name,description,category_id) VALUES("C++","C++ est un langage de programmation compilé permettant la programmation sous de multiples paradigmes, dont la programmation procédurale, la programmation orientée objet et la programmation générique. ", 1);
INSERT INTO course(name,description,category_id) VALUES("Spring","Spring est un framework open source pour construire et définir l'infrastructure d'une application Java, dont il facilite le développement et les tests. En 2004, Rod Johnson a écrit le livre Expert One-on-One J2EE Design and Development qui explique les raisons de la création de Spring.", 2);
INSERT INTO course(name,description,category_id) VALUES("MySQL Workbench","MySQL Workbench est un logiciel de gestion et d'administration de bases de données MySQL créé en 2004. ", 3);
INSERT INTO course(name,description,category_id) VALUES("CRUD","L'acronyme informatique anglais CRUD désigne les quatre opérations de base pour la persistance des données, en particulier le stockage d'informations en base de données. Soit : create : créer read : lire update : mettre à jour delete : supprimer.", 2);
INSERT INTO course(name,description,category_id) VALUES("Hibernate","Hibernate est un framework open source gérant la persistance des objets en base de données relationnelle.", 2);
INSERT INTO course(name,description,category_id) VALUES("phpMyAdmin","phpMyAdmin est une application Web de gestion pour les systèmes de gestion de base de données MySQL et MariaDB, réalisée principalement en PHP et distribuée sous licence GNU GPL.", 3);
INSERT INTO course(name,description,category_id) VALUES("Réseau TCP/IP","La suite des protocoles Internet est l'ensemble des protocoles utilisés pour le transfert des données sur Internet. Elle est aussi appelée suite TCP/IP, DoD Standard ou bien DoD Model ou encore DoD TCP/IP ou US DoD Model. Elle est souvent appelée TCP/IP, d'après le nom de ses deux premiers protocoles : TCP et IP.", 5);
INSERT INTO course(name,description,category_id) VALUES("Sécurité informatique","La sécurité des systèmes d’information (SSI) ou plus simplement sécurité informatique, est l’ensemble des moyens techniques, organisationnels, juridiques et humains nécessaires à la mise en place de moyens visant à empêcher l'utilisation non autorisée, le mauvais usage, la modification ou le détournement du système d'information. Assurer la sécurité du système d'information est une activité du management du système d'information.", 4);

***** Table Campus *****

INSERT INTO campus (name,city) VALUES("Centre des Rossignols","Nantes");
INSERT INTO campus (name,city) VALUES("Centre Pricipal","Paris");
INSERT INTO campus (name,city) VALUES("Centre du bout du monde","Brest");
INSERT INTO campus (name,city) VALUES("Centre rose","Toulouse");

***** Table Classroom *****

INSERT INTO classroom(campus_id,room_number) VALUES(1,102);
INSERT INTO classroom(campus_id,room_number) VALUES(1,103);
INSERT INTO classroom(campus_id,room_number) VALUES(2,202);
INSERT INTO classroom(campus_id,room_number) VALUES(2,203);
INSERT INTO classroom(campus_id,room_number) VALUES(3,302);
INSERT INTO classroom(campus_id,room_number) VALUES(3,303);
INSERT INTO classroom(campus_id,room_number) VALUES(4,401);
INSERT INTO classroom(campus_id,room_number) VALUES(4,402);
INSERT INTO classroom(campus_id,room_number) VALUES(4,403);
INSERT INTO classroom(campus_id,room_number) VALUES(4,404);


***** Table User (Teacher) *****

INSERT INTO user (user_type,email,firstname,lastname,password,grade,course_id) VALUES ("Teacher","xavier@gmail.com","Xavier","Bourget","12345", 18.50, 1);
INSERT INTO user (user_type,email,firstname,lastname,password,grade,course_id) VALUES ("Teacher","maxime@gmail.com","Maxime","Norval","12345", 17.50, 3);
INSERT INTO user (user_type,email,firstname,lastname,password,grade,course_id) VALUES ("Teacher","mohamed@gmail.com","Mohamed","Aijjou","12345", 20.00, 9);
INSERT INTO user (user_type,email,firstname,lastname,password,grade,course_id) VALUES ("Teacher","christopher@gmail.com","Christopher","Loisel","12345", 16.50, 12);

***** Table User (Student) *****

INSERT INTO user (user_type,email,firstname,lastname,password,company) VALUES ("Student","alexandra@gmail.com","Alexandra","Masi","12345", "Sogeti");
INSERT INTO user (user_type,email,firstname,lastname,password,company) VALUES ("Student","youenn@gmail.com","Youenn","Denece","12345", null);
INSERT INTO user (user_type,email,firstname,lastname,password,company) VALUES ("Student","nathan@gmail.com","Nathan","Caceres","12345", null);
INSERT INTO user (user_type,email,firstname,lastname,password,company) VALUES ("Student","lucie@gmail.com","Lucie","Rouault","12345", null);

***** Table Session *****

INSERT INTO session ( end_date, is_inter, max_student_number, price, start_date, campus_id, classroom_id, course_id, teacher_id) 
VALUES ('2023-02-10', true, '20', '210.50', '2023-02-08', 2, 3, 1, 1);
INSERT INTO session ( end_date, is_inter, max_student_number, price, start_date, campus_id, classroom_id, course_id, teacher_id) 
VALUES ('2023-03-10', true, '25', '2500.50', '2023-03-06', 1, 1, 3, 2);
INSERT INTO session ( end_date, is_inter, max_student_number, price, start_date, campus_id, classroom_id, course_id, teacher_id) 
VALUES ('2023-04-14', true, '18', '2500.50', '2023-04-10', 1, null, 1, 1);
INSERT INTO session ( end_date, is_inter, max_student_number, price, start_date, campus_id, classroom_id, course_id, teacher_id) 
VALUES ('2023-05-12', true, '6', '2500.50', '2023-05-08', 3, null, 1, null);