-- 1. test_movie라는 이름으로 새로운 schema를 생성하고, 해당 스키마를 사용한다.
CREATE DATABASE IF NOT EXISTS test_movie;
USE test_movie;

-- 2. 만약 movie라는 테이블이 존재한다면 삭제한다.
DROP TABLE IF EXISTS movie;

-- 3. test_movie에 movie 테이블을 생선한다.
CREATE TABLE movie (
	ID INT NOT NULL,
    Title VARCHAR(40) NOT NULL,
    ReleaseDate DATE,
    RunningTime INT NOT NULL
);

-- 4. movie 테이블에 Director 컬럼 삽입하기
ALTER TABLE movie ADD Director varchar(40) NOT NULL;

-- 5. movie 테이블의 Director 컬럼 변경하기 (varchar(32), Nullable=YES)
ALTER TABLE movie MODIFY Director varchar(32);

-- 6. Director 컬럼 삭제하기
ALTER TABLE movie DROP COLUMN Director;

DESC movie;

-- 7. movie 테이블에 아래와 같은 데이터를 삽입하기
INSERT INTO movie
VALUES(1000, '이터널스', '2021-11-05', 156),
(1001, '트랜스포터', '2002-10-02', 92),
(1002, '해리포터와 마법사의돌', '2001-12-14', 152),
(1003, '해리포터와 비밀의방', '2002-12-14', 162),
(1004, '기생충', '2019-05-30', 153);

-- 8. ID가 1003인 영화의 Title을 '해리포터와 불의 잔'으로 변경하기
UPDATE movie
SET Title = '해리포터와 불의 잔' WHERE ID=1003;

-- 9. RunningTime이 100 이하인 영화 삭제하기
DELETE FROM movie
WHERE RunningTime <= 100;

-- 10. movie 테이블에 있는 모든 data 삭제하기
DELETE FROM movie;


SELECT * FROM movie;
