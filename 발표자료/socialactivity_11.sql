CREATE TABLE `CLUB` (
	`CLUB_NUM`	INT(11)	NOT NULL AUTO_INCREMENT,
	`CLUB_NAME`	VARCHAR(30)	NOT NULL UNIQUE,
	`CLUB_MAXCOUNT`	INT(11)	NOT NULL,
	`CLUB_AGE`	INT(11)	NOT NULL,
	`CLUB_LOCATION`	VARCHAR(30)	NOT NULL,
	`CLUB_TIER`	VARCHAR(30)	NOT NULL,
	`CLUB_DESCRIPTION`	VARCHAR(30)	NOT NULL,
	`CLUB_EMBLEMPATH`	VARCHAR(50)	NOT NULL,
	`CLUB_SEX`	BOOLEAN	NOT NULL,
	`CLUB_PW`	VARCHAR (30) NOT NULL,
	PRIMARY KEY (`CLUB_NUM`)
);

CREATE TABLE `ALBUM` (
	`ALBUM_NUM`	INT(11)	NOT NULL AUTO_INCREMENT,
	`CLUB_NUM`	INT(11)	NOT NULL,
	`IMAGE_NAME`	VARCHAR (30)	NOT NULL,
	`IMAGE_PATH`	VARCHAR (50)	NOT NULL,
	PRIMARY KEY (`ALBUM_NUM`)
);

CREATE TABLE `BOARD` (
	`BOARD_NUM`	INT(11)	NOT NULL AUTO_INCREMENT,
	`CLUB_NUM`	INT(11)	NOT NULL,
	`BOARD_TITLE`	VARCHAR(30)	NOT NULL,
	`BOARD_CONTENT`	VARCHAR(100)	NOT NULL,
	`BOARD_WRITER`	VARCHAR(30)	NOT NULL,
	PRIMARY KEY (`BOARD_NUM`)
);

CREATE TABLE `ACTIVITY` (
	`ACTIVITY_NUM`	INT(11)	NOT NULL AUTO_INCREMENT,
	`CLUB_NUM`	INT(11)	NOT NULL,
	`ACTIVITY_TITLE`	VARCHAR(50)	NOT NULL,
	`ACTIVITY_DESCRIPTION`	VARCHAR(100)	NOT NULL,
	PRIMARY KEY (`ACTIVITY_NUM`)
);

CREATE TABLE `COMMENT` (
	`COMMENT_NUM`	INT(11)	NOT NULL AUTO_INCREMENT,
	`BOARD_NUM`	INT(11)	NOT NULL,
	`CLUB_NUM`	INT(11)	NOT NULL,
	`COMMENT_CONTENT`	VARCHAR(100)	NOT NULL,
	`COMMENT_WRITER`	VARCHAR(30)	NOT NULL,
	PRIMARY KEY (`COMMENT_NUM`)
);

CREATE TABLE `USER` (
	`USER_NUM`	INT(11)	NOT NULL AUTO_INCREMENT,
	`USER_NAME`	VARCHAR(30)	NOT NULL,
	`USER_ID`	VARCHAR(30)	NOT NULL UNIQUE,
	`USER_PW`	VARCHAR(30)	NOT NULL,
	`USER_LOCATION`	VARCHAR(30)	NOT NULL,
	`USER_AGE`	INT(11)	NOT NULL,
	`USER_SEX`	BOOLEAN	NOT NULL,
	`USER_TIER`	VARCHAR(10) NOT NULL,
	`USER_SCORE` INT(11) NOT NULL,
	PRIMARY KEY (`USER_NUM`)
);

CREATE TABLE `ROLE` (
	`ROLE_NUM`	INT(11)	NOT NULL AUTO_INCREMENT,
	`ROLE_NAME`	VARCHAR(30)	NOT NULL,
	`ROLE_DESCRIPTION`	VARCHAR(50)	NOT NULL,
	PRIMARY KEY (`ROLE_NUM`)
);

CREATE TABLE `CLUB_MEMBER` (
	`MEMBER_NUM`	INT(11)	NOT NULL AUTO_INCREMENT,
	`ROLE_NUM`	INT(11)	NOT NULL,
	`CLUB_NUM`	INT(11)	NOT NULL,
	`USER_NUM`	INT(11)	NOT NULL,
	PRIMARY KEY (`MEMBER_NUM`)
);

CREATE TABLE `ACTIVITY_MEMBER` (
    `ACTIVITY_MEMBER_NUM`    INT(11)    NOT NULL AUTO_INCREMENT,
    `ACTIVITY_NUM`    INT(11)    NOT NULL,
    `CLUB_NUM`    INT(11)    NOT NULL,
    `USER_NUM`  INT(11) NOT NULL,
    
    PRIMARY KEY (`ACTIVITY_MEMBER_NUM`)
);

ALTER TABLE `ALBUM` ADD CONSTRAINT `FK_CLUB_TO_ALBUM_1` FOREIGN KEY (
	`CLUB_NUM`
)
REFERENCES `CLUB` (
	`CLUB_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `BOARD` ADD CONSTRAINT `FK_CLUB_TO_BOARD_1` FOREIGN KEY (
	`CLUB_NUM`
)
REFERENCES `CLUB` (
	`CLUB_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `ACTIVITY` ADD CONSTRAINT `FK_CLUB_TO_ACTIVITY_1` FOREIGN KEY (
	`CLUB_NUM`
)
REFERENCES `CLUB` (
	`CLUB_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `COMMENT` ADD CONSTRAINT `FK_BOARD_TO_COMMENT_1` FOREIGN KEY (
	`BOARD_NUM`
)
REFERENCES `BOARD` (
	`BOARD_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `COMMENT` ADD CONSTRAINT `FK_BOARD_TO_COMMENT_2` FOREIGN KEY (
	`CLUB_NUM`
)
REFERENCES `BOARD` (
	`CLUB_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `CLUB_MEMBER` ADD CONSTRAINT `FK_ROLE_TO_CLUB_MEMBER_1` FOREIGN KEY (
	`ROLE_NUM`
)
REFERENCES `ROLE` (
	`ROLE_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `CLUB_MEMBER` ADD CONSTRAINT `FK_CLUB_TO_CLUB_MEMBER_1` FOREIGN KEY (
	`CLUB_NUM`
)
REFERENCES `CLUB` (
	`CLUB_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `CLUB_MEMBER` ADD CONSTRAINT `FK_USER_TO_CLUB_MEMBER_1` FOREIGN KEY (
    `USER_NUM`
)
REFERENCES `USER` (
    `USER_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `ACTIVITY_MEMBER` ADD CONSTRAINT `FK_ACTIVITY_TO_ACTIVITY_MEMBER_1` FOREIGN KEY (
    `ACTIVITY_NUM`
)
REFERENCES `ACTIVITY` (
    `ACTIVITY_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `ACTIVITY_MEMBER` ADD CONSTRAINT `FK_ACTIVITY_TO_ACTIVITY_MEMBER_2` FOREIGN KEY (
    `CLUB_NUM`
)
REFERENCES `ACTIVITY` (
    `CLUB_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

ALTER TABLE `ACTIVITY_MEMBER` ADD CONSTRAINT `FK_USER_TO_ACTIVITY_MEMBER_1` FOREIGN KEY (
    `USER_NUM`
)
REFERENCES `USER` (
    `USER_NUM`
)
ON DELETE CASCADE
ON UPDATE RESTRICT;

INSERT INTO ROLE(ROLE_NUM, ROLE_NAME, ROLE_DESCRIPTION)
VALUES(1, '리더', '최고 관리자 (1등급)');

INSERT INTO ROLE(ROLE_NUM, ROLE_NAME, ROLE_DESCRIPTION)
VALUES(2, '운영진', '중간 관리자 (2등급)');

INSERT INTO ROLE(ROLE_NUM, ROLE_NAME, ROLE_DESCRIPTION)
VALUES(3, '회원', '일반 회원 (3등급)');
