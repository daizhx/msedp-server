-- 用户表
CREATE TABLE IF NOT EXISTS edp_user(
  id int NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(20) NOT NULL COMMENT '用户名',
  pwd VARCHAR(60) NOT NULL,
  birthday DATE DEFAULT NULL,
  tel VARCHAR(20) DEFAULT NULL COMMENT '手机号',
  gender TINYINT DEFAULT NULL COMMENT '性别：0-女,1-男',
  idcardnumbers char(30) DEFAULT NULL COMMENT '身份证号码',
  wechatname VARCHAR(20) DEFAULT NULL,
  home_addr VARCHAR(30) DEFAULT NULL,
  medicarenumbers VARCHAR(30) DEFAULT NULL,
  visitinghospital VARCHAR(30) DEFAULT NULL,
  isSmoking BOOLEAN DEFAULT NULL,
  smoking_year TINYINT DEFAULT NULL,
  PRIMARY KEY (id)
  );