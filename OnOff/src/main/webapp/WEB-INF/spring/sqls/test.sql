
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


CREATE TABLE "USERINFO" (
	"USERID"	VARCHAR2(100)		NOT NULL,
	"USERPW"	VARCHAR2(100)		NOT NULL,
	"USERGRADE"	VARCHAR2(100)		NOT NULL,
	"USERNAME"	VARCHAR2(100)		NULL,
	"USERBIRTH"	DATE		NOT NULL,
	"USEREMAIL"	VARCHAR2(1000)		NULL,
	"USERADDR"	VARCHAR2(1000)		NOT NULL,
	"USERGENDER"	VARCHAR2(100)		NOT NULL,
	"USERPHONE"	NUMBER		NOT NULL,
	"USERREGDATE"	DATE		NOT NULL
);



CREATE TABLE "GROUPINFO" (
	"GROUPSEQ"	NUMBER		NOT NULL,
	"GROUPTITLE"	VARCHAR2(100)		NULL,
	"GROUPCONTENT"	VARCHAR2(1000)		NOT NULL,
	"GROUPREGDATE"	DATE		NOT NULL,
	"GROUPIMG"	VARCHAR2(1000)		NULL
);



CREATE TABLE "GROUPUSER" (
	"USERID"	VARCHAR2(100)		NOT NULL,
	"GROUPSEQ"	NUMBER		NOT NULL,
	"GROUPUSERGRADE"	VARCHAR2(100)		NOT NULL,
	"GROUPUSERREGDATE"	DATE		NOT NULL
);



CREATE TABLE "FREEBOARD" (
	"BOARDSEQ"	NUMBER		NOT NULL,
	"USERID"	VARCHAR2(100)		NOT NULL,
	"GROUPSEQ"	NUMBER		NOT NULL,
	"BOARDTITLE"	VARCHAR2(100)		NOT NULL,
	"BOARDCONTENT"	VARCHAR2(1000)		NOT NULL,
	"BOARDREGDATE"	DATE		NOT NULL
);



CREATE TABLE "MOIMUSER" (
	"MOIMSEQ"	NUMBER		NOT NULL,
	"USERID"	VARCHAR2(100)		NOT NULL,
	"GROUPSEQ"	NUMBER		NOT NULL,
	"MOIMQ1"	VARCHAR2(100)		NULL,
	"MOIMQ2"	VARCHAR2(100)		NULL,
	"MOIMQ3"	VARCHAR2(100)		NULL,
	"MOIMQ4"	VARCHAR2(100)		NULL,
	"MOIMQ5"	VARCHAR2(100)		NULL,
	"MOIMQ6"	VARCHAR2(100)		NULL
);



CREATE TABLE "FREEBOARDANS" (
	"BOARDANSSEQ"	NUMBER		NOT NULL,
	"BOARDSEQ"	NUMBER		NOT NULL,
	"USERID"	VARCHAR2(100)		NOT NULL,
	"GROUPSEQ"	NUMBER		NOT NULL,
	"BOARDANSCONTENT"	VARCHAR2(1000)		NOT NULL,
	"BOARDANSREGDATE"	DATE		NOT NULL
);



CREATE TABLE "IMGBOARD" (
	"IMGBOARDSEQ"	NUMBER		NOT NULL,
	"MOIMSEQ"	NUMBER		NOT NULL,
	"USERID"	VARCHAR2(100)		NOT NULL,
	"GROUPSEQ"	NUMBER		NOT NULL,
	"IMGBOARDTITLE"	VARCHAR2(100)		NULL,
	"IMGBOARDCONTENT"	VARCHAR2(1000)		NULL,
	"IMGBOARDREGDATE"	DATE		NULL
);



CREATE TABLE "IMGBOARDANS" (
	"IMGANSSEQ"	NUMBER		NOT NULL,
	"IMGBOARDSEQ"	NUMBER		NOT NULL,
	"MOIMSEQ"	NUMBER		NOT NULL,
	"USERID"	VARCHAR2(100)		NOT NULL,
	"GROUPSEQ"	NUMBER		NOT NULL,
	"IMGANSCONTENT"	VARCHAR2(1000)		NOT NULL,
	"IMGANSREGDATE"	DATE		NOT NULL
);



CREATE TABLE "MOIMANS" (
	"MOIMANSSEQ"	NUMBER		NOT NULL,
	"MOIMSEQ"	NUMBER		NOT NULL,
	"USERID"	VARCHAR2(100)		NOT NULL,
	"GROUPSEQ"	NUMBER		NOT NULL,
	"MOIMANSCONTENT"	VARCHAR2(1000)		NOT NULL,
	"MOIMANSREGDATE"	DATE		NOT NULL
);


CREATE TABLE "MOIM" (
	"MOIMSEQ"	NUMBER		NOT NULL,
	"USERID"	VARCHAR2(100)		NOT NULL,
	"GROUPSEQ"	NUMBER		NOT NULL,
	"MOIMTITLE"	VARCHAR2(100)		NOT NULL,
	"MOIMCONTENT"	VARCHAR2(1000)		NOT NULL,
	"MOIMRECRUIT"	NUMBER		NOT NULL,
	"MOIMADDR"	VARCHAR2(1000)		NOT NULL,
	"MOIMREGDATE"	DATE		NOT NULL,
	"MOIMENDDATE"	DATE		NOT NULL,
	"MOIMDATE"	DATE		NULL
);

ALTER TABLE "USERINFO" ADD CONSTRAINT "PK_USERINFO" PRIMARY KEY (
	"USERID"
);

ALTER TABLE "GROUPINFO" ADD CONSTRAINT "PK_GROUPINFO" PRIMARY KEY (
	"GROUPSEQ"
);

ALTER TABLE "GROUPUSER" ADD CONSTRAINT "PK_GROUPUSER" PRIMARY KEY (
	"USERID",
	"GROUPSEQ"
);

ALTER TABLE "FREEBOARD" ADD CONSTRAINT "PK_FREEBOARD" PRIMARY KEY (
	"BOARDSEQ",
	"USERID",
	"GROUPSEQ"
);

ALTER TABLE "MOIMUSER" ADD CONSTRAINT "PK_MOIMUSER" PRIMARY KEY (
	"MOIMSEQ",
	"USERID",
	"GROUPSEQ"
);

ALTER TABLE "FREEBOARDANS" ADD CONSTRAINT "PK_FREEBOARDANS" PRIMARY KEY (
	"BOARDANSSEQ",
	"BOARDSEQ",
	"USERID",
	"GROUPSEQ"
);

ALTER TABLE "IMGBOARD" ADD CONSTRAINT "PK_IMGBOARD" PRIMARY KEY (
	"IMGBOARDSEQ",
	"MOIMSEQ",
	"USERID",
	"GROUPSEQ"
);

ALTER TABLE "IMGBOARDANS" ADD CONSTRAINT "PK_IMGBOARDANS" PRIMARY KEY (
	"IMGANSSEQ",
	"IMGBOARDSEQ",
	"MOIMSEQ",
	"USERID",
	"GROUPSEQ"
);

ALTER TABLE "MOIMANS" ADD CONSTRAINT "PK_MOIMANS" PRIMARY KEY (
	"MOIMANSSEQ",
	"MOIMSEQ",
	"USERID",
	"GROUPSEQ"
);

ALTER TABLE "MOIM" ADD CONSTRAINT "PK_MOIM" PRIMARY KEY (
	"MOIMSEQ",
	"USERID",
	"GROUPSEQ"
);
