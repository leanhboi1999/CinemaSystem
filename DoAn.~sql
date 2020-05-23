-- Drop script --
ALTER TABLE CTHDTP
DROP CONSTRAINT FK_CTH_TP_CTH_TP_HOA__ON_;
ALTER TABLE CTHDTP
DROP CONSTRAINT FK_CTH_TP_CTH_TP2_THUC_PHA;
ALTER TABLE CTPhanQuyen
DROP CONSTRAINT FK_CT_PHAN__CT_PHAN_Q_PHAN_QUY;
ALTER TABLE CTPhanQuyen
DROP CONSTRAINT FK_CT_PHAN__CT_PHAN_Q_TAI_KHOA;
ALTER TABLE HoaDonThucPham
DROP CONSTRAINT FK_HOA__ON__LAP_NHAN_VIE;
ALTER TABLE NhanVien
DROP CONSTRAINT FK_NHAN_VIE_LA_CHUC_VU;
ALTER TABLE NhanVien
DROP CONSTRAINT FK_NHAN_VIE__ANG_NHAP_TAI_KHOA;
ALTER TABLE TaiKhoan
DROP CONSTRAINT FK_TAI_KHOA__ANG_NHAP_NHAN_VIE;
ALTER TABLE Ve
DROP CONSTRAINT FK_VE_BAN_NHAN_VIE;
ALTER TABLE Ve
DROP CONSTRAINT FK_VE_MUA_HOI_VIEN;
ALTER TABLE Ve
DROP CONSTRAINT FK_VE_THUOC_SU_KIEN;
ALTER TABLE Ve
DROP CONSTRAINT FK_VE_THUOC2_SUAT_CHI;
ALTER TABLE Ve
DROP CONSTRAINT FK_VE_THUOC3_PHIM;
DROP TABLE ChucVu CASCADE CONSTRAINTS;
DROP INDEX CTH_TP2_FK;
DROP INDEX CTH_TP_FK;
DROP TABLE CTHDTP CASCADE CONSTRAINTS;
DROP INDEX CT_PHAN_QUYEN2_FK;
DROP INDEX CT_PHAN_QUYEN_FK;
DROP TABLE CT_PHAN_QUYEN CASCADE CONSTRAINTS;
DROP INDEX LAP_FK;
DROP TABLE HoaDonThucPham CASCADE CONSTRAINTS;
DROP TABLE HOI_VIEN CASCADE CONSTRAINTS;
DROP INDEX LA_FK;
DROP INDEX _ANG_NHAP_FK;
DROP TABLE NHAN_VIEN CASCADE CONSTRAINTS;
DROP TABLE PHAN_QUYEN CASCADE CONSTRAINTS;
DROP TABLE PHIM CASCADE CONSTRAINTS;
DROP TABLE SUAT_CHIEU CASCADE CONSTRAINTS;
DROP TABLE SU_KIEN CASCADE CONSTRAINTS;
DROP INDEX _ANG_NHAP2_FK;
DROP TABLE TAI_KHOAN CASCADE CONSTRAINTS;
DROP TABLE THUC_PHAM CASCADE CONSTRAINTS;
DROP INDEX MUA_FK;
DROP INDEX THUOC3_FK;
DROP INDEX THUOC2_FK;
DROP INDEX THUOC_FK;
DROP INDEX BAN_FK;
DROP TABLE VE CASCADE CONSTRAINTS;
/*==============================================================*/
/* Table: CHUC_VU                                               */
/*==============================================================*/
CREATE TABLE ChucVu
  (
    MaChucVu CHAR(4) NOT NULL,
    TenChucVu NVARCHAR2(50),
    LuongCoBan NUMBER(8,2),
    CONSTRAINT PK_ChucVu PRIMARY KEY (MaChucVu)
  );
/*==============================================================*/
/* Table: CTH_TP                                                */
/*==============================================================*/
CREATE TABLE CTHDTP
  (
    MaHoaDon   INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    MaThucPham CHAR(4) NOT NULL,
    NgayMua    DATE,
    SoLuong    INTEGER,
    CONSTRAINT PK_CTHDTP PRIMARY KEY (MaHoaDon, MaThucPham)
  );
/*==============================================================*/
/* Table: CT_PHAN_QUYEN                                         */
/*==============================================================*/
CREATE TABLE CTPhanQuyen
  (
    MaQuyen CHAR(4) NOT NULL,
    TenDangNhap NVARCHAR2(50) NOT NULL,
    CONSTRAINT PK_CTPhanQuyen PRIMARY KEY (MaQuyen, TenDangNhap)
  );
/*==============================================================*/
/* Table: HOA__ON_THUC_PHAM                                     */
/*==============================================================*/
CREATE TABLE HoaDonThucPham
  (
    MaHoaDon   INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    MaNhanVien CHAR(4) NOT NULL,
    SoTien     NUMBER(8,2),
    NgayBanVe  DATE,
    CONSTRAINT PK_HoaDonThucPham PRIMARY KEY (MaHoaDon)
  );
/*==============================================================*/
/* Table: HOI_VIEN                                              */
/*==============================================================*/
CREATE TABLE HoiVien
  (
    MaHoiVien INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    HoTen NVARCHAR2(50),
    GioiTinh SMALLINT,
    CMND NVARCHAR2(15),
    NgaySinh DATE,
    EMAIL NVARCHAR2(50),
    DienThoai NVARCHAR2(15),
    NgayDangKi  DATE,
    DiemTichLuy INTEGER,
    CONSTRAINT PK_HoiVien PRIMARY KEY (MaHoiVien)
  );
/*==============================================================*/
/* Table: NHAN_VIEN                                             */
/*==============================================================*/
CREATE TABLE NhanVien
  (
    MaNhanVien INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    MaChucVu  CHAR(4) NOT NULL,
    TenDangNhap NVARCHAR2(50) NOT NULL,
    HoTen NVARCHAR2(50),
    EMAIL NVARCHAR2(50),
    CMND NVARCHAR2(15),
    GioiTinh SMALLINT,
    NgaySinh DATE,
    DiaChi NVARCHAR2(120),
    DienThoai NVARCHAR2(15),
    NgayVaoLam DATE,
    TrangThai  SMALLINT,
    CONSTRAINT PK_NhanVien PRIMARY KEY (MaNhanVien)
  );
/*==============================================================*/
/* Table: PHAN_QUYEN                                            */
/*==============================================================*/
CREATE TABLE PhanQuyen
  (
    MaQuyen CHAR(4) NOT NULL,
    TenQuyen NVARCHAR2(50),
    CONSTRAINT PK_PhanQuyen PRIMARY KEY (MaQuyen)
  );
/*==============================================================*/
/* Table: PHIM                                                  */
/*==============================================================*/
CREATE TABLE PHIM
  (
    MaPhim INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    TenPhim NVARCHAR2(120),
    ThoiLuong INTEGER,
    LoaiPhim NVARCHAR2(50),
    TenNhaSanXuat NVARCHAR2(120),
    NamSanXuat INTEGER,
    DienVien NVARCHAR2(120),
    NgonNgu NVARCHAR2(50),
    NuocSanXuat NVARCHAR2(50),
    NgayKhoiChieu DATE,
    GioiHanTuoi   INTEGER,
    TomTat NVARCHAR2(120),
    TrangThai SMALLINT,
    CONSTRAINT PK_PHIM PRIMARY KEY (MaPhim)
  );
/*==============================================================*/
/* Table: SUAT_CHIEU                                            */
/*==============================================================*/
CREATE TABLE SuatChieu
  (
    MaSuatChieu   INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    TrangThai     SMALLINT,
    PhongChieu    VARCHAR2(50),
    SoLuongVe     INTEGER,
    ThoiGianChieu DATE,
    CONSTRAINT PK_SuatChieu PRIMARY KEY (MaSuatChieu)
  );
/*==============================================================*/
/* Table: SU_KIEN                                               */
/*==============================================================*/
CREATE TABLE SuKien
  (
    MaSuKien  INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    TenSuKien VARCHAR2(50),
    MoTa      VARCHAR2(150),
    CONSTRAINT PK_SuKien PRIMARY KEY (MaSuKien)
  );
/*==============================================================*/
/* Table: TAI_KHOAN                                             */
/*==============================================================*/
CREATE TABLE TaiKhoan
  (
      TenDangNhap NVARCHAR2(50) NOT NULL,
      MaNhanVien  CHAR(4) NOT NULL,
      MatKhau     NVARCHAR2(20),
      TrangThai   SMALLINT,
      CONSTRAINT PK_TaiKhoan PRIMARY KEY (TenDangNhap)
  );
/*==============================================================*/
/* Table: THUC_PHAM                                             */
/*==============================================================*/
CREATE TABLE ThucPham
  (
    MaThucPham CHAR(4) NOT NULL,
    TenThucPham NVARCHAR2(50),
    DonGia    NUMBER(8,2),
    TrangThai SMALLINT,
    CONSTRAINT PK_ThucPham PRIMARY KEY (MaThucPham)
  );
/*==============================================================*/
/* Table: VE                                                    */
/*==============================================================*/
CREATE TABLE VE
    (
      MaVe        INT GENERATED ALWAYS AS IDENTITY NOT NULL,
      MaSuatChieu CHAR(4) NOT NULL,
      MaNhanVien  CHAR(4) NOT NULL,
      MaSuKien    CHAR(4) NOT NULL,
      MaHoiVien   CHAR(4) NOT NULL,
      MaPhim      CHAR(4) NOT NULL,
      NgayBanVe   DATE,
      GiaVe       NUMBER(8,2),
      DiemTichLuy INTEGER,
      CONSTRAINT PK_VE PRIMARY KEY (MaVe)
    );
/*==============================================================*/
/* Khoa ngoai                                                   */
/*==============================================================*/
/*ALTER TABLE CTHDTP ADD CONSTRAINT FK_CTHDTP_HoaDonThucPham FOREIGN KEY (MaHoaDon) REFERENCES HOA__ON_THUC_PHAM (MA_HOA__ON);
ALTER TABLE CTH_TP ADD CONSTRAINT FK_CTH_TP_CTH_TP2_THUC_PHA FOREIGN KEY (MA_THUC_PHAM) REFERENCES THUC_PHAM (MA_THUC_PHAM);
ALTER TABLE CT_PHAN_QUYEN ADD CONSTRAINT FK_CT_PHAN__CT_PHAN_Q_PHAN_QUY FOREIGN KEY (MA_QUYEN) REFERENCES PHAN_QUYEN (MA_QUYEN);
ALTER TABLE CT_PHAN_QUYEN ADD CONSTRAINT FK_CT_PHAN__CT_PHAN_Q_TAI_KHOA FOREIGN KEY (TEN__ANG_NHAP) REFERENCES TAI_KHOAN (TEN__ANG_NHAP);
ALTER TABLE HOA__ON_THUC_PHAM ADD CONSTRAINT FK_HOA__ON__LAP_NHAN_VIE FOREIGN KEY (MA_NHAN_VIEN) REFERENCES NHAN_VIEN (MA_NHAN_VIEN);
ALTER TABLE NHAN_VIEN ADD CONSTRAINT FK_NHAN_VIE_LA_CHUC_VU FOREIGN KEY (MA_CHUC_VU) REFERENCES CHUC_VU (MA_CHUC_VU);
ALTER TABLE NHAN_VIEN ADD CONSTRAINT FK_NHAN_VIE__ANG_NHAP_TAI_KHOA FOREIGN KEY (TEN__ANG_NHAP) REFERENCES TAI_KHOAN (TEN__ANG_NHAP);
ALTER TABLE TAI_KHOAN ADD CONSTRAINT FK_TAI_KHOA__ANG_NHAP_NHAN_VIE FOREIGN KEY (MA_NHAN_VIEN) REFERENCES NHAN_VIEN (MA_NHAN_VIEN);
ALTER TABLE VE ADD CONSTRAINT FK_VE_BAN_NHAN_VIE FOREIGN KEY (MA_NHAN_VIEN) REFERENCES NHAN_VIEN (MA_NHAN_VIEN);
ALTER TABLE VE ADD CONSTRAINT FK_VE_MUA_HOI_VIEN FOREIGN KEY (MA_HOI_VIEN) REFERENCES HOI_VIEN (MA_HOI_VIEN);
ALTER TABLE VE ADD CONSTRAINT FK_VE_THUOC_SU_KIEN FOREIGN KEY (MA_SU_KIEN) REFERENCES SU_KIEN (MA_SU_KIEN);
ALTER TABLE VE ADD CONSTRAINT FK_VE_THUOC2_SUAT_CHI FOREIGN KEY (MA_SUAT_CHIEU) REFERENCES SUAT_CHIEU (MA_SUAT_CHIEU);
ALTER TABLE VE ADD CONSTRAINT FK_VE_THUOC3_PHIM FOREIGN KEY (MA_PHIM) REFERENCES PHIM (MA_PHIM);*/

/*==============================================================*/
/* Inset TaiKhoan                                               */
/*==============================================================*/
insert into TaiKhoan values ('fb', 'abc', 'fb', 1);
insert into TaiKhoan values ('fg', 'abc', 'fg', 0);
insert into TaiKhoan values ('hanhlangdaynangvagio', 'abc', 'huy', 0);

insert into ChucVu (Tenchucvu, Luongcoban) values ('','')
insert into ChucVu (Tenchucvu, Luongcoban) values ('',0);
insert into ChucVu (Tenchucvu, Luongcoban) values ('f',1);
insert into ChucVu (Tenchucvu, Luongcoban) values ('g',2);
commit;
