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
  PRIMARY KEY (`increment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

