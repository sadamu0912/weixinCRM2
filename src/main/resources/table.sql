CREATE TABLE `user` (
  `increment_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(33) NOT NULL,
  `user_name` varchar(33) NOT NULL,
  `password` varchar(33) DEFAULT '1' COMMENT '是否启用',
  `del` int(5) DEFAULT NULL COMMENT '头像',
  `create_userid` varchar(33) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_userid` varchar(33) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `user_number` varchar(33) DEFAULT NULL,
  `enable` int(5) DEFAULT NULL,
  PRIMARY KEY (`increment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;



CREATE TABLE `conf_menu` (
  `increment_id` int(11) NOT NULL,
  `menu_id` varchar(32) NOT NULL,
  `menu_parentid` varchar(32) DEFAULT NULL,
  `menu_code` varchar(32) DEFAULT NULL,
  `menu_name` varchar(50) NOT NULL,
  `menu_icon` varchar(50) DEFAULT NULL,
  `menu_href` varchar(100) DEFAULT NULL,
  `target_type` varchar(32) NOT NULL,
  `menu_depth` int(5) DEFAULT NULL,
  `menu_order` int(3) NOT NULL,
  `menu_desc` varchar(200) DEFAULT NULL,
  `menu_parentcode` varchar(32) DEFAULT NULL,
  `create_userid` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_userid` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `module_id` varchar(32) DEFAULT NULL,
  `del` int(5) NOT NULL,
  PRIMARY KEY (`increment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



