 -- Drop script --
 alter table CTHDTP
   drop constraint FK_CTH_TP_CTH_TP_HOA__ON_;

alter table CTHDTP
   drop constraint FK_CTH_TP_CTH_TP2_THUC_PHA;

alter table CTPhanQuyen
   drop constraint FK_CT_PHAN__CT_PHAN_Q_PHAN_QUY;

alter table CTPhanQuyen
   drop constraint FK_CT_PHAN__CT_PHAN_Q_TAI_KHOA;

alter table HoaDonThucPham
   drop constraint FK_HOA__ON__LAP_NHAN_VIE;

alter table NhanVien
   drop constraint FK_NHAN_VIE_LA_CHUC_VU;

alter table NhanVien
   drop constraint FK_NHAN_VIE__ANG_NHAP_TAI_KHOA;

alter table TaiKhoan
   drop constraint FK_TAI_KHOA__ANG_NHAP_NHAN_VIE;

alter table Ve
   drop constraint FK_VE_BAN_NHAN_VIE;

alter table Ve
   drop constraint FK_VE_MUA_HOI_VIEN;

alter table Ve
   drop constraint FK_VE_THUOC_SU_KIEN;

alter table Ve
   drop constraint FK_VE_THUOC2_SUAT_CHI;

alter table Ve
   drop constraint FK_VE_THUOC3_PHIM;

drop table ChucVu cascade constraints;

drop index CTH_TP2_FK;

drop index CTH_TP_FK;

drop table CTHDTP cascade constraints;

drop index CT_PHAN_QUYEN2_FK;

drop index CT_PHAN_QUYEN_FK;

drop table CT_PHAN_QUYEN cascade constraints;

drop index LAP_FK;

drop table HoaDonThucPham cascade constraints;

drop table HOI_VIEN cascade constraints;

drop index LA_FK;

drop index _ANG_NHAP_FK;

drop table NHAN_VIEN cascade constraints;

drop table PHAN_QUYEN cascade constraints;

drop table PHIM cascade constraints;

drop table SUAT_CHIEU cascade constraints;

drop table SU_KIEN cascade constraints;

drop index _ANG_NHAP2_FK;

drop table TAI_KHOAN cascade constraints;

drop table THUC_PHAM cascade constraints;

drop index MUA_FK;

drop index THUOC3_FK;

drop index THUOC2_FK;

drop index THUOC_FK;

drop index BAN_FK;

drop table VE cascade constraints;

/*==============================================================*/
/* Table: CHUC_VU                                               */
/*==============================================================*/
create table ChucVu 
(
   MaChucVu           CHAR(4)              not null,
   TenChucVu         NVARCHAR2(50),
   LuongCoBan         NUMBER(8,2),
   constraint PK_ChucVu primary key (MaChucVu)
);

/*==============================================================*/
/* Table: CTH_TP                                                */
/*==============================================================*/
create table CTHDTP 
(
   MA_HOA__ON           CHAR(4)              not null,
   MA_THUC_PHAM         CHAR(4)              not null,
   NGAY_MUA             DATE,
   SO_LUONG             INTEGER,
   constraint PK_CTH_TP primary key (MA_HOA__ON, MA_THUC_PHAM)
);

/*==============================================================*/
/* Index: CTH_TP_FK                                             */
/*==============================================================*/
create index CTH_TP_FK on CTH_TP (
   MA_HOA__ON ASC
);

/*==============================================================*/
/* Index: CTH_TP2_FK                                            */
/*==============================================================*/
create index CTH_TP2_FK on CTH_TP (
   MA_THUC_PHAM ASC
);

/*==============================================================*/
/* Table: CT_PHAN_QUYEN                                         */
/*==============================================================*/
create table CT_PHAN_QUYEN 
(
   MA_QUYEN             CHAR(4)              not null,
   TEN__ANG_NHAP        NVARCHAR2(50)        not null,
   constraint PK_CT_PHAN_QUYEN primary key (MA_QUYEN, TEN__ANG_NHAP)
);

/*==============================================================*/
/* Index: CT_PHAN_QUYEN_FK                                      */
/*==============================================================*/
create index CT_PHAN_QUYEN_FK on CT_PHAN_QUYEN (
   MA_QUYEN ASC
);

/*==============================================================*/
/* Index: CT_PHAN_QUYEN2_FK                                     */
/*==============================================================*/
create index CT_PHAN_QUYEN2_FK on CT_PHAN_QUYEN (
   TEN__ANG_NHAP ASC
);

/*==============================================================*/
/* Table: HOA__ON_THUC_PHAM                                     */
/*==============================================================*/
create table HOA__ON_THUC_PHAM 
(
   MA_HOA__ON           CHAR(4)              not null,
   MA_NHAN_VIEN         CHAR(4)              not null,
   SO_TIEN              NUMBER(8,2),
   NGAY_BAN_VE          DATE,
   constraint PK_HOA__ON_THUC_PHAM primary key (MA_HOA__ON)
);

/*==============================================================*/
/* Index: LAP_FK                                                */
/*==============================================================*/
create index LAP_FK on HOA__ON_THUC_PHAM (
   MA_NHAN_VIEN ASC
);

/*==============================================================*/
/* Table: HOI_VIEN                                              */
/*==============================================================*/
create table HOI_VIEN 
(
   MA_HOI_VIEN          CHAR(4)              not null,
   HO_TEN               NVARCHAR2(50),
   GIOI_TINH            SMALLINT,
   CMND                 NVARCHAR2(15),
   NGAY_SINH            DATE,
   EMAIL                NVARCHAR2(50),
   _IEN_THOAI           NVARCHAR2(15),
   NGAY__ANG_KY         DATE,
   _IEM_TICH_LUY        INTEGER,
   constraint PK_HOI_VIEN primary key (MA_HOI_VIEN)
);

/*==============================================================*/
/* Table: NHAN_VIEN                                             */
/*==============================================================*/
create table NHAN_VIEN 
(
   MA_NHAN_VIEN         CHAR(4)              not null,
   MA_CHUC_VU           CHAR(4)              not null,
   TEN__ANG_NHAP        NVARCHAR2(50)        not null,
   HO_TEN               NVARCHAR2(50),
   EMAIL                NVARCHAR2(50),
   CMND                 NVARCHAR2(15),
   GIOI_TINH            SMALLINT,
   NGAY_SINH            DATE,
   _IA_CHI              NVARCHAR2(120),
   _IEN_THOAI           NVARCHAR2(15),
   NGAY_VAO_LAM         DATE,
   TRANG_THAI           SMALLINT,
   constraint PK_NHAN_VIEN primary key (MA_NHAN_VIEN)
);

/*==============================================================*/
/* Index: _ANG_NHAP_FK                                          */
/*==============================================================*/
create index _ANG_NHAP_FK on NHAN_VIEN (
   TEN__ANG_NHAP ASC
);

/*==============================================================*/
/* Index: LA_FK                                                 */
/*==============================================================*/
create index LA_FK on NHAN_VIEN (
   MA_CHUC_VU ASC
);

/*==============================================================*/
/* Table: PHAN_QUYEN                                            */
/*==============================================================*/
create table PHAN_QUYEN 
(
   MA_QUYEN             CHAR(4)              not null,
   TEN_QUYEN            NVARCHAR2(50),
   constraint PK_PHAN_QUYEN primary key (MA_QUYEN)
);

/*==============================================================*/
/* Table: PHIM                                                  */
/*==============================================================*/
create table PHIM 
(
   MA_PHIM              CHAR(4)              not null,
   TEN_PHIM             NVARCHAR2(120),
   THOI_LUONG           INTEGER,
   LOAI_PHIM            NVARCHAR2(50),
   TEN_NHA_SAN_XUAT     NVARCHAR2(120),
   NAM_SAN_XUAT         INTEGER,
   DIEN_VIEN            NVARCHAR2(120),
   NGON_NGU             NVARCHAR2(50),
   NUOC_SAN_XUAT        NVARCHAR2(50),
   NGAY_KHOI_CHIEU      DATE,
   GIOI_HAN_TUOI        INTEGER,
   TOM_TAT              NVARCHAR2(120),
   TRANG_THAI           SMALLINT,
   constraint PK_PHIM primary key (MA_PHIM)
);

/*==============================================================*/
/* Table: SUAT_CHIEU                                            */
/*==============================================================*/
create table SUAT_CHIEU 
(
   MA_SUAT_CHIEU        CHAR(4)              not null,
   TRANG_THAI           SMALLINT,
   PHONG_CHIEU          VARCHAR2(50),
   SO_LUONG_VE          INTEGER,
   THOI_GIAN_CHIEU      DATE,
   constraint PK_SUAT_CHIEU primary key (MA_SUAT_CHIEU)
);

/*==============================================================*/
/* Table: SU_KIEN                                               */
/*==============================================================*/
create table SU_KIEN 
(
   MA_SU_KIEN           CHAR(4)              not null,
   TEN_SU_KIEN          VARCHAR2(50),
   MO_TA                VARCHAR2(150),
   constraint PK_SU_KIEN primary key (MA_SU_KIEN)
);

/*==============================================================*/
/* Table: TAI_KHOAN                                             */
/*==============================================================*/
create table TAI_KHOAN 
(
   TEN__ANG_NHAP        NVARCHAR2(50)        not null,
   MA_NHAN_VIEN         CHAR(4)              not null,
   MAT_KHAU             NVARCHAR2(20),
   TRANG_THAI           SMALLINT,
   constraint PK_TAI_KHOAN primary key (TEN__ANG_NHAP)
);

/*==============================================================*/
/* Index: _ANG_NHAP2_FK                                         */
/*==============================================================*/
create index _ANG_NHAP2_FK on TAI_KHOAN (
   MA_NHAN_VIEN ASC
);

/*==============================================================*/
/* Table: THUC_PHAM                                             */
/*==============================================================*/
create table THUC_PHAM 
(
   MA_THUC_PHAM         CHAR(4)              not null,
   TEN_THUC_PHAM        NVARCHAR2(50),
   _ON_GIA              NUMBER(8,2),
   TRANG_THAI           SMALLINT,
   constraint PK_THUC_PHAM primary key (MA_THUC_PHAM)
);

/*==============================================================*/
/* Table: VE                                                    */
/*==============================================================*/
create table VE 
(
   MA_VE                CHAR(4)              not null,
   MA_SUAT_CHIEU        CHAR(4)              not null,
   MA_NHAN_VIEN         CHAR(4)              not null,
   MA_SU_KIEN           CHAR(4)              not null,
   MA_HOI_VIEN          CHAR(4)              not null,
   MA_PHIM              CHAR(4)              not null,
   NGAY_BAN_VE          DATE,
   GIA_VE               NUMBER(8,2),
   _IEM_TICH_LUY        INTEGER,
   constraint PK_VE primary key (MA_VE)
);

/*==============================================================*/
/* Index: BAN_FK                                                */
/*==============================================================*/
create index BAN_FK on VE (
   MA_NHAN_VIEN ASC
);

/*==============================================================*/
/* Index: THUOC_FK                                              */
/*==============================================================*/
create index THUOC_FK on VE (
   MA_SU_KIEN ASC
);

/*==============================================================*/
/* Index: THUOC2_FK                                             */
/*==============================================================*/
create index THUOC2_FK on VE (
   MA_SUAT_CHIEU ASC
);

/*==============================================================*/
/* Index: THUOC3_FK                                             */
/*==============================================================*/
create index THUOC3_FK on VE (
   MA_PHIM ASC
);

/*==============================================================*/
/* Index: MUA_FK                                                */
/*==============================================================*/
create index MUA_FK on VE (
   MA_HOI_VIEN ASC
);

alter table CTH_TP
   add constraint FK_CTH_TP_CTH_TP_HOA__ON_ foreign key (MA_HOA__ON)
      references HOA__ON_THUC_PHAM (MA_HOA__ON);

alter table CTH_TP
   add constraint FK_CTH_TP_CTH_TP2_THUC_PHA foreign key (MA_THUC_PHAM)
      references THUC_PHAM (MA_THUC_PHAM);

alter table CT_PHAN_QUYEN
   add constraint FK_CT_PHAN__CT_PHAN_Q_PHAN_QUY foreign key (MA_QUYEN)
      references PHAN_QUYEN (MA_QUYEN);

alter table CT_PHAN_QUYEN
   add constraint FK_CT_PHAN__CT_PHAN_Q_TAI_KHOA foreign key (TEN__ANG_NHAP)
      references TAI_KHOAN (TEN__ANG_NHAP);

alter table HOA__ON_THUC_PHAM
   add constraint FK_HOA__ON__LAP_NHAN_VIE foreign key (MA_NHAN_VIEN)
      references NHAN_VIEN (MA_NHAN_VIEN);

alter table NHAN_VIEN
   add constraint FK_NHAN_VIE_LA_CHUC_VU foreign key (MA_CHUC_VU)
      references CHUC_VU (MA_CHUC_VU);

alter table NHAN_VIEN
   add constraint FK_NHAN_VIE__ANG_NHAP_TAI_KHOA foreign key (TEN__ANG_NHAP)
      references TAI_KHOAN (TEN__ANG_NHAP);

alter table TAI_KHOAN
   add constraint FK_TAI_KHOA__ANG_NHAP_NHAN_VIE foreign key (MA_NHAN_VIEN)
      references NHAN_VIEN (MA_NHAN_VIEN);

alter table VE
   add constraint FK_VE_BAN_NHAN_VIE foreign key (MA_NHAN_VIEN)
      references NHAN_VIEN (MA_NHAN_VIEN);

alter table VE
   add constraint FK_VE_MUA_HOI_VIEN foreign key (MA_HOI_VIEN)
      references HOI_VIEN (MA_HOI_VIEN);

alter table VE
   add constraint FK_VE_THUOC_SU_KIEN foreign key (MA_SU_KIEN)
      references SU_KIEN (MA_SU_KIEN);

alter table VE
   add constraint FK_VE_THUOC2_SUAT_CHI foreign key (MA_SUAT_CHIEU)
      references SUAT_CHIEU (MA_SUAT_CHIEU);

alter table VE
   add constraint FK_VE_THUOC3_PHIM foreign key (MA_PHIM)
      references PHIM (MA_PHIM);
