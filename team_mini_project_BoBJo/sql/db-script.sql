create table tbl_category
(categoryNum integer auto_increment comment '카테고리번호',
 categoryName varchar(30) not null comment '카테고리명',
 primary key (categoryNum));

CREATE TABLE tbl_menu
(
    menuNum INTEGER auto_increment COMMENT '메뉴번호',
    menuName VARCHAR(30) NOT NULL COMMENT '메뉴명',
    categoryNum INTEGER NOT NULL COMMENT '카테고리번호',
    countingChoices INTEGER COMMENT '선택된횟수',
    PRIMARY KEY ( menuNum )
) COMMENT = '메뉴';

CREATE UNIQUE INDEX tbl_menu_PK ON tbl_menu
    ( menuNum );

insert into tbl_category values (null, '한식');
insert into tbl_category values (null, '일식');
insert into tbl_category values (null, '양식');
insert into tbl_category values (null, '중식');

insert into tbl_menu values (null, '비빔밥', 1, null);
insert into tbl_menu values (null, '김밥', 1, null);
insert into tbl_menu values (null, '육회', 1, null);
insert into tbl_menu values (null, '불고기', 1, null);
insert into tbl_menu values (null, '김치찌개', 1, null);
insert into tbl_menu values (null, '된장찌개', 1, null);
insert into tbl_menu values (null, '순두부찌개', 1, null);
insert into tbl_menu values (null, '떡볶이', 1, null);
insert into tbl_menu values (null, '닭갈비', 1, null);
insert into tbl_menu values (null, '치킨', 1, null);
insert into tbl_menu values (null, '육개장', 1, null);
insert into tbl_menu values (null, '돌솥비빔밥', 1, null);
insert into tbl_menu values (null, '돈까스', 1, null);
insert into tbl_menu values (null, '삼겹살', 1, null);
insert into tbl_menu values (null, '갈비', 1, null);
insert into tbl_menu values (null, '쭈꾸미 볶음', 1, null);
insert into tbl_menu values (null, '순대국밥', 1, null);
insert into tbl_menu values (null, '설렁탕', 1, null);
insert into tbl_menu values (null, '고기국밥', 1, null);
insert into tbl_menu values (null, '뼈해장국', 1, null);
insert into tbl_menu values (null, '해물철판볶음밥', 1, null);
insert into tbl_menu values (null, '보쌈', 1, null);
insert into tbl_menu values (null, '낙지볶음밥', 1, null);
insert into tbl_menu values (null, '오므라이스', 1, null);
insert into tbl_menu values (null, '잔치국수', 1, null);

INSERT INTO tbl_menu VALUES (null, '스시', 2,null);
INSERT INTO tbl_menu VALUES (null, '라멘', 2,null);
INSERT INTO tbl_menu VALUES (null, '돈카츠', 2,null);
INSERT INTO tbl_menu VALUES (null, '우동', 2,null);
INSERT INTO tbl_menu VALUES (null, '회', 2,null);
INSERT INTO tbl_menu VALUES (null, '알밥', 2,null);
INSERT INTO tbl_menu VALUES (null, '야키토리(닭꼬치구이)', 2,null);
INSERT INTO tbl_menu VALUES (null, '오코노미야끼', 2,null);
INSERT INTO tbl_menu VALUES (null, '타코야끼', 2,null);
INSERT INTO tbl_menu VALUES (null, '야키니쿠', 2,null);
INSERT INTO tbl_menu VALUES (null, '샤브샤브', 2,null);
INSERT INTO tbl_menu VALUES (null, '밀푀유나베', 2,null);
INSERT INTO tbl_menu VALUES (null, '오니기리', 2,null);
INSERT INTO tbl_menu VALUES (null, '돈부리', 2,null);
INSERT INTO tbl_menu VALUES (null, '텐동', 2,null);

INSERT INTO tbl_menu VALUES (null, '치킨 키에프', 3,null);
INSERT INTO tbl_menu VALUES (null, '피자', 3,null);
INSERT INTO tbl_menu VALUES (null, '소고기 스테이크', 3,null);
INSERT INTO tbl_menu VALUES (null, '토마토 파스타', 3,null);
INSERT INTO tbl_menu VALUES (null, '알리오 올리오', 3,null);
INSERT INTO tbl_menu VALUES (null, '크림 파스타', 3,null);
INSERT INTO tbl_menu VALUES (null, '해물 파스타', 3,null);
INSERT INTO tbl_menu VALUES (null, '햄버거', 3,null);
INSERT INTO tbl_menu VALUES (null, '봉골레 스파게티', 3,null);
INSERT INTO tbl_menu VALUES (null, '랍스터', 3,null);
INSERT INTO tbl_menu VALUES (null, '비스크', 3,null);
INSERT INTO tbl_menu VALUES (null, '피쉬 앤 칩스', 3,null);
INSERT INTO tbl_menu VALUES (null, '비프 타코', 3,null);
INSERT INTO tbl_menu VALUES (null, '에그 베네딕트', 3,null);
INSERT INTO tbl_menu VALUES (null, '치킨 마살라', 3,null);

INSERT INTO tbl_menu(menuNum,menuName, categoryNum, countingChoices)
VALUES
    (NULL, '짜장면', 4, NULL),
    (NULL, '짬뽕', 4, NULL),
    (NULL, '탕수육', 4, NULL),
    (NULL, '우육면', 4, NULL),
    (NULL, '양장피', 4, NULL),
    (NULL, '마파두부', 4, NULL),
    (NULL, '중식볶음밥', 4, NULL),
    (NULL, '마라탕', 4, NULL),
    (NULL, '마라샹궈', 4, NULL),
    (NULL, '꿔바로우', 4, NULL),
    (NULL, '지삼선', 4, NULL),
    (NULL, '꽁바오지띵', 4, NULL),
    (NULL, '훠궈', 4, NULL),
    (NULL, '만두', 4, NULL),
    (NULL, '차오미엔', 4, NULL)