
DROP TABLE "MOIMUSER";
DROP TABLE "MOIMANS";
DROP TABLE "IMGBOARDANS";
DROP TABLE "IMGBOARD";
DROP TABLE "MOIM";
DROP TABLE "FREEBOARDANS";
DROP TABLE "FREEBOARD";
DROP TABLE "GROUPUSER";
DROP TABLE "GROUPINFO";
DROP TABLE "USERINFO";
DROP TABLE "SESSIONIDS";

DROP SEQUENCE "GROUPSEQ";
DROP SEQUENCE "BOARDSEQ";
DROP SEQUENCE "BOARDANSSEQ";
DROP SEQUENCE "MOIMSEQ";
DROP SEQUENCE "MOIMANSSEQ";
DROP SEQUENCE "IMGBOARDSEQ";
DROP SEQUENCE "IMGBOARDANSSEQ";

CREATE SEQUENCE "GROUPSEQ";
CREATE SEQUENCE "BOARDSEQ";
CREATE SEQUENCE "BOARDANSSEQ";
CREATE SEQUENCE "MOIMSEQ";
CREATE SEQUENCE "MOIMANSSEQ";
CREATE SEQUENCE "IMGBOARDSEQ";
CREATE SEQUENCE "IMGBOARDANSSEQ";

CREATE TABLE "USERINFO" (
   "USERID"   VARCHAR2(100)      NOT NULL,
   "USERPW"   VARCHAR2(100)      NOT NULL,
   "USERGRADE"   VARCHAR2(100)      NOT NULL,
   "USERNAME"   VARCHAR2(100)      NULL,
   "USERBIRTH"   VARCHAR2(100)      NOT NULL,
   "USEREMAIL"   VARCHAR2(1000)      NULL,
   "USERADDR"   VARCHAR2(1000)      NOT NULL,
   "USERGENDER"   VARCHAR2(100)      NOT NULL,
   "USERPHONE"   VARCHAR2(100)      NOT NULL,
   "USERREGDATE"   DATE      NOT NULL
);

CREATE TABLE "GROUPINFO" (
   "GROUPNO"   NUMBER      NOT NULL,
   "GROUPTITLE"   VARCHAR2(100)      NULL,
   "GROUPCONTENT"   VARCHAR2(1000)      NOT NULL,
   "GROUPREGDATE"   DATE      NOT NULL,
   "GROUPIMG"   VARCHAR2(1000)      NULL
);

CREATE TABLE "GROUPUSER" (
   "USERID"   VARCHAR2(100)      NOT NULL,
   "GROUPNO"   NUMBER      NOT NULL,
   "GROUPUSERGRADE"   VARCHAR2(100)      NOT NULL,
   "GROUPUSERREGDATE"   DATE      NOT NULL
);

CREATE TABLE "FREEBOARD" (
   "BOARDNO"   NUMBER      NOT NULL,
   "USERID"   VARCHAR2(100)      NOT NULL,
   "GROUPNO"   NUMBER      NOT NULL,
   "BOARDTITLE"   VARCHAR2(100)      NOT NULL,
   "BOARDCONTENT"   VARCHAR2(1000)      NOT NULL,
   "BOARDREGDATE"   DATE      NOT NULL
);

CREATE TABLE "MOIMUSER" (
   "MOIMNO"   NUMBER      NOT NULL,
   "USERID"   VARCHAR2(100)      NOT NULL,
   "GROUPNO"   NUMBER      NOT NULL,
   "MOIMQ1"   NUMBER      NULL,
   "MOIMQ2"   NUMBER      NULL,
   "MOIMQ3"   NUMBER      NULL,
   "MOIMQ4"   NUMBER      NULL,
   "MOIMQ5"   NUMBER      NULL,
   "MOIMQ6"   VARCHAR2(100)      NULL
);

CREATE TABLE "FREEBOARDANS" (
   "BOARDANSNO"   NUMBER      NOT NULL,
   "BOARDNO"   NUMBER      NOT NULL,
   "USERID"   VARCHAR2(100)      NOT NULL,
   "GROUPNO"   NUMBER      NOT NULL,
   "BOARDANSCONTENT"   VARCHAR2(1000)      NOT NULL,
   "BOARDANSREGDATE"   DATE      NOT NULL
);

CREATE TABLE "IMGBOARD" (
   "IMGBOARDNO"   NUMBER      NOT NULL,
   "MOIMNO"   NUMBER      NOT NULL,
   "USERID"   VARCHAR2(100)      NOT NULL,
   "GROUPNO"   NUMBER      NOT NULL,
   "IMGBOARDTITLE"   VARCHAR2(100)      NULL,
   "IMGBOARDCONTENT"   VARCHAR2(1000)      NULL,
   "IMGBOARDREGDATE"   DATE      NULL
);

CREATE TABLE "IMGBOARDANS" (
   "IMGANSNO"   NUMBER      NOT NULL,
   "IMGBOARDNO"   NUMBER      NOT NULL,
   "MOIMNO"   NUMBER      NOT NULL,
   "USERID"   VARCHAR2(100)      NOT NULL,
   "GROUPNO"   NUMBER      NOT NULL,
   "IMGANSCONTENT"   VARCHAR2(1000)      NOT NULL,
   "IMGANSREGDATE"   DATE      NOT NULL
);

CREATE TABLE "MOIMANS" (
   "MOIMANSNO"   NUMBER      NOT NULL,
   "MOIMNO"   NUMBER      NOT NULL,
   "USERID"   VARCHAR2(100)      NOT NULL,
   "GROUPNO"   NUMBER      NOT NULL,
   "MOIMANSCONTENT"   VARCHAR2(1000)      NOT NULL,
   "MOIMANSREGDATE"   DATE      NOT NULL
);

CREATE TABLE "MOIM" (
   "MOIMNO"   NUMBER      NOT NULL,
   "USERID"   VARCHAR2(100)      NOT NULL,
   "GROUPNO"   NUMBER      NOT NULL,
   "MOIMTITLE"   VARCHAR2(100)      NOT NULL,
   "MOIMCONTENT"   VARCHAR2(1000)      NOT NULL,
   "MOIMRECRUIT"   VARCHAR2(100)      NOT NULL,
   "MOIMADDR"   VARCHAR2(1000)      NOT NULL,
   "LAT"   VARCHAR2(100)      NULL,
   "LNG"   VARCHAR2(100)      NULL,
   "MOIMREGDATE"   DATE      NOT NULL,
   "MOIMENDDATE"   VARCHAR2(100)      NOT NULL,
   "MOIMDATE"   VARCHAR2(100)      NULL
);

ALTER TABLE "USERINFO" ADD CONSTRAINT "PK_USERINFO" PRIMARY KEY (
   "USERID"
);

ALTER TABLE "GROUPINFO" ADD CONSTRAINT "PK_GROUPINFO" PRIMARY KEY (
   "GROUPNO"
);

ALTER TABLE "GROUPUSER" ADD CONSTRAINT "PK_GROUPUSER" PRIMARY KEY (
   "USERID",
   "GROUPNO"
);

ALTER TABLE "FREEBOARD" ADD CONSTRAINT "PK_FREEBOARD" PRIMARY KEY (
   "BOARDNO",
   "USERID",
   "GROUPNO"
);

ALTER TABLE "MOIMUSER" ADD CONSTRAINT "PK_MOIMUSER" PRIMARY KEY (
   "MOIMNO",
   "USERID",
   "GROUPNO"
);

ALTER TABLE "FREEBOARDANS" ADD CONSTRAINT "PK_FREEBOARDANS" PRIMARY KEY (
   "BOARDANSNO",
   "BOARDNO",
   "USERID",
   "GROUPNO"
);

ALTER TABLE "IMGBOARD" ADD CONSTRAINT "PK_IMGBOARD" PRIMARY KEY (
   "IMGBOARDNO",
   "MOIMNO",
   "USERID",
   "GROUPNO"
);

ALTER TABLE "IMGBOARDANS" ADD CONSTRAINT "PK_IMGBOARDANS" PRIMARY KEY (
   "IMGANSNO",
   "IMGBOARDNO",
   "MOIMNO",
   "USERID",
   "GROUPNO"
);

ALTER TABLE "MOIMANS" ADD CONSTRAINT "PK_MOIMANS" PRIMARY KEY (
   "MOIMANSNO",
   "MOIMNO",
   "USERID",
   "GROUPNO"
);

ALTER TABLE "MOIM" ADD CONSTRAINT "PK_MOIM" PRIMARY KEY (
   "MOIMNO",
   "USERID",
   "GROUPNO"
);

CREATE TABLE "SESSIONIDS"(
   "SESSIONID" VARCHAR2(100) NOT NULL,
   "USERID" VARCHAR2(100) NOT NULL
);



