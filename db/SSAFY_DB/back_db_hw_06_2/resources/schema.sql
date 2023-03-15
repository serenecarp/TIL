CREATE DATABASE IF NOT EXISTS ssafy_user;

use ssafy_user;

drop table if exists user;
drop table if exists board;

CREATE TABLE `user` (
	`id` varchar(40) NOT NULL PRIMARY KEY,
    `password` varchar(40) NOT NULL,
    `name` varchar(40) NOT NULL,
    `email` varchar(40) NOT NULL,
    `age` int NOT NULL
)ENGINE=InnoDB;

CREATE TABLE `board` (
	`num` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `createtime` datetime,
    `title` varchar(40) NOT NULL,
    `content` varchar(100) NOT NULL,
    `writername` varchar(40) NOT NULL
)ENGINE=InnoDB;



INSERT INTO `user` (id, password, name, email, age) 
VALUES
('BlackWidow', '1278','나타샤 로마노프', 'blackwidow@ssafy.com', 38),
('CaptainAmerica', '5678','스티브 로저스', 'Captain@ssafy.com', 30),
('Hulk', '2486','브루스 배너', 'hulk@ssafy.com', 54),
('Ironman', '1234','토니 스타크', 'ironman@ssafy.com', 53),
('Thor', '1111','토르', 'GodOfThunder@ssafy.com', 1500),
('Ultron', '2355','울트론', 'ultron@ssafy.com', 0);


INSERT INTO `board` (num, createtime, title, content, writername)
VALUES 
(0, '2015-04-23 12:00:00','지구의 적은 인류다', '어벤져스만 아니었다면...' ,'울트론'),
(0, '2015-04-23 13:00:00','울트론님 왜 제말을 안들으세요', '아빠말을 잘 안듣는 어린이네요', '토니 스타크'),
(0, '2017-10-25 17:00:00','헐크님 정신이 드시나요?', '살살 하걸 그랬네요..','토르'),
(0, '2017-10-25 17:10:10','헐크님 말좀 해보세요','아직도 누워계신가요?', '토르'),
(0, '2017-10-25 17:15:20','헐크 그만괴롭히세요 토르님','왜 자꾸 우리 헐크 기를 죽이고 그래요', '나타샤 로마노프'),
(0, '2019-04-29 09:10:00','묠니르 가벼군요','깃털처럼 가벼워요', '스티브 로저스'),
(0, '2019-04-24 09:10:00','헐크버스터 최고','너무 재밌네요', '브루스 배너');

commit;

select * from user;
select * from board;

#1.	user 테이블에 전채 몇개의 행이 있는지 조회하시오.
select COUNT(*) as '사용자 수' from user;

#2.	전체 user의 age 평균을 조회하시오.
select AVG(age) as '평균' from user;

#3.	전체 사용자의 age 합을 조회하시오.
select SUM(age) as '총 합' from user;

#4.	age가 35 이상인 사용자의 age 평균을 둘째짜리 까지 반올림 하여 조회하시오.
select ROUND(AVG(age), 2) as '평균' from user where age >= 35;

#5.	writername로 그룹핑 했을때 각 사용자가 몇 개의 board를 가지고 있는지 조회하시오.
select writername, COUNT(*) as '개수' from board GROUP BY writername;

#6.	board 를 writername로 그룹핑 했을때 각 이름이 ‘토르’ 인 사용자의 의 제일 최근 create time을 조회하시오.
select writername, MIN(createtime) as '날짜' from board GROUP BY writername HAVING writername = '토르';

#7.	board 를 writername로 그룹핑 했을 때 2017년 이후 각 사용자가 몇 개의 board를 가지고 있는지 조회하시오.
select writername, createtime, COUNT(*) as '개수' from board GROUP BY writername HAVING createtime > '2017-01-01 00:00:00'


