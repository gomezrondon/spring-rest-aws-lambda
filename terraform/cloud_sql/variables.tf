variable "project" { 
    default = "[project-id]"
}

variable "region" {
  default = "us-west1"
}

variable "zone" {
  default = "us-west1-a"
}

variable "machine_type" {
  type = "map"
  default = {
    dev = "f1-micro"
    prod = "n1-standard-1"
  }
}

variable "image" {
  default = "debian-cloud/debian-9"
}



//---------------db config
variable "tier" {default = "db-f1-micro"}
variable "name" {default = "dbserver"}
variable "db_region" {default = "us-central1"}
variable "disk_size" {default = 10}
variable "db_version" {default = "MYSQL_5_7"}
variable "user_host" {default = "%"}
variable "user_name" {default = "admin"}
variable "user_password" {default = "***********"}
variable "replication_type" {default = "SYNCHRONOUS"}
variable "activation_policy" {default = "always"}
//------------- database
variable "db_name" {default = "Employee"}

/*
use Employee;

# from cloud sql table name in lowcase
CREATE TABLE employee (
id BIGINT NOT NULL AUTO_INCREMENT,
firstName CHAR(50) NOT NULL,
lastName CHAR(50) NOT NULL,
primary_skills CHAR(255),
location CHAR(255),
PRIMARY KEY (id)
);

insert into employee( firstName, lastName) values('javier', 'gomez');
insert into employee(id, firstName, lastName) values(2,'pepe', 'rondon');
insert into employee(id, firstName, lastName) values(3,'maria', 'gonzalez');
insert into employee(id, firstName, lastName) values(4,'carla', 'gil');
insert into employee(id, firstName, lastName) values(5,'eduardo', 'gil');

mysql> select * from company.employee;
+----+-----------+----------+----------------+----------+
| id | firstName | lastName | primary_skills | location |
+----+-----------+----------+----------------+----------+
|  1 | javier    | gomez    | NULL           | NULL     |
|  2 | pepe      | rondon   | NULL           | NULL     |
|  3 | maria     | gonzalez | NULL           | NULL     |
|  4 | carla     | gil      | NULL           | NULL     |
|  5 | eduardo   | gil      | NULL           | NULL     |
+----+-----------+----------+----------------+----------+
5 rows in set (0.03 sec)
*/