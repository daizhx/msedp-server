-- edp使用参数设置表
CREATE TABLE IF NOT EXISTS edp_use_record(
                        id int NOT NULL AUTO_INCREMENT COMMENT '自增主键',
                        freq TINYINT NOT NULL COMMENT '频率',
                                           duration TINYINT NOT NULL COMMENT '时间',
                                           times_per_min TINYINT NOT NULL COMMENT '起搏次数',
                                           strength TINYINT NOT NULL COMMENT '强度',
                                           start_time DATETIME NOT NULL COMMENT '每次启动治疗时间',
                                           user_id int COMMENT '用户id',
                                           dev_uuid varchar(64) DEFAULT NULL COMMENT '设备id',
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES edp_user (id)
  )