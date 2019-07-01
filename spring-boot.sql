/*
Navicat MySQL Data Transfer

Source Server         : centos
Source Server Version : 80012
Source Host           : 192.168.231.128:3306
Source Database       : spring-boot

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-06-23 21:28:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '小韩', '北京海淀区');
INSERT INTO `user` VALUES ('2', '小石', '北京昌平区');
INSERT INTO `user` VALUES ('3', '小陈', '北京顺义区');
